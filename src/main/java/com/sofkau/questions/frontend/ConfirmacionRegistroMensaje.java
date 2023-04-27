package com.sofkau.questions.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaIniciarSesion.MENSAJE_CONFIRMACION;

public class ConfirmacionRegistroMensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION.resolveFor(actor).getText();
    }

    public static ConfirmacionRegistroMensaje confirmacionRegistroMensaje() {
        return new ConfirmacionRegistroMensaje();
    }
}