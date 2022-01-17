package PageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class YourCartPage extends MyProjectPage {

    //region Components
    By yourCartTittle = By.xpath("//span[@class='title']");
    By checkOutButton = By.id("checkout");
    //endregion

    //region Variables
    List<String> nameProductList = new ArrayList<>();
    String firstBlockToYourCartXpath = "//div[@class='cart_list']//div[@class='cart_item']//div[@class='cart_item_label']//div[@class='inventory_item_name']//following::div[@class=\"item_pricebar\"][";
    String allProductsOnYourCart = "//div[@class='cart_list']//div[@class='cart_item']//div[@class='cart_item_label']//div[@class='inventory_item_name']";
    String firstBlockForRemoveProducts = "//div[@class='cart_list']//div[@class='cart_item'][";
    Boolean result = false;
    //endregion

    //region Actions
    public String getTextYourCartPageTitle() {
        return find(yourCartTittle).getText();
    }

    public Boolean isCheckOutButtonEnabled() {
        if (!find(checkOutButton).isEnabled()) {
            return true;
        } else {
            return false;
        }
    }


    public List<String> getProductsFromYourCartWebPage() {
        List<WebElementFacade> productList = findAll("//div[@class='cart_list']//div[@class='cart_item']//div[@class='cart_item_label']//div[@class='inventory_item_name']");
        for (int i = 1; i <= productList.stream().count(); i++) {
            nameProductList.add(productList.get(i - 1).getText());
        }
        return nameProductList;
    }

    public Boolean verifyExpectedProductPrice(String productName, String productPrice) {
        List<WebElementFacade> productList = findAll("//div[@class='cart_list']//div[@class='cart_item']//div[@class='cart_item_label']//div[@class='inventory_item_name']");
        for (int i = 0; i < productList.stream().count(); i++) {
            if (productList.get(i).getText().contains(productName)) {
                firstBlockToYourCartXpath = firstBlockToYourCartXpath + (i + 1) + "]//div";
                By getProductPrice = By.xpath(firstBlockToYourCartXpath);
                if (find(getProductPrice).getText().equals(productPrice)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void removeSpecificProductFromYourCart(String productName) {
        List<WebElementFacade> productList = findAll(allProductsOnYourCart);
        for (int i = 0; i < productList.stream().count(); i++) {
            if (productList.get(i).getText().contains(productName))
            {
               firstBlockForRemoveProducts = firstBlockForRemoveProducts + (i + 1) + "]//button";
               By removeProductFromYourCart = By.xpath(firstBlockForRemoveProducts);
               clickOn(find(removeProductFromYourCart));
               firstBlockForRemoveProducts = "//div[@class='cart_list']//div[@class='cart_item'][";
               break;
            }
        }
    }

    public void removeAllProductsFromYourCart() {
        List<WebElementFacade> productList = findAll(allProductsOnYourCart);
        for (int i = 0; i < productList.stream().count(); i++)
        {
                firstBlockForRemoveProducts = firstBlockForRemoveProducts + (1) + "]//button";
                By removeProductFromYourCart = By.xpath(firstBlockForRemoveProducts);
                clickOn(find(removeProductFromYourCart));
                firstBlockForRemoveProducts = "//div[@class='cart_list']//div[@class='cart_item'][";
        }
    }

    public Boolean isProductJustRemovedPresent(String productName) {
        List<WebElementFacade> productList = findAll(allProductsOnYourCart);
        for (int i = 0; i < productList.stream().count(); i++) {
            if (productList.get(i).getText().contains(productName))
            {
                result = true;
                return true;
            }
        }
        return result;
    }
    //endregion
}
