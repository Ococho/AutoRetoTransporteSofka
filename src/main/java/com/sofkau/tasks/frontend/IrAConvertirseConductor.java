package com.sofkau.tasks.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaPrincipal.BOTON_CONVERTIRSE_CONDUCTOR;

public class IrAConvertirseConductor implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CONVERTIRSE_CONDUCTOR)
        );
    }

    public static IrAConvertirseConductor irAConvertirseConductor() {
        return new IrAConvertirseConductor();
    }
}
