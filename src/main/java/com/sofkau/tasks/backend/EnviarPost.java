package com.sofkau.tasks.backend;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class EnviarPost implements Task {

    private String recurso;
    private Object cuerpo;

    public EnviarPost alRecurso(String recurso) {
        this.recurso = recurso;
        return this;
    }

    public EnviarPost yConElCuerpo(Object cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(recurso)
                        .with(
                                requestSpecification -> requestSpecification.relaxedHTTPSValidation()
                                        .contentType(ContentType.JSON)
                                        .body(cuerpo)
                        )
        );
    }

    public static EnviarPost enviarPost() {
        return new EnviarPost();
    }
}