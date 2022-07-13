package cucumber.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LatLonStepDefs {
    @When("I test the lat field")
    public void iTestTheLatField() {
    }

    @Then("I should receive a value between {int} and {int}")
    public void iShouldReceiveAValueBetweenAnd(int arg0, int arg1) {
    }

    @Then("I should receive a value with no more than {int} decimal places")
    public void iShouldReceiveAValueWithNoMoreThanDecimalPlaces(int arg0) {
    }

    @When("I test the lon field")
    public void iTestTheLonField() {
    }

    @Then("I should receive a value  with no more than {int} decimal places")
    public void iShouldReceiveAValueWithNoMoreThanDecimalPlaces(int arg0) {
    }
}
