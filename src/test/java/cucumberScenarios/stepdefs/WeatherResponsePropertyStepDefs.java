package cucumberScenarios.stepdefs;

import com.sparta.owframework.OWWeatherDTO.*;

import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class WeatherResponsePropertyStepDefs {



    OWWeatherDTO owWeatherDTO;

    @Given("I have received a JSON response")
    public void iHaveReceivedAJSONResponse() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
    }

    @When("I check the city ID")
    public void iCheckTheCityID() {
        Assertions.assertTrue(owWeatherDTO.hasId());
    }

    @Then("It should return the correct data Type")
    public void iWantToMakeSureItHasReturnedTheCorrectDatatypeInt() {
        Assertions.assertInstanceOf(Number.class, owWeatherDTO.getId());
    }


    @When("I check the city name")
    public void iCheckTheCityName() {
        Assertions.assertTrue(owWeatherDTO.hasName());
    }

    @Then("I want it to return a String")
    public void iWantItToReturnAString() { Assertions.assertInstanceOf(String.class, owWeatherDTO.getName());
    }

    @When("I check the cod number")
    public void iCheckTheCodNumber() {
        Assertions.assertTrue(owWeatherDTO.hasCod());
    }

    @Then("I want it to return an int")
    public void iWantItToReturnAnInt() {
        Assertions.assertInstanceOf(Number.class, owWeatherDTO.getCod());
    }

    @And("I want it to return 200")
    public void iWantItToReturn() {
        Assertions.assertEquals(200, owWeatherDTO.getCod());
    }

    @When("I check the value for dt")
    public void iTestTheDataTypeOfDt() {
        Assertions.assertTrue(owWeatherDTO.hasDt());

    }

    @Then("I should receive an integer data type")
    public void iShouldReceiveAnIntegerDataType() {
        Assertions.assertInstanceOf(Number.class, owWeatherDTO.getDt());
    }


    @Then("I should receive an integer not less than 0")
    public void iShouldReceiveAnIntegerNotLessThan() {
        Assertions.assertTrue(owWeatherDTO.getDt() > 0);
    }

    @Then("The value should correspond with today's date")
    public void iShouldReceiveAnIntegerRepresentingUnixTimeThatIsWithinTheLastHours() {
        Assertions.assertTrue(owWeatherDTO.requestDateSentCorrect());
    }

    @When("I check the timezone")
    public void iCheckTheTimezone() {
        Assertions.assertTrue(owWeatherDTO.hasTimeZone());
    }

    @Then("I want to check it within the valid range [-12hours, +14hours] of UTC")
    public void iWantToCheckItWithinTheValidRangeHoursHoursOfUTC() {
        Assertions.assertTrue(owWeatherDTO.isTimeZoneValid());

    }

    @Then("It should be a multiple of 3600")
    public void itShouldBeAMultipleOf() {
        Assertions.assertTrue(owWeatherDTO.isMultipleOf3600());
    }
}
