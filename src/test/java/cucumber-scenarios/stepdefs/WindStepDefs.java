package cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WindStepDefs {
    @Given("I have wind data in the JSON response")
    public void iHaveWindDataInTheJSONResponse() {
    }

    @When("There is no gust data")
    public void thereIsNoGustData() {
    }

    @Then("Gust should be null")
    public void gustShouldBeNull() {
    }

    @When("There is gust data")
    public void thereIsGustData() {
    }

    @Then("Gust should be greater than wind speed")
    public void gustShouldBeGreaterThanWindSpeed() {
    }

    @When("I check the wind speeds")
    public void iCheckTheWindSpeeds() {
    }

    @Then("They should be greater than {int}")
    public void theyShouldBeGreaterThan(int arg0) {
    }

    @When("I check the wind direction")
    public void iCheckTheWindDirection() {
    }

    @Then("The value should be between {int} and {int}")
    public void theValueShouldBeBetweenAnd(int arg0, int arg1) {
    }
}
