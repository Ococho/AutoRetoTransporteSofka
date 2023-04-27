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

    public static Target MENSAJE_CONFIRMACION = Target.the("Mensaje de confirmación de registro")
            .located(By.xpath("//div[contains(@class,'toast-title')]"));

    public static Target TEXTO_INICIO_SESION = Target.the("Texto inicio de sesión")
            .located(By.xpath("//mat-card-title[@class='mat-mdc-card-title card-title-text']"));

}