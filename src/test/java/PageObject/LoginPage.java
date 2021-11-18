package PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    //region Components
    By userNameField = By.cssSelector("#user-name");
    By passwordField = By.cssSelector("#password");
    By loginButton = By.cssSelector("#login-button");
    By loginErrorMessage = By.xpath("//h3[@data-test='error']");
    //endregion

    //region Actions
    public void typeInUserIncorrectNameField() {
        find(userNameField).sendKeys("RandomName");
    }

    public void typeInUserExpectedNameField() {
        find(userNameField).sendKeys("standard_user");
    }

    public void typeInIncorrectPasswordField() {
        find(passwordField).sendKeys("RandomPassword");
    }

    public void typeInExpectedPasswordField() {
        find(passwordField).sendKeys("secret_sauce");
    }

    public String getTextLoginErrorMessage() {
        return find(loginErrorMessage).getText();
    }

    public SwagLabsHomePage clickOnLoginButton() {
        find(loginButton).click();
        return this.switchToPage(SwagLabsHomePage.class);
    }
    //endregion
}
