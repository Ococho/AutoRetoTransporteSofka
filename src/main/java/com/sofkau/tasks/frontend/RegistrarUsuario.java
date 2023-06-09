package com.sofkau.tasks.frontend;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Locale;

import static com.sofkau.ui.PaginaIniciarSesion.MENSAJE_CONFIRMACION;
import static com.sofkau.ui.PaginaRegistro.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RegistrarUsuario implements Task {
    private static final Faker faker = new Faker(new Locale("es-MX"));
    private final String contrasenna = faker.internet().password();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(faker.name().firstName() + " " + faker.name().firstName()).into(NOMBRES),
                Enter.theValue(faker.name().lastName() + " " + faker.name().lastName()).into(APELLIDOS),
                Enter.theValue(faker.internet().emailAddress()).into(CORREO),
                Enter.theValue(contrasenna).into(CONTRASENNA),
                Enter.theValue(contrasenna).into(C_CONTRASENNA),
                Click.on(BOTON_REGISTRARSE),
                WaitUntil.the(MENSAJE_CONFIRMACION, isPresent())
        );
    }

    public static RegistrarUsuario registrarUsuario() {
        return new RegistrarUsuario();
    }
}