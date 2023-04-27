package com.sofkau.stepdefinitions;

import com.sofkau.models.backend.Envio;
import com.sofkau.models.backend.Usuario;
import com.sofkau.setup.APISetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.tasks.backend.EnviarPut.enviarPut;
import static com.sofkau.util.Constantes.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;

public class ActualizarUsuarioStepDef extends APISetup {
    private final Logger log = LoggerFactory.getLogger(ActualizarEnvioStepDef.class);

    @Dado("que tengo acceso a la ruta de la API modificar usuario")
    public void queTengoAccesoALaRutaDeLaAPIModificarUsuario() {
        try {
            log.info("Iniciando caso");
            setUp(API_URL_BASE);
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Cuando("modifico los datos rol de usuario {int}, nombres {string}, dni {string}, correo {string}, contrasenna {string} y telefono {string} del usuario {string}")
    public void modificoLosDatosRolDeUsuarioNombresDniCorreoContrasennaYTelefonoDelUsuario(Integer rol, String nombres, String dni, String correo, String contrasenna, String telefono, String usuario) {
        try {
            Usuario actualizarUsuario = new Usuario();
            actualizarUsuario.setRol(rol);
            actualizarUsuario.setNombres(nombres);
            actualizarUsuario.setDni(dni);
            actualizarUsuario.setCorreo(correo);
            actualizarUsuario.setContrasenna(contrasenna);
            actualizarUsuario.setTelefono(telefono);
            actor.attemptsTo(
                    enviarPut().alRecurso(API_URL_ACTUALIZAR_USUARIO + usuario).yConElCuerpo(actualizarUsuario)
            );
            log.info("Se envió la petición PUT");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Entonces("vere el codigo de estado {int}")
    public void vereElCodigoDeEstado(Integer codigo) {
        try {
            actor.should(
                    seeThatResponse("Código de modificación OK",
                            response -> response.statusCode(codigo))
            );
            log.info("Código 200 OK recibido");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Y("los campos admitidos seran validos")
    public void losCamposAdmitidosSeranValidos() {
        try {
            actor.should(
                    seeThatResponse("Ver información modificada",
                            response -> response
                                    .body("_id", matchesRegex("^[a-zA-Z0-9]+$"))
                                    .body("contrasenna", matchesRegex("^[a-zA-Z0-9]+$"))
                                    .body("nombres", isA(String.class))
                                    .body("nombres", matchesRegex("^[a-zA-Z\u00C0-\u00FF ]+$"))
                                    .body("apellidos", isA(String.class))
                                    .body("apellidos", matchesRegex("^[a-zA-Z\u00C0-\u00FF ]+$"))
                                    .body("dni", matchesRegex("^[a-zA-Z0-9]+$"))
                                    .body("correo", matchesRegex("^[a-zA-Z0-9\\-._]+@[a-zA-Z._]+\\.[a-zA-Z]{2,3}$"))
                                    .body("telefono", isA(String.class))
                                    .body("telefono", matchesRegex("^[0-9]+$"))
                                    .body("rol", equalTo(0))
                                    .body("nombreUsuario", isA(String.class))
                                    .body("nombreUsuario", matchesRegex("^[a-zA-Z\u00C0-\u00FF ]+$"))
                    )
            );
            log.info("Usuario actualizado");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        } finally {
            log.info("Test completado");
        }
    }
}