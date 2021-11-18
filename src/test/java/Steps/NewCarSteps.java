package Steps;

import org.junit.Assert;
import PageObject.BrandCarPage;
import PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import PageObject.NewCarsPage;

public class NewCarSteps {

    //@Steps
    //CarWaleSteps steps;

    HomePage home;
    NewCarsPage newCarsPage;
    BrandCarPage brandCarPage;


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
