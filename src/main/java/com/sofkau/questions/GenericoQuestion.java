package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GenericoQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}