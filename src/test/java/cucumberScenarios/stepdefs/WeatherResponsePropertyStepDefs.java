package cucumberScenarios.stepdefs;

import com.sparta.owframework.OWWeatherDTO.*;
import com.sparta.owframework.injector_manager_loader.ConnectionManager;
import com.sparta.owframework.injector_manager_loader.Injector;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WeatherResponsePropertyStepDefs {

    private int cityID;

    Clouds clouds;
    Coord coord;
    Main main;
    Rain rain;
    Snow snow;
    OWWeatherDTO owWeatherDTO;
    Sys sys;
    WeatherDTOHelper weatherDTOHelper;
    WeatherItem weatherItem;
    Wind wind;



    @Given("I have received a JSON response.")
    public void iHaveReceivedAJSONResponse() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));


    }

    @When("I check the city ID")
    public void iCheckTheCityID() {
    }

    @Then("It should not return null")
    public void iWantToMakeSureItHasReturnedTheCorrectDatatypeInt() {
        Assertions.assertNotNull(cityID);
    }


    @When("I check the city name")
    public void iCheckTheCityName() {
    }

    @Then("I want it to return a String")
    public void iWantItToReturnAString() {
    }

    @When("I check the cod number")
    public void iCheckTheCodNumber() {
    }

    @Then("I want it to return an int")
    public void iWantItToReturnAnInt() {
    }

    @And("I want it to return {int}")
    public void iWantItToReturn(int arg0) {
    }

    @When("I test the data type of dt")
    public void iTestTheDataTypeOfDt() {
    }

    @Then("I should receive an integer data type")
    public void iShouldReceiveAnIntegerDataType() {
    }

    @When("I test the value for dt")
    public void iTestTheValueForDt() {
    }

    @Then("I should receive an integer not less than {int}")
    public void iShouldReceiveAnIntegerNotLessThan(int arg0) {
    }

    @Then("I should receive an integer representing a Unix time greater than the previous day")
    public void iShouldReceiveAnIntegerRepresentingAUnixTimeGreaterThanThePreviousDay() {
    }

    @Then("I should receive an integer representing Unix time that is within the last {int} hours")
    public void iShouldReceiveAnIntegerRepresentingUnixTimeThatIsWithinTheLastHours(int arg0) {
    }

    @Given("I receive a JSON response")
    public void iReceiveAJSONResponse() {
    }

    @When("I check the timezone")
    public void iCheckTheTimezone() {
    }

    @Then("I want to check it within the valid range  [{int}hours, +{int}hours] of UTC")
    public void iWantToCheckItWithinTheValidRangeHoursHoursOfUTC(int arg0, int arg1) {
    }

    @Then("It should be a multiple of {int}")
    public void itShouldBeAMultipleOf(int arg0) {
    }
}
