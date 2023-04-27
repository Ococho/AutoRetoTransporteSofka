package com.sofkau.tasks.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaIniciarSesion.*;
import static com.sofkau.ui.PaginaPrincipal.BIENVENIDA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IniciarSesion implements Task {
    private final String correo;
    private final String contrasenna;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(correo).into(CORREO),
                Enter.theValue(contrasenna).into(CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION),
                WaitUntil.the(BIENVENIDA, isVisible())
        );
    }

    public static IniciarSesion iniciarSesion(String correo, String contrasenna) {
        return new IniciarSesion(correo, contrasenna);
    }

    public IniciarSesion (String correo, String contrasenna){
        this.correo = correo;
        this.contrasenna = contrasenna;
    }
}
