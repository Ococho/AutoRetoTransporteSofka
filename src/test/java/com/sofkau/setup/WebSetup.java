package com.sofkau.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.sofkau.util.Constantes.ACTOR_WEB;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WebSetup {
    @Managed
    protected WebDriver webDriver;

    protected void setupNavegador() {
        configurarControlador();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR_WEB).can(BrowseTheWeb.with(webDriver));
        maximizar(webDriver);
    }

    private void configurarControlador() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*", "--incognito");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(opt);
    }

    private static void maximizar(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void quitarControlador() {
        webDriver.quit();
    }
}