package com.prueba.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TextOf;
import tasks.IniciarSesion;
import tasks.RealizarRegistro;
import userinterfaces.LogIn;

import static org.hamcrest.core.IsEqual.equalTo;

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

    @Y("^me logueo con los datos \"([^\"]*)\" y \"([^\"]*)\"$")
    public void meLogueoConLosDatosY(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.conLosDatos(username, password));
    }

    @Entonces("^puedo ver el mensaje \"([^\"]*)\"$")
    public void puedoVerElMensaje(String welcomeUser) {
        String actualWelcomeUserText = TextOf.field(LogIn.WELCOME_USER).answeredBy(OnStage.theActorInTheSpotlight());

        assertEquals(welcomeUser, actualWelcomeUserText);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        OnStage.theActorInTheSpotlight().attemptsTo(MoveMouse.to(LogIn.LOG_OUT), Click.on(LogIn.LOG_OUT));
    }



}
