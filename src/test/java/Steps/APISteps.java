package Steps;

import POJO.JsonBodyRequests.CreateBooking;
import POJO.JsonBodyRequests.ReadBookingsIds;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class APISteps {

    //region Variables
    public boolean result = false;
    public int statusCode;
    //endregion

    //@Steps

    //region Given


    //endregion

    //region When
    @When("^sends Get Method$")
    public void sends_get_method() throws Throwable {
        statusCode = ReadBookingsIds.deserializeFromJsonBookingIds();
        Assert.assertTrue(ReadBookingsIds.deserializeFromXMLActionItem());
    }

    @When("^sends Post Method$")
    public void sends_post_method() throws Throwable {
        statusCode = CreateBooking.CreateBrandNewBooking();
    }
    //endregion

    //region Then
    @Then("^the response code should be \"([^\"]*)\"$")
    public void the_response_code_should_be_something(int expectedStatusCode) throws Throwable {
        if (expectedStatusCode == statusCode)
        {
            result = true;
        }
        Assert.assertTrue(result);
        result = false;
    }
    //endregion
}
