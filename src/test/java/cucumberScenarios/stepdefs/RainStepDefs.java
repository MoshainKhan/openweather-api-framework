package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.Rain;
import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;

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
        Assumptions.assumeTrue(owWeatherDTO.hasRain());
    }

    @Then("It should  return value in double.")
    public void itShouldReturnValueInDouble() {
        Assertions.assertInstanceOf(Double.class, rain.getJsonMember1h());
    }

    @When("I test value for the rain in three hours")
    public void iTestValueForTheRainInThreeHours() {
        Assumptions.assumeTrue(owWeatherDTO.hasRain());
    }

    @Then("I should be in the correct format.")
    public void iShouldBeInTheCorrectFormat() {
        Assertions.assertInstanceOf(Double.class, rain.getJsonMember1h());
    }

    @Then("It should return a three hour value in  double.")
    public void itShouldReturnAThreeHourValueInDouble() {
        Assertions.assertInstanceOf(Double.class, rain.getJsonMember3h());
    }


}
