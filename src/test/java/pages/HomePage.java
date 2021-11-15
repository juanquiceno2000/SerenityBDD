package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    By newCarMenu = By.xpath("//div[normalize-space()='NEW CARS']");
    By findNewCarLink = By.cssSelector("a[href='/new-cars/']");

    public NewCarsPage FindNewCars() throws InterruptedException {

        withAction().moveToElement(find(newCarMenu)).perform();
        clickOn(find(findNewCarLink));
        return this.switchToPage(NewCarsPage.class);

    }
}
