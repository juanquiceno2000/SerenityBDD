package Steps;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.YourCartPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CartSectionSteps {

    //region Variables
    LoginPage loginPage;
    HomePage swagLabsHomePage;
    YourCartPage yourCartPage;
    private boolean result = false;
    List<String> nameProductList = new ArrayList<>();
    //endregion

    //@Steps

    //region Given

    //endregion

    //region When
    @When("^remove the (.+) just added$")
    public void remove_the_just_added(String productName) throws Throwable {
        yourCartPage.removeSpecificProductFromYourCart(productName);
    }

    @When("^remove all Products from Your Cart section$")
    public void remove_all_products_from_your_cart_section() throws Throwable {
        yourCartPage.removeAllProductsFromYourCart();
    }
    //endregion

    //region Then
    @Then("^the product with name (.+) just removed should not be listed any more$")
    public void the_product_with_name_just_removed_should_not_be_listed_any_more(String productName) throws Throwable {
        try {
            Assert.assertFalse(yourCartPage.isProductJustRemovedPresent(productName));
            loginPage.getDriver().quit();
        }
        catch (Exception e) {
            loginPage.getDriver().quit();
            System.out.println(e.getMessage());
        }
    }

    @Then("^CheckOut Button should be disable$")
    public void checkout_button_should_be_disable() throws Throwable {
        Assert.assertTrue(yourCartPage.isCheckOutButtonEnabled());
    }
    //endregion
}
