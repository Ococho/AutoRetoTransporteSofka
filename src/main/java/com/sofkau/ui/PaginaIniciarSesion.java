package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaIniciarSesion extends PageObject {
    public static Target CORREO = Target.the("Campo de correo del usuario")
            .located(By.xpath("//input[contains(@type,'email')]"));

    public static Target CONTRASENNA = Target.the("Campo de contraseña del usuario")
            .located(By.xpath("//input[contains(@type,'password')]"));

    public static Target BOTON_INICIAR_SESION = Target.the("Botón de Iniciar sesión")
            .located(By.xpath("(//button[contains(@type,'submit')])[1]"));

    public static Target MENSAJE_ERROR_CONTRASENNA = Target.the("Mensaje de error de la contraseña")
            .located(By.cssSelector("div.error-list>div:nth-child(1)"));
}