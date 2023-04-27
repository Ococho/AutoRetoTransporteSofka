package com.sofkau.runners.backend;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/backend"},
        glue = {"com.sofkau.stepdefinitions"},
        tags = "@ModificacionUsuario"
)
public class ActualizarUsuarioTest {
}