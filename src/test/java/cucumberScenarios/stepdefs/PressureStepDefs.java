package cucumberScenarios.stepdefs;

import com.sparta.owframework.OWWeatherDTO.Main;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.WeatherDTOHelper;
import com.sparta.owframework.injector_manager_loader.ConnectionManager;
import com.sparta.owframework.injector_manager_loader.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class PressureStepDefs {
    Main main;
    OWWeatherDTO owWeatherDTO;
    WeatherDTOHelper weatherDTOHelper;

    @Given("I have pressure value in a JSON response")
    public void iHavePressureValueInAJSONResponse() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        main =  owWeatherDTO.getMain();
    }
    @When("I test values for pressure")
    public void iTestValuesForPressure() {
        Assumptions.assumeTrue(main.hasPressure());
    }

    @Then("I should receive a number data type")
    public void iShouldReceiveANumberDataType() {
        Assertions.assertInstanceOf(Double.class, main.getPressure());
    }


    @Then("I should receive a value between one hundred and eleven hundred only")
    public void iShouldReceiveAValueBetweenOneHundredAndElevenHundredOnly() {
        Assumptions.assumeTrue(main.isPressureBetween100And1100());

    }
}
