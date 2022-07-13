package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.injector_manager_loader.ConnectionManager;
import com.sparta.owframework.injector_manager_loader.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeatherStepDefs {
    OWWeatherDTO owWeatherDTO;

    @Given("I have a weatherItem")
    public void iHaveAWeatherItem() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
    }

    @When("I get the weather ID")
    public void iGetTheWeatherID() {
    }

    @Then("Then it should within a valid range")
    public void thenItShouldWithinAValidRange() {
    }

    @When("I get the weather description")
    public void iGetTheWeatherDescription() {
    }

    @Then("It should be a valid description")
    public void itShouldBeAValidDescription() {
    }

    @Then("It should have the correct corresponding description, main description and iconID")
    public void itShouldHaveTheCorrectCorrespondingDescriptionMainDescriptionAndIconID() {
    }

    @When("I go get the weatherItem response")
    public void iGoGetTheWeatherItemResponse() {
    }

    @Then("The fields should not be null")
    public void theFieldsShouldNotBeNull() {
    }
}
