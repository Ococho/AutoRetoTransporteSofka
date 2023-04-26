package com.sofkau.tasks.backend;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

public class EnviarPut implements Task {
    private String recurso;
    private Object cuerpo;

    public EnviarPut alRecurso(String recurso) {
        this.recurso = recurso;
        return this;
    }

    public EnviarPut yConElCuerpo(Object cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to(recurso)
                        .with(
                                requestSpecification -> requestSpecification.relaxedHTTPSValidation()
                                        .contentType(ContentType.JSON)
                                        .body(cuerpo)
                        )
        );
    }

    public static EnviarPut enviarPut() {
        return new EnviarPut();
    }
}