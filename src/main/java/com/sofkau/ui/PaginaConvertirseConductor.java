package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaConvertirseConductor extends PageObject {

    public static Target TELEFONO = Target.the("Campo teléfono")
            .located(By.xpath("(//input[@type='text'])[1]"));

    public static Target DNI = Target.the("Campo DNI")
            .located(By.xpath("(//input[@type='text'])[2]"));

    public static Target BOTON_ACTUALIZAR = Target.the("Botón actualizar")
            .located(By.xpath("//button[@type='submit']"));
}
