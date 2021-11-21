package PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends MyProjectPage {

    //region Components
    By userNameField = By.cssSelector("#user-name");
    By passwordField = By.cssSelector("#password");
    By loginButton = By.cssSelector("#login-button");
    By loginErrorMessage = By.xpath("//h3[@data-test='error']");
    //endregion

    //region Actions
    public void typeInUserFieldIncorrectName() {
        find(userNameField).sendKeys("RandomName");
    }

    public void typeInUserFieldExpectedName() {
        find(userNameField).sendKeys("standard_user");
    }

    public void typeInPasswordFieldIncorrectPassword() {
        find(passwordField).sendKeys("RandomPassword");
    }

    public void typeInPasswordFieldExpectedPassword() {
        find(passwordField).sendKeys("secret_sauce");
    }

    public String getTextLoginErrorMessage() {
        return find(loginErrorMessage).getText();
    }

    public HomePage clickOnLoginButton() {
        find(loginButton).click();
        return this.switchToPage(HomePage.class);
    }
    //endregion
}
