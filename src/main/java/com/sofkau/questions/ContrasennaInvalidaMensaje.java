package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaIniciarSesion.MENSAJE_ERROR_CONTRASENNA;;

public class ContrasennaInvalidaMensaje implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_ERROR_CONTRASENNA.resolveFor(actor).getText();
    }

    public static ContrasennaInvalidaMensaje contrasennaInvalidaMensaje() {
        return new ContrasennaInvalidaMensaje();
    }
}
