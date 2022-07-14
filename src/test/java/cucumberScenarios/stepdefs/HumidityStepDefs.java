package cucumberScenarios.stepdefs;

import com.sparta.owframework.OWWeatherDTO.Main;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.WeatherDTOHelper;

import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class HumidityStepDefs {
    Main main;
    OWWeatherDTO owWeatherDTO;
    WeatherDTOHelper weatherDTOHelper;


    @Given("I have humidity data in a JSON response")
    public void iHaveHumidityDataInAJSONResponse() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        main =  owWeatherDTO.getMain();
    }
    @When("I test the humidity field")
    public void iTestTheHumidityField() {
        Assumptions.assumeTrue(owWeatherDTO.getMain().hasHumidity());

    }

    @Then("I should receive an integer data type.")
    public void iShouldReceiveAnIntegerDataType() {
        Assertions.assertInstanceOf(Integer.class,owWeatherDTO.getMain().getHumidity().getClass());
    }

    @Then("I should receive a value between zero and hundred")
    public void iShouldReceiveAValueBetweenZeroAndHundred() {
        Assertions.assertTrue(weatherDTOHelper.isBetween0And100(owWeatherDTO.getMain().getHumidity()));
    }


}
