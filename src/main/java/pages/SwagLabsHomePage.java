package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SwagLabsHomePage extends PageObject {

    By productsTittle = By.xpath("//span[@class='title']");


    public String getTextProductsTittleHomePage() {
        return find(productsTittle).getText();
    }
}
