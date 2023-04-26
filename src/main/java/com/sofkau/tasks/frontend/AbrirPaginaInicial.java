package com.sofkau.tasks.frontend;

import com.sofkau.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaInicial implements Task {
    private PaginaInicial paginaInicial;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaInicial)
        );
    }

    public static AbrirPaginaInicial abrirPaginaInicial() {
        return new AbrirPaginaInicial();
    }
}