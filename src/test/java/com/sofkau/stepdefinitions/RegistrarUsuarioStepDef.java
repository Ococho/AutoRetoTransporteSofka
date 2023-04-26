package com.sofkau.stepdefinitions;

import com.sofkau.setup.WebSetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.tasks.frontend.AbrirPaginaInicial.abrirPaginaInicial;
import static com.sofkau.tasks.frontend.IrARegistro.irARegistro;
import static com.sofkau.tasks.frontend.RegistrarUsuario.registrarUsuario;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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

    @Entonces("sere redirigido al area de usuario")
    public void sereRedirigidoAlAreaDeUsuario() {
//        try {
//            log.info("Código 200 OK recibido");
//        } catch (Exception e) {
//            log.error("ERROR");
//            log.error(e.getMessage());
//            log.error(String.valueOf(e.getCause()));
//            quitarControlador();
//            Assertions.fail();
//        } finally {
//            quitarControlador();
//        }
    }

    @Cuando("ingreso informacion invalida")
    public void ingresoInformacionInvalida() {
    }

    @Entonces("recibire un mensaje que me indica que la informacion ingresada es invalida")
    public void recibireUnMensajeQueMeIndicaQueLaInformacionIngresadaEsInvalida() {
    }

    @Cuando("ingreso una contrasenna que no coincide")
    public void ingresoUnaContrasennaQueNoCoincide() {
    }

    @Entonces("recibire un mensaje indicando que las contrasennas no coinciden")
    public void recibireUnMensajeIndicandoQueLasContrasennasNoCoinciden() {
    }
}