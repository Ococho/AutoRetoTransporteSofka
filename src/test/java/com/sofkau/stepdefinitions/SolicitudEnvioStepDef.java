package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.models.backend.Envio;
import com.sofkau.setup.APISetup;
import com.sofkau.setup.WebSetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

import static com.sofkau.tasks.backend.EnviarPost.enviarPost;
import static com.sofkau.util.Constantes.API_URL_BASE;
import static com.sofkau.util.Constantes.API_URL_REGISTRAR_ENVIO;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.isA;

public class SolicitudEnvioStepDef extends APISetup {
    private final Logger log = LoggerFactory.getLogger(SolicitudEnvioStepDef.class);
    private static final Faker faker = new Faker(new Locale("es-MX"));

    @Dado("que tengo acceso a la ruta de la API registrar envio")
    public void queTengoAccesoALaRutaDeLaAPIRegistrarEnvio() {
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

    @Cuando("mis datos de carga enviados son validos")
    public void misDatosDeCargaEnviadosSonValidos() {
        try {
            Envio envioSolicitud = new Envio();
            envioSolicitud.setUsuarioId(faker.letterify("?" + faker.name().lastName(), true));
            envioSolicitud.setOrigen(faker.address().latitude().replace(',', '.') + ", " + faker.address().longitude().replace(',', '.'));
            envioSolicitud.setDestino(faker.address().latitude().replace(',', '.') + ", " + faker.address().longitude().replace(',', '.'));
            envioSolicitud.setPeso(faker.number().numberBetween(1, 999));

            actor.attemptsTo(
                    enviarPost().alRecurso(API_URL_REGISTRAR_ENVIO).yConElCuerpo(envioSolicitud)
            );
            log.info("Se envió la petición POST");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Entonces("visualizare el codigo de estado <{int}>")
    public void visualizareElCodigoDeEstado(Integer codigo) {
        try {
            actor.should(
                    seeThatResponse("Código de solicitud created",
                            response -> response.statusCode(codigo)
                                    .body("_id", matchesRegex("^[a-zA-Z0-9]+$"))
                                    .body("usuarioId", matchesRegex("^[a-zA-Z\u00C0-\u00FF ]+$"))
                                    .body("fecha", isA(Long.class))
                                    .body("fecha", greaterThan(0L))
                                    .body("peso", isA(Integer.class))
                                    .body("peso", greaterThan(0))
                                    .body("origen", notNullValue())
                                    .body("destino", notNullValue())
                    )

            );
            log.info("Código 201 created recibido");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Cuando("mis datos de carga enviados son invalidos")
    public void misDatosDeCargaEnviadosSonInvalidos() {
        try {
            Envio envioSolicitud = new Envio();
            envioSolicitud.setUsuarioId(faker.numerify("#" + faker.name().lastName()));
            envioSolicitud.setOrigen(faker.country().capital());
            envioSolicitud.setDestino(faker.country().capital());
            envioSolicitud.setPeso(faker.number().numberBetween(-100, 0));

            actor.attemptsTo(
                    enviarPost().alRecurso(API_URL_REGISTRAR_ENVIO).yConElCuerpo(envioSolicitud)
            );
            log.info("Se envió la petición POST");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Entonces("visualizare un codigo de estado <{int}>")
    public void visualizareUnCodigoDeEstado(Integer codigo) {
        try {
            actor.should(
                    seeThatResponse("Código de solicitud bad request",
                            response -> response.statusCode(codigo))
            );
            log.info("Código 400 bad request recibido");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }
}