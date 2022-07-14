package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.Snow;
import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class SnowStepDefs {
    OWWeatherDTO owWeatherDTO;
    Snow snow;
    @Given("I have a JSON response including snow")
    public void iHaveAJSONResponseIncludingSnow() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        snow = owWeatherDTO.getSnow();
    }

    @When("I check the snow values")
    public void iCheckTheSnowValues() {
        Assumptions.assumeTrue(owWeatherDTO.hasSnow());
    }

    @Then("it should return the values which are double")
    public void itShouldReturnTheValuesWhichAreDouble() {
        Assertions.assertInstanceOf(Double.class, snow.getJsonMember1h());
    }

    @Then("it should return a value equal to or more than zero")
    public void itShouldReturnAValueEqualToOrMoreThanZero() {
        Assertions.assertTrue(snow.getJsonMember1h() >= 0);
    }
}
