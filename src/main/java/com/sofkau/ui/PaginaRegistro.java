package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    public static Target NOMBRES = Target.the("Campo de Nombres del usuario")
            .located(By.xpath("(//input[contains(@type,'text')])[1]"));

    public static Target APELLIDOS = Target.the("Campo de Apellidos del usuario")
            .located(By.xpath("(//input[contains(@type,'text')])[2]"));

    public static Target CORREO = Target.the("Campo de Correo del usuario")
            .located(By.xpath("//input[contains(@type,'email')]"));

    public static Target CONTRASENNA = Target.the("Campo de Contraseña del usuario")
            .located(By.xpath("(//input[contains(@type,'password')])[1]"));

    public static Target C_CONTRASENNA = Target.the("Campo de Confirmar contraseña del usuario")
            .located(By.xpath("(//input[contains(@type,'password')])[2]"));

    public static Target BOTON_REGISTRARSE = Target.the("Botón Registrar Usuario")
            .located(By.xpath("(//button[@type='submit'])[1]"));

    public static Target MENSAJE_ERROR = Target.the("Mensaje de error en campos")
            .located(By.cssSelector("div.error-list>div:nth-child(1)"));
}