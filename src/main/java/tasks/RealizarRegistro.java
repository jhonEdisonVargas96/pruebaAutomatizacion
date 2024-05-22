package tasks;

import Util.Alerts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import userinterfaces.PaginaInicio;

public class RealizarRegistro implements Task {

    private String username;
    private String password;

    public RealizarRegistro(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(PaginaInicio.SIGN_UP), Click.on(PaginaInicio.SIGN_UP));
        actor.attemptsTo(Enter.theValue(username).into(PaginaInicio.USER_NAME));
        actor.attemptsTo(Enter.theValue(password).into(PaginaInicio.PASSWORD));
        actor.attemptsTo(Click.on(PaginaInicio.REGISTER));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //actor.attemptsTo(Switch.toAlert());
        //actor.attemptsTo(AcceptAlert.now());
        actor.attemptsTo(Alerts.acceptAlert());
    }

    public static RealizarRegistro conLosDatos(String username, String password) {
        return Tasks.instrumented(RealizarRegistro.class, username, password);
    }


}
