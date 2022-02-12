package Steps;

import RecordingTests.ScreenRecorder;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import PageObject.LoginPage;
import PageObject.HomePage;

public class LoginSteps {

    //region Variables
    LoginPage loginPage;
    HomePage swagLabsHomePage;
    private boolean result = false;
    //endregion

    //@Steps

    //region Given
    @Given("^a user in the Login Page$")
    public void a_user_in_the_login_page() throws Throwable {
        loginPage.open();
        ScreenRecorder.startRecording("JQ Test");
    }
    //endregion

    //region When
    @When("^the user enters an incorrect UserName$")
    public void the_user_enters_an_incorrect_username() throws Throwable {
        loginPage.typeInUserFieldIncorrectName();
    }

    @When("^the user enters expected Password$")
    public void the_user_enters_expected_password() throws Throwable {
        loginPage.typeInPasswordFieldExpectedPassword();
    }

    @When("^click on Login Button$")
    public void click_on_login_button() throws Throwable {
        swagLabsHomePage = loginPage.clickOnLoginButton();
    }

    @When("^the user enters expected UserName$")
    public void the_user_enters_expected_username() throws Throwable {
        loginPage.typeInUserFieldExpectedName();
    }

    @When("^the user enters an incorrect Password$")
    public void the_user_enters_an_incorrect_password() throws Throwable {
        loginPage.typeInPasswordFieldIncorrectPassword();
    }

    @When("^the user doesn't enter UserName in the Username field$")
    public void the_user_doesnt_enter_username_in_the_username_field() throws Throwable {

    }

    @When("^the user doesn't enter Password in the Password field$")
    public void the_user_doesnt_enter_password_in_the_password_field() throws Throwable {

    }
    //endregion

    //region Then
    @Then("^the system throws the error \"([^\"]*)\" message$")
    public void the_system_throws_the_error_something_message(String loginErrorMessage) throws Throwable {
        if (loginPage.getTextLoginErrorMessage().equals(loginErrorMessage)) {
            result = true;
        }
        Assert.assertTrue(result);
        result = false;
        loginPage.getDriver().quit();
    }

    @Then("^the system grant access by leaving the user on the Home Page in \"([^\"]*)\" section$")
    public void the_system_grant_access_by_leaving_the_user_on_the_home_page_in_something_section(String tittleHomePage) throws Throwable {
        if (swagLabsHomePage.getTextHomePageTitle().equals(tittleHomePage)) {
            result = true;
        }
        Assert.assertTrue(result);
        result = false;
        Thread.sleep(5000);
        loginPage.getDriver().quit();
        ScreenRecorder.stopRecording();
    }
    //endregion
}
