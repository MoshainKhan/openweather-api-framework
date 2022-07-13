package cucumberScenarios.stepdefs;

import com.sparta.owframework.OWWeatherDTO.Coord;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.Wind;
import com.sparta.owframework.injector_manager_loader.ConnectionManager;
import com.sparta.owframework.injector_manager_loader.Injector;
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
        Assumptions.assumeTrue(owWeatherDTO.getCoord().hasLat());
    }


    @Then("I should receive a value between minus ninty and plus ninty")
    public void iShouldReceiveAValueBetweenMinusNintyAndPlusNinty() {
        Assertions.assertTrue(coord.isLatBetweenNeg90AndPos90());
    }

    @Then("I should receive a value with no more than {int} decimal places")
    public void iShouldReceiveAValueWithNoMoreThanFourDecimalPlaces() {

    }

    @When("I test the lon field")
    public void iTestTheLonField() {
        Assumptions.assumeTrue(owWeatherDTO.getCoord().hasLong());
    }

    @Then("I should receive a value between minus180 and 180")
    public void iShouldReceiveAValueBetweenAndMinus180and180() {
        Assertions.assertTrue(coord.isLongBetweenNeg180AndPos180());
    }


    @Then("I should receive a value  with no more than {int} decimal places")
    public void iShouldReceiveAValueWithNoMoreThanDecimalPlaces() {
    }



}
