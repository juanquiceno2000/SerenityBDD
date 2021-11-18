package PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    //region Components
    By productsTittle = By.xpath("//span[@class='title']");
    //endregion

    //region Actions
    public String getTextProductsTittleHomePage() {
        return find(productsTittle).getText();
    }
    //endregion
}
