package com.sofkau.tasks.frontend;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRegistro.*;
import static com.sofkau.ui.PaginaRegistro.BOTON_REGISTRARSE;

public class RegistrarUsuarioInvalido implements Task {
    private final String nombres;
    private final String apellidos;
    private final String correo;
    private final String contrasenna;
    private final String cContrasenna;

    public RegistrarUsuarioInvalido(String nombres, String apellidos, String correo, String contrasenna, String cContrasenna) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenna = contrasenna;
        this.cContrasenna = cContrasenna;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombres).into(NOMBRES),
                Enter.theValue(apellidos).into(APELLIDOS),
                Enter.theValue(correo).into(CORREO),
                Enter.theValue(contrasenna).into(CONTRASENNA),
                Enter.theValue(cContrasenna).into(C_CONTRASENNA),
                Click.on(BOTON_REGISTRARSE)
        );
    }

    public static RegistrarUsuarioInvalido registrarUsuarioInvalido(String nombres, String apellidos, String correo, String contrasenna, String cContrasenna) {
        return new RegistrarUsuarioInvalido(nombres, apellidos, correo, contrasenna, cContrasenna);
    }
}