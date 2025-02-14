package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {


    public static Target CHECKOUT_BTN =  Target.the("checkout button").locatedBy(".checkout_button");

    public static Target BTN_BACK =  Target.the("cart button add").locatedBy(".back");

    public static Target BTN_RMV =  Target.the("button rmv").locatedBy(".cart_button");
}
