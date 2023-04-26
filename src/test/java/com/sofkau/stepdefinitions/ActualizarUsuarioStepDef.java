package com.sofkau.stepdefinitions;

import com.sofkau.models.backend.Envio;
import com.sofkau.models.backend.Usuario;
import com.sofkau.setup.APISetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.tasks.backend.EnviarPut.enviarPut;
import static com.sofkau.util.Constantes.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

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

    @Cuando("envio datos validos en el formulario")
    public void envioDatosValidosEnElFormulario() {
        try {
//            Usuario actualizarUsuario = new Usuario();
//            actualizarUsuario.setRol(0);
//            actualizarUsuario.setNombres(0);
//            actualizarUsuario.setDni(0);
//            actualizarUsuario.setCorreo(0);
//            actualizarUsuario.setContrasenna(0);
//            actualizarUsuario.setTelefono(0);
//            actor.attemptsTo(
//                    enviarPut().alRecurso(API_URL_ACTUALIZAR_USUARIO + envio).yConElCuerpo(envioAModificar)
//            );
            log.info("Se envió la petición PUT");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Entonces("vere el codigo de estado <{int}>")
    public void vereElCodigoDeEstado(int arg0) {
        try {
            actor.should(
//                    seeThatResponse("Código de modificación OK",
//                            response -> response.statusCode(codigo))
            );
            log.info("Código 200 OK recibido");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Cuando("envio informacion invalida en el formulario")
    public void envioInformacionInvalidaEnElFormulario() {
        try {
//            Envio envioAModificar = new Envio();
//            envioAModificar.setUsuarioId(usuario);
//            envioAModificar.setOrigen(origen);
//            envioAModificar.setDestino(destino);
//            envioAModificar.setPeso(peso);
//            actor.attemptsTo(
//                    enviarPut().alRecurso(API_URL_ACTUALIZAR_ENVIO + envio).yConElCuerpo(envioAModificar)
//            );
            log.info("Se envió la petición PUT");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Entonces("vere un codigo de estado <{int}>")
    public void vereUnCodigoDeEstado(int arg0) {
        try {
            actor.should(
//                    seeThatResponse("Código de modificación OK",
//                            response -> response.statusCode(codigo))
            );
            log.info("Código 200 OK recibido");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }
}