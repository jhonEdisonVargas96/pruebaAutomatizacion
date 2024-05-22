package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import userinterfaces.PaginaInicio;

public class RealizarRegistro implements Task {

    public String username;
    public String password;

    public RealizarRegistro(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(PaginaInicio.SIGN_UP), Click.on(PaginaInicio.SIGN_UP));
        actor.attemptsTo(Enter.theValue(username).into(PaginaInicio.USER_NAME));
        actor.attemptsTo(Enter.theValue(password).into(PaginaInicio.PASSWORD));
    }

    public static RealizarRegistro conLosDatos(String username, String password) {
        return Tasks.instrumented(RealizarRegistro.class, username, password);
    }


}
