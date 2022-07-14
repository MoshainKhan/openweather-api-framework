package cucumberScenarios.stepdefs;

import com.sparta.owframework.OWWeatherDTO.*;
import com.sparta.owframework.injector_manager_loader.ConnectionManager;
import com.sparta.owframework.injector_manager_loader.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class CloudStepDefs {


    Clouds clouds;
    OWWeatherDTO owWeatherDTO;



    @Given("I have a JSON response With Cloud")
    public void iHaveAJSONResponseWithCloud() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        clouds = owWeatherDTO.getClouds();
    }

    @When("I test the cloud percentage")
    public void iTestTheCloudPercentage() {
        Assumptions.assumeTrue(clouds.hasCloud());
    }

    @Then("I should get a number data type")
    public void iShouldGetANumberDataType() {

        Assertions.assertInstanceOf(Integer.class, clouds.getAll());
    }

    @Then("I should get a value greater than zero")
    public void iShouldGetAValueGreaterThanZero() {
        int actual = clouds.getAll();
        Assertions.assertTrue(actual > 0);

    }

    @Then("I should get a value between zero and a hundred")
    public void iShouldGetAValueBetweenZeroAndAHundred() {
        int cloudCoverage = clouds.getAll();
        Assertions.assertTrue(cloudCoverage >= 0 && cloudCoverage <= 100);
    }


}
