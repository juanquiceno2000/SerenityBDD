package Steps;

import PageObject.HomePage;
import PageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class APISteps {

    //region Variables
    LoginPage loginPage;
    HomePage swagLabsHomePage;
    private boolean result = false;
    //endregion

    //@Steps

    //region Given


    //endregion

    //region When
    @When("^sends Get Method$")
    public void sends_get_method() throws Throwable {

    }

    @When("^sends Post Method$")
    public void sends_post_method() throws Throwable {

    }
    //endregion

    //region Then
    @Then("^the response code should be \"([^\"]*)\"$")
    public void the_response_code_should_be_something(String strArg1) throws Throwable {

    }
    //endregion
}
