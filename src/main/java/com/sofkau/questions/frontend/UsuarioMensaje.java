package com.sofkau.questions.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaPrincipal.USUARIO;

public class UsuarioMensaje implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return USUARIO.resolveFor(actor).getText();
    }

    public static UsuarioMensaje usuarioMensaje() {
        return new UsuarioMensaje();
    }
}