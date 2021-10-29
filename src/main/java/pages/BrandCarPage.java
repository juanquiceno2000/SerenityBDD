package pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BrandCarPage extends PageObject {
    By brandHeader = By.cssSelector(".o-dOKno.o-bNCMFw.o-fzoTzs.o-dKUdmM");

    public String GetBrandTextHeader() {
        return find(brandHeader).getText();
    }

}
