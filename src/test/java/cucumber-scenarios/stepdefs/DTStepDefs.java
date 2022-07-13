package cucumber.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DTStepDefs {
    @When("I test the data type of dt")
    public void iTestTheDataTypeOfDt() {
    }

    @Then("I should receive an integer data type")
    public void iShouldReceiveAnIntegerDataType() {
    }

    @When("I test the value for dt")
    public void iTestTheValueForDt() {
    }

    @Then("I should receive an integer not less than {int}")
    public void iShouldReceiveAnIntegerNotLessThan(int arg0) {
    }

    @Then("I should receive an integer representing a Unix time greater than the previous day")
    public void iShouldReceiveAnIntegerRepresentingAUnixTimeGreaterThanThePreviousDay() {
    }

    @Then("I should receive an integer representing Unix time that is within the last {int} hours")
    public void iShouldReceiveAnIntegerRepresentingUnixTimeThatIsWithinTheLastHours(int arg0) {
    }
}
