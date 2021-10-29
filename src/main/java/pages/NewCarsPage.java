package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class NewCarsPage extends PageObject {

    public BrandCarPage chooseCarBrand(String brand){
        clickOn(find(By.linkText(brand)));
        return this.switchToPage(BrandCarPage.class);
    }
}
