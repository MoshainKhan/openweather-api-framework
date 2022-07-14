package cucumberScenarios.stepdefs;

import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.Wind;
import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class WindStepDefs {
    Wind wind;
    OWWeatherDTO owWeatherDTO;



    @Given("I have wind data in the JSON response")
    public void iHaveWindDataInTheJSONResponse() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        wind =  owWeatherDTO.getWind();
    }

    @When("There is no gust data")
    public void thereIsNoGustData() {
        Assumptions.assumeFalse(wind.hasGust());
    }

    @Then("Gust should be null")
    public void gustShouldBeNull() {
        Assertions.assertNull(wind.getGust());
    }

    @When("There is gust data")
    public void thereIsGustData() {
        Assumptions.assumeTrue(wind.hasGust());
    }

    @Then("Gust should be greater than wind speed")
    public void gustShouldBeGreaterThanWindSpeed() {
       Assertions.assertTrue(wind.isGustGreaterThanSpeed());
    }

    @When("I check the wind speeds")
    public void iCheckTheWindSpeeds() {
        Assumptions.assumeTrue(wind.hasSpeed());

    }

    @Then("They should be greater than 0")
    public void theyShouldBeGreaterThan() {
        Assertions.assertTrue(wind.validSpeedAndGust());
    }

    @When("I check the wind direction")
    public void iCheckTheWindDirection() {
        Assumptions.assumeTrue(wind.hasDeg());
    }

    @Then("The value should be between 0 and 360")
    public void theValueShouldBeBetweenAnd() {
        Assertions.assertTrue(wind.isValidDegreesValue());
    }
}
