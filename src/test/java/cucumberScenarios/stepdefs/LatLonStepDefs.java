package cucumberScenarios.stepdefs;

import com.sparta.owframework.OWWeatherDTO.Coord;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;

import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class LatLonStepDefs {
    Coord coord;
    OWWeatherDTO owWeatherDTO;



    @Given("I have lat and lon in a JSON response")
    public void iHaveLatAndLonInAJSONResponse() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        coord =  owWeatherDTO.getCoord();
    }
    @When("I test the lat field")
    public void iTestTheLatField() {
        Assumptions.assumeTrue(coord.hasLat());
    }


    @Then("I should receive a value between minus ninety and plus ninety")
    public void iShouldReceiveAValueBetweenMinusNinetyAndPlusNinety() {
        Assertions.assertTrue(coord.isLatBetweenNeg90AndPos90());
    }


    @When("I test the lon field")
    public void iTestTheLonField() {
        Assumptions.assumeTrue(coord.hasLong());
    }

    @Then("I should receive a value between minus180 and 180")
    public void iShouldReceiveAValueBetweenAndMinus180and180() {
        Assertions.assertTrue(coord.isLongBetweenNeg180AndPos180());
    }


    @Then("I should receive a lat value with no more than four decimal places")
    public void iShouldReceiveALatValueWithNoMoreThanFourDecimalPlaces() {
        Assertions.assertTrue(coord.has4NumsAfterDecimalPoint(coord.getLat()));
    }


    @Then("I should receive a lon value  with no more than four decimal places")
    public void iShouldReceiveALonValueWithNoMoreThanFourDecimalPlaces() {
        Assertions.assertTrue(coord.has4NumsAfterDecimalPoint(coord.getLon()));
    }
}
