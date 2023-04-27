package com.sofkau.tasks.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaIniciarSesion.*;

public class IniciarSesion implements Task {
    private String correo;
    private String contrasenna;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(correo).into(CORREO),
                Enter.theValue(contrasenna).into(CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION)
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
