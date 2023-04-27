package com.sofkau.tasks.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaConvertirseConductor.*;

public class ConvertirseConductor implements Task {
    private final String telefono;
    private final String dni;

    public ConvertirseConductor (String telefono, String dni){
        this.telefono = telefono;
        this.dni = dni;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(telefono).into(TELEFONO),
                Enter.theValue(dni).into(DNI),
                Click.on(BOTON_ACTUALIZAR)
        );
    }

    public static ConvertirseConductor convertirseConductor(String telefono, String dni) {
        return new ConvertirseConductor(telefono, dni);
    }
}
