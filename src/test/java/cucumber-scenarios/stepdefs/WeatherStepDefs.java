package cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeatherStepDefs {
    @Given("I have a JSON response including weather data")
    public void iHaveAJSONResponseIncludingWeatherData() {
    }

    @When("Main description is Thunderstorm")
    public void mainDescriptionIsThunderstorm() {
    }

    @Then("ID should be between {int} and {int}")
    public void idShouldBeBetweenAnd(int arg0, int arg1) {
    }

    @Then("Description should contain {string}")
    public void descriptionShouldContainThunderstorm() {
    }

    @Then("icon should be {int}d")
    public void iconShouldBeD(int arg0) {
    }
}
