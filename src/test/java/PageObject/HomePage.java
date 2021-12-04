package PageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends MyProjectPage {

    //region Components
    By productsTittle = By.xpath("//span[@class='title']");
    //endregion

    //region Variables
    List<String> nameProductList = new ArrayList<>();
    //endregion

    //region Actions
    public String getTextProductsTittleHomePage() {
        return find(productsTittle).getText();
    }


    public List<String> getProductsFromWebPage() {
        List<WebElementFacade> productList = findAll("//div[@id='inventory_container']//div[@class='inventory_item']//div[@class='inventory_item_description']//div[@class='inventory_item_label']//a//div");
        for (int i = 1; i <= productList.stream().count(); i++) {
            nameProductList.add(productList.get(i-1).getText());
        }
        return nameProductList;
    }
    //endregion
}
