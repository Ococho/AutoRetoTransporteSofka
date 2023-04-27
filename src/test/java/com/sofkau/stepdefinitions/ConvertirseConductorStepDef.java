package com.sofkau.stepdefinitions;

import com.sofkau.setup.WebSetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.frontend.CamposInvalidosMensaje.camposInvalidosMensaje;
import static com.sofkau.questions.frontend.ConfirmacionConductor.confirmacionConductor;
import static com.sofkau.tasks.frontend.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.frontend.ConvertirseConductor.convertirseConductor;
import static com.sofkau.tasks.frontend.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.frontend.IrAConvertirseConductor.irAConvertirseConductor;
import static com.sofkau.tasks.frontend.IrAIniciarSesion.irAIniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ConvertirseConductorStepDef extends WebSetup {
    private final Logger log = LoggerFactory.getLogger(RegistrarUsuarioStepDef.class);

    @Dado("que ya inicie sesion como usuario")
    public void queYaInicieSesionComoUsuario() {
        try {
            log.info("Iniciando caso");
            setupNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial(),
                    irAIniciarSesion(),
                    iniciarSesion("javier.cabrera@yahoo.com", "jqjmk6gf7w27cf")
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Cuando("ingreso a la pagina de registro de conductor")
    public void ingresoALaPaginaDeRegistroDeConductor() {
        try {
            log.info("Ingresando a formulario de conductor");
            theActorInTheSpotlight().attemptsTo(
                    irAConvertirseConductor()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Y("completo credenciale validas")
    public void completoCredencialeValidas() {
        try {
            log.info("Llenando formulario de conductor");
            theActorInTheSpotlight().attemptsTo(
                    convertirseConductor("31578452", "2856354")
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Entonces("sere redirigido a la pagina de iniciar sesion")
    public void sereRedirigidoALaPaginaDeIniciarSesion() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(confirmacionConductor(), equalTo("Inicio de Sesi\u00F3n"))
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

    @Dado("que inicie sesion como usuario {string} con contrasenna {string}")
    public void queInicieSesionComoUsuarioCorreoConContrasennaContrasenna(String correo, String contrasenna) {
        try {
            log.info("Iniciando caso");
            setupNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    abrirPaginaInicial(),
                    irAIniciarSesion(),
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

    @Cuando("accedo a la pagina de registro de conductor")
    public void accedoALaPaginaDeRegistroDeConductor() {
        try {
            log.info("Ingresando a formulario de conductor");
            theActorInTheSpotlight().attemptsTo(
                    irAConvertirseConductor()
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Y("completo los campos de telefono {string} con dni {string}")
    public void completoLosCamposDeTelefonoTelefonoConDniDni(String telefono, String dni) {
        try {
            log.info("Llenando formulario de conductor");
            theActorInTheSpotlight().attemptsTo(
                    convertirseConductor(telefono, dni)
            );
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitarControlador();
            Assertions.fail();
        }
    }

    @Entonces("podre visualizar un mensaje {string}")
    public void podreVisualizarUnMensajeMensaje(String mensaje) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(camposInvalidosMensaje(), CoreMatchers.equalTo(mensaje))
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