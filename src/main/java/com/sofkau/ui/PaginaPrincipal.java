package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal extends PageObject {
    public static Target BIENVENIDA = Target.the("Mensaje bienvenida")
            .located(By.xpath("//h1[contains(@class,'fw-normal')]"));

    public static Target USUARIO = Target.the("Nombre del usuario")
            .located(By.cssSelector(".navbar-nombreUsuario-text"));
}
