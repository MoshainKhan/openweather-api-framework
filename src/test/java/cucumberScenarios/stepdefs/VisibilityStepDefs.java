package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class VisibilityStepDefs {

    OWWeatherDTO owWeatherDTO;

    Integer visibility;

    @Given("I have a JSON response with visibility")
    public void iHaveAJSONResponseWithVisibility() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
    }

    @When("I test the visibility value")
    public void iTestTheVisibilityValue() {
        Assumptions.assumeTrue(owWeatherDTO.hasVisibility());
        visibility = owWeatherDTO.getVisibility();
    }

    @Then("I should get a value between zero and ten km")
    public void iShouldGetAValueBetweenZeroAndTenKm() {
        Assertions.assertTrue(visibility >= 0 && visibility <= 10000);
    }



}
