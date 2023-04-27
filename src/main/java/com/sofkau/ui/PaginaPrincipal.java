package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal extends PageObject {
    public static Target BIENVENIDA = Target.the("Mensaje bienvenida")
            .located(By.cssSelector("h1.mat-headline-2"));

    public static Target USUARIO = Target.the("Nombre del usuario")
            .located(By.cssSelector(".navbar-nombreUsuario-text"));

}