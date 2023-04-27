package com.sofkau.tasks.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaInicial.BOTON_INICIAR_SESION;

public class IrAIniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_INICIAR_SESION)
        );
    }

    public static IrAIniciarSesion irAIniciarSesion() {
        return new IrAIniciarSesion();
    }
}
