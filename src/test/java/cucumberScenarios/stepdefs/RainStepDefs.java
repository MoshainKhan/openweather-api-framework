package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.Rain;
import com.sparta.owframework.injector_manager_loader.ConnectionManager;
import com.sparta.owframework.injector_manager_loader.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class RainStepDefs {

    OWWeatherDTO owWeatherDTO;
    Rain rain;

    @Given("I have a JSON response including Rain")
    public void iHaveAJSONResponseIncludingRain() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        rain = owWeatherDTO.getRain();
    }
    @When("I test value for the rain in an hour")
    public void iTestValueForTheRainInAnHour() {
        Assertions.assertTrue(rain.hasJsonMember1h());
    }

    @Then("I should  return the double.")
    public void iShouldReturnTheDouble() {
        Assertions.assertInstanceOf(Double.class, rain.getJsonMember1h().getClass());
    }

    @When("I test value for the rain for three hours.")
    public void iTestValueForTheRainForThreeHours() {
        Assertions.assertTrue(rain.hasJsonMember3h());
    }

    @Then("I should  return the a double.")
    public void iShouldReturnTheADouble() {
        Assertions.assertInstanceOf(Double.class, rain.getJsonMember3h().getClass());
    }
}
