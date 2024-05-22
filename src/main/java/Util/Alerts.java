package Util;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;

public class Alerts {


    public static Performable acceptAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

}
