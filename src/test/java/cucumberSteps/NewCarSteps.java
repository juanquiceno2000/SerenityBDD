package cucumberSteps;

import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.BrandCarPage;
import pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import pages.NewCarsPage;

public class NewCarSteps {

    HomePage home;
    NewCarsPage newCarsPage;
    BrandCarPage brandCarPage;

    //@Steps
    //CarWaleSteps steps;

    @Given("^a user in the website$")
    public void a_user_in_the_website() {
        // Write code here that turns the phrase above into concrete actions
        home.open();
        //steps.navigateHomePage();
    }

    @Given("^in the new cars section$")
    public void in_the_new_cars_section() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        newCarsPage = home.FindNewCars();
        //steps.navigateToNewCars();
    }

    @When("^user select the (.+) option$")
    public void user_select_the_option(String brandName) throws Throwable {
        brandCarPage =  newCarsPage.chooseCarBrand(brandName);
        //steps.selectTheBrand(brandName);
    }

    @Then("^the cars of that (.*) show$")
    public void the_cars_of_that_brand_show(String brandName) throws InterruptedException {
        Assert.assertTrue(brandCarPage.GetBrandTextHeader().contains(brandName));
        //steps.brandPageIsOpen(brandName);
    }
}
