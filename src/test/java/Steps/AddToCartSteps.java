package Steps;

import PageObject.HomePage;
import PageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class AddToCartSteps {

    //region Variables
    LoginPage loginPage;
    HomePage swagLabsHomePage;
    private boolean result = false;
    List<String> nameProductList = new ArrayList<>();
    //endregion

    //@Steps

    //region Given
    @Given("^a user in the Home Page within \"([^\"]*)\" section$")
    public void a_user_in_the_home_page_within_something_section(String tittleHomePage) throws Throwable {
        loginPage.open();
        loginPage.typeInUserFieldExpectedName();
        loginPage.typeInPasswordFieldExpectedPassword();
        swagLabsHomePage = loginPage.clickOnLoginButton();

        if (swagLabsHomePage.getTextProductsTittleHomePage().equals(tittleHomePage)) {
            result = true;
        }
        Assert.assertTrue(result);
        result = false;
    }
    //endregion

    //region When
    @When("^search for (.+)$")
    public void search_for(String productName) throws Throwable {
        nameProductList = swagLabsHomePage.getProductsFromWebPage();
    }
    //endregion

    //region Then
    @Then("^the product (.+) should be listed on Product Section$")
    public void the_product_should_be_listed_on_product_section(String productName) throws Throwable {
        for (int i = 0; i <= nameProductList.stream().count(); i++) {
            if (nameProductList.contains(productName)) {
                result = true;
                break;
            }
        }
        Assert.assertTrue(result);
        result = false;
    }
    //endregion
}
