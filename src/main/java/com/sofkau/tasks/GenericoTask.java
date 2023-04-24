package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GenericoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}