package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {
    By userNameField = By.cssSelector("#user-name");
    By passwordField = By.cssSelector("#password");
    By loginButton = By.cssSelector("#login-button");
    By loginErrorMessage = By.xpath("//h3[@data-test='error']");


    public void typeInUserIncorrectNameField() {
        find(userNameField).sendKeys("RandomName");
    }

    public void typeInUserExpectedNameField() {
        find(userNameField).sendKeys("standard_user");
    }

    public void typeInIncorrectPasswordField()
    {find(passwordField).sendKeys("RandomPassword");}

    public void typeInExpectedPasswordField() {
        find(passwordField).sendKeys("secret_sauce");}

    public void clickOnLoginButton() {find(loginButton).click();}

    public String getTextLoginErrorMessage() {
        return find(loginErrorMessage).getText();
    }
}
