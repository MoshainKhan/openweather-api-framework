package cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimeZoneStepDefs {
    @Given("I receive a JSON response")
    public void iReceiveAJSONResponse() {
    }

    @When("I check the timezone")
    public void iCheckTheTimezone() {
    }

    @Then("I want to check it within the valid range  [{int}hours, +{int}hours] of UTC")
    public void iWantToCheckItWithinTheValidRangeHoursHoursOfUTC(int arg0, int arg1) {
    }

    @Then("It should be a multiple of {int}")
    public void itShouldBeAMultipleOf(int arg0) {
    }
}
