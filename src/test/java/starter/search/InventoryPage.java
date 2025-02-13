package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage {


    public static Target INVENTORY_ITEMS =  Target.the("list of items").locatedBy(".inventory_list .inventory_item");
    public static Target ITEM_NAME =  Target.the("name of item").locatedBy(".inventory_item_name");
    public static Target ITEM_PRICE =  Target.the("price of item").locatedBy(".inventory_item_price");
    public static Target CART_BTN_ADD =  Target.the("cart button add").locatedBy(".btn_inventory");

    public static Target CART_BTN_RMV =  Target.the("cart button remove").locatedBy(".btn .btn_secondary .btn_small .btn_inventory ");

}
