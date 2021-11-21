package PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MyProjectPage extends PageObject {

    static{
        System.setProperty("webdriver.edge.driver","src/test/resources/webdrivers/msedgedriver.exe");
    }
}
