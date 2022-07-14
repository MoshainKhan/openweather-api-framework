package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.Sys;
import com.sparta.owframework.filemanager.CountryCodesMap;
import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class SysStepDefs {
    OWWeatherDTO owWeatherDTO;
    Sys sys;

    @Given("I have a weather JSON response")
    public void iHaveAWeatherJsonResponse(){
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        sys = owWeatherDTO.getSys();
    }

    @When("I test value for the system type")
    public void iTestValueForTheSystemType() {
        Assumptions.assumeTrue(sys.hasType());
    }

    @Then("the value should be in integer.")
    public void theValueShouldBeInInteger() {
        Assertions.assertInstanceOf(Number.class, sys.getType());
    }

    @When("I test value for the ID type")
    public void iTestValueForTheIDType() {
        Assumptions.assumeTrue(sys.hasId());
    }

    @Then("the value should be an integer.")
    public void shouldBeAnInteger(){
        Assertions.assertInstanceOf(Number.class, sys.getId());
    }

    @When("I test value for the message type")
    public void iTestValueForTheMessageType() {
        Assumptions.assumeTrue(sys.hasMessage());
    }

    @Then("the value should be in double.")
    public void theValueShouldBeInDouble() {
        Assertions.assertInstanceOf(Double.class, sys.getMessage());
    }

    @When("I test value for the country code type")
    public void iTestValueForTheCountryCodeType() {
        Assumptions.assumeTrue(sys.hasCountry());
    }

    @Then("the value should be in String.")
    public void theValueShouldBeInString() {
        Assertions.assertInstanceOf(String.class, sys.getCountry());
    }

    @Then("The value should correspond to a valid country")
    public void theValueShouldCorrespondToAValidCountry() {
        Assertions.assertTrue(CountryCodesMap.getCountryCodesMap().containsKey(sys.getCountry()));

    }
}
