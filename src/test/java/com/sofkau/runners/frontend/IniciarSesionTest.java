package com.sofkau.runners.frontend;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/frontend"},
        glue = {"com.sofkau.stepdefinitions"},
        tags = "@InicioSesionInvalido or @InicioSesionValido"
)
public class IniciarSesionTest {
}