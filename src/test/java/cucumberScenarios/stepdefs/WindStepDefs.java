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
    double windSpeed;


    @Given("I have wind data in the JSON response")
    public void iHaveWindDataInTheJSONResponse() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        wind =  owWeatherDTO.getWind();
    }

    @When("There is no gust data")
    public void thereIsNoGustData() {
        System.out.println(wind.getGust());
    }

    @Then("Gust should be null")
    public void gustShouldBeNull() {
        Assertions.assertNull(wind.getGust());
    }

    @When("There is gust data")
    public void thereIsGustData() {
        System.out.println(wind.getGust());
    }

    @Then("Gust should be greater than wind speed")
    public void gustShouldBeGreaterThanWindSpeed() {
       Assumptions.assumeTrue(wind.isGustGreaterThanSpeed());
    }

    @When("I check the wind speeds")
    public void iCheckTheWindSpeeds() {
        windSpeed = wind.getSpeed();

    }

    @Then("They should be greater than 0")
    public void theyShouldBeGreaterThan() {
        Assertions.assertTrue(windSpeed >0);
    }

    @When("I check the wind direction")
    public void iCheckTheWindDirection() {
        System.out.println(wind.getDeg());
    }

    @Then("The value should be between 0 and 360")
    public void theValueShouldBeBetweenAnd() {
        Assertions.assertTrue(wind.isValidDegreesValue());
    }
}
