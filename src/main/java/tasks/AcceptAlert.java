package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import org.openqa.selenium.Alert;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AcceptAlert implements Task {

    @Override
    @Subject("accept the alert")
    public <T extends Actor> void performAs(T actor) {
        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alert.accept();
    }

    public static AcceptAlert now() {
        return new AcceptAlert();
    }
}
