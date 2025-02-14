package starter.search;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class GetProducts implements Task {
    private static List<WebElementFacade> products;

    @Override
    public <T extends Actor> void performAs(T act) {
        List<WebElementFacade> products= InventoryPage.INVENTORY_ITEMS.resolveAllFor(act);
        System.out.println("Número de productos encontrados: " + products.size()+"\n"+products.get(0).getElement());
        GetProducts.products = products;

        for(WebElementFacade product:products){
            String productName=product.findBy(InventoryPage.ITEM_NAME.getCssOrXPathSelector()).getText();
            String productPrice=product.findBy(InventoryPage.ITEM_PRICE.getCssOrXPathSelector()).getText();
            WebElementFacade addButton=product.findBy(InventoryPage.CART_BTN_ADD.getCssOrXPathSelector());
            System.out.println("Product Name: "+productName+" Price: "+productPrice + " "+ addButton.getText());
            act.attemptsTo(Click.on(addButton));
        }
    }

    public static GetProducts onList() {
        return  new GetProducts();
    }
}
