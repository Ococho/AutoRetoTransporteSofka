package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal extends PageObject {
    public static Target BIENVENIDA = Target.the("Mensaje bienvenida")
            .located(By.xpath("//h1[@class='mat-headline-2']"));
}
