package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.Sys;
import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

import java.text.DateFormat;
import java.time.LocalDate;

public class SunsetSunriseStepDefs {

    OWWeatherDTO owWeatherDTO;
    Sys sys;

    @Given("I have a JSON response including Sunrise and Sunset")
    public void iHaveAJSONResponseIncludingSunriseAndSunset() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        sys = owWeatherDTO.getSys();
    }

    @When("I compare the Sunrise and Sunset values")
    public void iCompareTheSunriseAndSunsetValues() {
        Assumptions.assumeTrue(sys.hasSunset());
        Assumptions.assumeTrue(sys.hasSunrise());
    }

    @Then("the Sunrise value should always be before the Sunset value")
    public void theSunriseValueShouldAlwaysBeBeforeTheSunsetValue() {
        Assertions.assertTrue(sys.isSunriseBeforeSunset());
    }

    @Then("they should be in the EPOC format")
    public void theyShouldBeInTheEPOCFormat() {
        Assertions.assertInstanceOf(LocalDate.class, sys.convertEpocToLocal(sys.getSunset()));
    }

    @Then("they should NOT be equal to null")
    public void theyShouldNOTBeEqualToNull() {
        Assertions.assertNotNull(sys.getSunrise());
        Assertions.assertNotNull(sys.getSunset());
    }
}
