package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio extends PageObject {

    public static final Target SIGN_UP = Target.the("Sign Up").locatedBy("id:signin2");

    public static final Target USER_NAME = Target.the("username").locatedBy("id:sign-username");

    public static final Target PASSWORD = Target.the("password").locatedBy("id:sign-password");

    public static final Target REGISTER = Target.the("Register").locatedBy("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

}
