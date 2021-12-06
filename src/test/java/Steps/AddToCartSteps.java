package Steps;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.YourCartPage;
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
    YourCartPage yourCartPage;
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

        if (swagLabsHomePage.getTextHomePageTitle().equals(tittleHomePage)) {
            result = true;
        }
        Assert.assertTrue(result);
        result = false;
    }
    //endregion

    //region When
    @When("^search for (.+)$")
    public void search_for(String productName) throws Throwable {
        nameProductList = swagLabsHomePage.getProductsFromHomeWebPage();
    }

    @When("^add to the cart the (.+) just found$")
    public void add_to_the_cart_the_just_found(String productName) throws Throwable {
        swagLabsHomePage.addToCartSpecificProduct(productName);
    }

    @When("^navigate to Your Cart section$")
    public void navigate_to_your_cart_section() throws Throwable {
        swagLabsHomePage.navigateToYourCartSection();
    }
    //endregion

    //region Then
    @Then("^the product (.+) should not be listed on Product Section$")
    public void the_product_should_not_be_listed_on_product_section(String productName) throws Throwable {
        for (int i = 0; i <= nameProductList.stream().count(); i++) {
            if (nameProductList.contains(productName)) {
                result = true;
                break;
            }
        }
        Assert.assertFalse("The product(s) should not be here",result);
        result = false;
        loginPage.getDriver().quit();
    }

    @Then("^the product (.+) should be listed on Product Section$")
    public void the_product_should_be_listed_on_product_section(String productName) throws Throwable {
        for (int i = 0; i <= nameProductList.stream().count(); i++) {
            if (nameProductList.contains(productName)) {
                result = true;
                break;
            }
        }
        Assert.assertTrue("The product(s) should be here",result);
        result = false;
        loginPage.getDriver().quit();
    }

    @Then("^the user should be located in \"([^\"]*)\" section$")
    public void the_user_should_be_located_in_something_section(String tittleYourCartPage) throws Throwable {
        if (yourCartPage.getTextYourCartPageTitle().equals(tittleYourCartPage)) {
            result = true;
        }
        Assert.assertTrue(result);
        result = false;
    }

    @Then("^the product (.+) should be listed on Your Cart Section with expected (.+)$")
    public void the_product_should_be_listed_on_your_cart_section_with_expected(String productName, String productPrice) throws Throwable {
        nameProductList = new ArrayList<>();
        nameProductList = yourCartPage.getProductsFromYourCartWebPage();

        for (int i = 0; i <= nameProductList.stream().count(); i++) {
            if (nameProductList.contains(productName)) {
                result = true;
                break;
            }
        }
        Assert.assertTrue("The product(s) should be here",result);
        result = false;

        result = yourCartPage.verifyExpectedProductPrice(productName,productPrice);
        Assert.assertTrue(result);
        result = false;
        loginPage.getDriver().quit();
    }
    //endregion
}
