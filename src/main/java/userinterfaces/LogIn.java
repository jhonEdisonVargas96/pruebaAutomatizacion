package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LogIn extends PageObject {

    public static final Target LOG_IN = Target.the("Log In").locatedBy("id:login2");

    public static final Target LOG_IG_USER_NAME = Target.the("loginusername").locatedBy("id:loginusername");

    public static final Target LOG_IG_PASSWORD = Target.the("loginpassword").locatedBy("id:loginpassword");

    public static final Target LOG_IN_BUTTON = Target.the("Log In Button").locatedBy("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    public static final Target WELCOME_USER = Target.the("Welcomer User").locatedBy("id:nameofuser");

    public static final Target LOG_OUT = Target.the("Log Out").locatedBy("id:logout2");
}
