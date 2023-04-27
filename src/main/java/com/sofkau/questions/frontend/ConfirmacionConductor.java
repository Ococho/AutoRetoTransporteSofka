package com.sofkau.questions.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaIniciarSesion.TEXTO_INICIO_SESION;

public class ConfirmacionConductor implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TEXTO_INICIO_SESION.resolveFor(actor).getText();
    }

    public static ConfirmacionConductor confirmacionConductor() {
        return new ConfirmacionConductor();
    }
}
