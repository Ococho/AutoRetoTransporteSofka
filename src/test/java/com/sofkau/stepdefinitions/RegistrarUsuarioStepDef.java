package com.sofkau.stepdefinitions;

import com.sofkau.setup.WebSetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.frontend.CamposInvalidosMensaje.camposInvalidosMensaje;
import static com.sofkau.questions.frontend.ConfirmacionRegistroMensaje.confirmacionRegistroMensaje;
import static com.sofkau.tasks.frontend.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.frontend.IrARegistro.irARegistro;
import static com.sofkau.tasks.frontend.RegistrarUsuario.registrarUsuario;
import static com.sofkau.tasks.frontend.RegistrarUsuarioInvalido.registrarUsuarioInvalido;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.*;

public class RegistrarUsuarioStepDef extends WebSetup {
    private final Logger log = LoggerFactory.getLogger(RegistrarUsuarioStepDef.class);

    @Dado("que estoy en la pagina de registro")
    public void queEstoyEnLaPaginaDeRegistro() {
        try {
            log.info("Iniciando caso");
            setupNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial(),
                    irARegistro()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Cuando("ingreso datos de registro validos")
    public void ingresoDatosDeRegistroValidos() {
        try {
            log.info("Llenando formulario válido");
            theActorInTheSpotlight().attemptsTo(
                    registrarUsuario()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Entonces("sere redirigido al area de inicio de sesion")
    public void sereRedirigidoAlAreaDeInicioDeSesion() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(confirmacionRegistroMensaje(), containsString("Registro exitoso!"))
            );
            log.info("Test pasado");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        } finally {
            log.info("Test completado");
            quitarControlador();
        }
    }

    @Cuando("ingreso mis nombres {string}, apellidos {string}, correo {string}, contrasenna {string} con su confirmacion {string}")
    public void ingresoMisNombresApellidosCorreoContrasennaConSuConfirmacion(String nombres, String apellidos, String correo, String contrasenna, String cContrasenna) {
        try {
            log.info("Llenando formulario inválido");
            theActorInTheSpotlight().attemptsTo(
                    registrarUsuarioInvalido(nombres, apellidos, correo, contrasenna, cContrasenna)
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Entonces("recibire un mensaje {string} que me indica que la informacion ingresada es invalida")
    public void recibireUnMensajeQueMeIndicaQueLaInformacionIngresadaEsInvalida(String mensaje) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(camposInvalidosMensaje(), equalTo(mensaje))
            );
            log.info("Test pasado");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        } finally {
            log.info("Test completado");
            quitarControlador();
        }
    }
}