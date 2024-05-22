package com.prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.RealizarRegistro;

public class DemoBlazeAutomatizacionStepDefinition {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me conecto a la pagina \"([^\"]*)\"$")
    public void queMeConectoALaPagina(String url) {

        OnStage.theActorCalled("Jhon Osorio").wasAbleTo(Open.url(url));

    }

    @Cuando("^me registro con \"([^\"]*)\" y \"([^\"]*)\"$")
    public void meRegistroConY(String username, String password) {

        OnStage.theActorInTheSpotlight().attemptsTo(RealizarRegistro.conLosDatos(username, password));

    }

    @Y("^me logueo con los datos$")
    public void meLogueoConLosDatos() {

    }

    @Entonces("^puedo ver el mensaje \"([^\"]*)\"$")
    public void puedoVerElMensaje(String arg1) {

    }



}
