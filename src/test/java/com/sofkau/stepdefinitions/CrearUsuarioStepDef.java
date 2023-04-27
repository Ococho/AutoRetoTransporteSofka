package com.sofkau.stepdefinitions;

import com.github.javafaker.Faker;
import com.sofkau.models.backend.Usuario;
import com.sofkau.setup.APISetup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

import static com.sofkau.tasks.backend.EnviarPost.enviarPost;
import static com.sofkau.util.Constantes.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;

public class CrearUsuarioStepDef extends APISetup {
    private final Logger log = LoggerFactory.getLogger(CrearUsuarioStepDef.class);
    private static final Faker faker = new Faker(new Locale("es-MX"));

    @Dado("que tengo acceso a la ruta de la API registro")
    public void queTengoAccesoALaRutaDeLaAPIRegistro() {
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

    @Cuando("envio datos de registro validos")
    public void envioDatosDeRegistroValidos() {
        try {
            Usuario crearUsuario = new Usuario();
            crearUsuario.setRol(0);
            crearUsuario.setNombres(faker.name().firstName() + " " + faker.name().lastName());
            crearUsuario.setDni(faker.number().digits(10));
            crearUsuario.setCorreo(faker.internet().emailAddress());
            crearUsuario.setContrasenna(faker.internet().password());
            crearUsuario.setTelefono(faker.number().digits(10));
            log.info(crearUsuario.getContrasenna());

            actor.attemptsTo(
                    enviarPost().alRecurso(API_URL_REGISTRAR_USUARIO).yConElCuerpo(crearUsuario)
            );
            log.info("Se envió la petición POST");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Entonces("podre visualizar un codigo de estado <{int}>")
    public void podreVisualizarUnCodigoDeEstado(Integer codigo) {
        try {
            actor.should(
                    seeThatResponse("Código de solicitud created",
                            response -> response.statusCode(codigo)
                                    .body("_id", matchesRegex("^[a-zA-Z0-9]+$"))
                                    .body("contrasenna", matchesRegex("^[a-zA-Z0-9]+$"))
                                    .body("nombres", isA(String.class))
                                    .body("nombres", matchesRegex("^[a-zA-Z\u00C0-\u00FF ]+$"))
                                    .body("apellidos", isA(String.class))
                                    .body("apellidos", matchesRegex("^[a-zA-Z\u00C0-\u00FF ]+$"))
                                    .body("dni", matchesRegex("^[a-zA-Z0-9]+$"))
                                    .body("correo", matchesRegex("^[a-zA-Z0-9\\-._]+@[a-zA-Z._]+\\.[a-zA-Z]{2,3}$"))
                                    .body("telefono", isA(String.class))
                                    .body("telefono", matchesRegex("^[0-9 ]+$"))
                                    .body("rol", equalTo(10))
                                    .body("nombreUsuario", isA(String.class))
                                    .body("nombreUsuario", matchesRegex("^[a-zA-Z\u00C0-\u00FF ]+$"))
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

    @Cuando("envio informacion invalida")
    public void envioInformacionInvalida() {
        try {
            Usuario crearUsuario = new Usuario();
            crearUsuario.setRol(0);
            crearUsuario.setNombres(faker.name().lastName());
            crearUsuario.setDni(faker.letterify("???"));
            crearUsuario.setCorreo(faker.name().firstName());
            crearUsuario.setContrasenna(" ");
            crearUsuario.setTelefono(faker.letterify("???"));
            log.info(crearUsuario.toString());

            actor.attemptsTo(
                    enviarPost().alRecurso(API_URL_REGISTRAR_USUARIO).yConElCuerpo(crearUsuario)
            );
            log.info("Se envió la petición POST");
        } catch (Exception e) {
            log.error("ERROR");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
        }
    }

    @Entonces("podre ver un codigo de estado <{int}>")
    public void podreVerUnCodigoDeEstado(Integer codigo) {
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