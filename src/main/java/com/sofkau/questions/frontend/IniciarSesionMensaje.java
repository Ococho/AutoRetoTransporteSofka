package com.sofkau.questions.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaPrincipal.BIENVENIDA;

public class IniciarSesionMensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BIENVENIDA.resolveFor(actor).getText();
    }

    public static IniciarSesionMensaje iniciarSesionMensaje() {
        return new IniciarSesionMensaje();
    }
}