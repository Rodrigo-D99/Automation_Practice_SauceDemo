package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class LoginForm {
    static Target USER_FIELD = Target.the("user field").locatedBy("#user-name");
    static Target PASS_FIELD = Target.the("pass field").locatedBy("#password");
    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("#login-button");

}
