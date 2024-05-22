package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import userinterfaces.LogIn;

public class IniciarSesion implements Task {

    private final String username;
    private final String password;

    public IniciarSesion(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(LogIn.LOG_IN), Click.on(LogIn.LOG_IN));
        actor.attemptsTo(Enter.theValue(username).into(LogIn.LOG_IG_USER_NAME));
        actor.attemptsTo(Enter.theValue(password).into(LogIn.LOG_IG_PASSWORD));
        actor.attemptsTo(MoveMouse.to(LogIn.LOG_IN_BUTTON), Click.on(LogIn.LOG_IN_BUTTON));



    }

    public static IniciarSesion conLosDatos(String username, String password) {
        return Tasks.instrumented(IniciarSesion.class, username, password);
    }


}
