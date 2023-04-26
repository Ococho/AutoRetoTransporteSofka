package com.sofkau.setup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.sofkau.util.Constantes.ACTOR_API;

public class APISetup {
    protected Actor actor = new Actor(ACTOR_API);

    protected void setUp(String urlBase) {
        actorCallAnApi(urlBase);
    }

    private void actorCallAnApi(String urlBase) {
        actor.can(CallAnApi.at(urlBase));
    }
}