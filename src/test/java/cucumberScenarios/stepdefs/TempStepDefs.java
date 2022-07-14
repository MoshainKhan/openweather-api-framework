package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.Main;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.injector_manager_loader.ConnectionManager;
import com.sparta.owframework.injector_manager_loader.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class TempStepDefs {

    OWWeatherDTO owWeatherDTO;
    Main main;

    @Given("I have a JSON response including temperature")
    public void iHaveAJSONResponseIncludingTemperature() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        main = owWeatherDTO.getMain();
    }

    @When("I compare the MIN to the MAX")
    public void iCompareTheMINToTheMAX() {
        Assertions.assertTrue(main.hasTempMin());
        Assertions.assertTrue(main.hasTempMax());
    }

    @Then("the MIN should be smaller than the MAX")
    public void theMINShouldBeSmallerThanTheMAX() {
        Assertions.assertTrue(main.getTempMax() > main.getTempMin());
    }

    @When("I check the current temperature value")
    public void iCheckTheCurrentTemperatureValue() {
        Assertions.assertTrue(main.hasTemp());
    }

    @Then("It should be between the MIN and MAX")
    public void itShouldBeBetweenTheMINAndMAX() {
        Assertions.assertTrue(main.isTempBetweenTempMinAndMax());
    }

    @When("I check the temperature value")
    public void iCheckTheTemperatureValue() {
        Assertions.assertTrue(main.hasTemp());
    }

    @Then("It should return a double")
    public void itShouldReturnADouble() {
        Assertions.assertInstanceOf(Double.class, main.getTemp());
    }

    @Then("It should not be equal to null")
    public void itShouldNotBeEqualToNull() {
        Assertions.assertTrue(main.hasTemp());
        Assertions.assertTrue(main.hasTempMin());
        Assertions.assertTrue(main.hasTempMax());
    }

    @Then("It should be equal to or more than MIN")
    public void itShouldBeEqualToOrMoreThanMIN() {
        Assertions.assertTrue(main.getTemp() >= main.getTempMin());
    }

    @Then("It should be equal to or less than MAX")
    public void itShouldBeEqualToOrLessThanMAX() {
        Assertions.assertTrue(main.getTemp() <= main.getTempMax());
    }

    @When("I check the feels like temperature value")
    public void iCheckTheFeelsLikeTemperatureValue() {
        Assertions.assertTrue(main.hasFeelsLike());
    }


    @Then("it should be within five degrees of the current temperature")
    public void itShouldBeWithinFiveDegreesOfTheCurrentTemperature() {
        Assertions.assertTrue(main.is5LessOr5More());
    }
}
