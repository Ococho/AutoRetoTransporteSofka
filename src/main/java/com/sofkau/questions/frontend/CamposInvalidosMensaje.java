package com.sofkau.questions.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaRegistro.MENSAJE_ERROR;

public class CamposInvalidosMensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_ERROR.resolveFor(actor).getText();
    }

    public static CamposInvalidosMensaje camposInvalidosMensaje() {
        return new CamposInvalidosMensaje();
    }
}