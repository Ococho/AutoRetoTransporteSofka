package com.sofkau.stepdefinitions;

import com.sofkau.setup.WebSetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.ContrasennaInvalidaMensaje.contrasennaInvalidaMensaje;
import static com.sofkau.tasks.frontend.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.frontend.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.frontend.IrAIniciarSesion.irAIniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class IniciarSesionStepDef extends WebSetup {
    private final Logger log = LoggerFactory.getLogger(IniciarSesionStepDef.class);

    @Dado("que estoy en la pagina de login")
    public void queEstoyEnLaPaginaDeLogin() {
        try {
            log.info("Iniciando caso");
            setupNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial(),
                    irAIniciarSesion()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Cuando("ingreso el usuario {string} con la contrasenna {string}")
    public void ingresoElUsuarioCorreoConLaContrasennaContrasenna(String correo, String contrasenna) {
        try {
            log.info("Llenando formulario válido");
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion(correo, contrasenna)
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Entonces("visualizare un mensaje de error {string}")
    public void visualizareUnMensajeDeError(String mensaje) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(contrasennaInvalidaMensaje(), equalTo(mensaje))
            );

        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        } finally {
            quitarControlador();
        }
    }
}