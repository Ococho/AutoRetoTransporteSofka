package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static Target BOTON_REGISTRO = Target.the("Botón de registro")
            .located(By.xpath("//a[@routerlink='/registro']"));
}