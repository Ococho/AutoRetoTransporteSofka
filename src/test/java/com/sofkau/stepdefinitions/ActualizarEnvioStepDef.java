package com.sofkau.stepdefinitions;

import com.sofkau.models.backend.Envio;
import com.sofkau.setup.APISetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.tasks.backend.EnviarPut.enviarPut;
import static com.sofkau.util.Constantes.API_URL_ACTUALIZAR_ENVIO;
import static com.sofkau.util.Constantes.API_URL_BASE;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;

public class ActualizarEnvioStepDef extends APISetup {
    private final Logger log = LoggerFactory.getLogger(ActualizarEnvioStepDef.class);

    @Dado("que tengo acceso a la ruta de la API actualizar envio")
    public void queTengoAccesoALaRutaDeLaAPIActualizarEnvio() {
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

    @Cuando("modifico los datos ID de usuario {string}, origen {string}, destino {string}, peso {int} del envio {string}")
    public void modificoLosDatosIDDeUsuarioUsuarioOrigenOrigenDestinoDestinoPesoPesoDelEnvioId(String usuario, String origen, String destino, Integer peso, String envio) {
        try {
            Envio envioAModificar = new Envio();
            envioAModificar.setUsuarioId(usuario);
            envioAModificar.setOrigen(origen);
            envioAModificar.setDestino(destino);
            envioAModificar.setPeso(peso);
            actor.attemptsTo(
                    enviarPut().alRecurso(API_URL_ACTUALIZAR_ENVIO + envio).yConElCuerpo(envioAModificar)
            );
            log.info("Se envió la petición PUT");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Entonces("visualizare un codigo de estado {int}")
    public void visualizareUnCodigoDeEstadoCodigo(Integer codigo) {
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

    @Y("los campos recibidos seran validos")
    public void losCamposRecibidosSeranValidos() {
        try {
            actor.should(
                    seeThatResponse("Ver información anterior",
                            response -> response
                                    .body("_id", matchesRegex("^[a-zA-Z0-9]+$"))
                                    .body("usuarioId", matchesRegex("^[a-zA-Z]+$"))
                                    .body("fecha", isA(Long.class))
                                    .body("fecha", greaterThan(0L))
                                    .body("peso", isA(Integer.class))
                                    .body("peso", greaterThan(0))
                                    .body("origen", isA(String.class))
                                    .body("origen", matchesRegex("^[a-zA-Z ]{3,50}$"))
                                    .body("destino", isA(String.class))
                                    .body("destino", matchesRegex("^[a-zA-Z ]{3,50}$"))
                    )
            );
            log.info("");
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