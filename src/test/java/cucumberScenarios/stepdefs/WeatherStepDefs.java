package cucumberScenarios.stepdefs;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.WeatherItem;
import com.sparta.owframework.injector_manager_loader.ConnectionManager;
import com.sparta.owframework.injector_manager_loader.Injector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WeatherStepDefs {
    OWWeatherDTO owWeatherDTO;
    WeatherItem weatherItem;

    String description;

    String descriptionMain;

    @Given("I have a weatherItem")
    public void iHaveAWeatherItem() {
        owWeatherDTO = Injector.injectOWWeatherDTO(ConnectionManager.getConnectionCity("london"));
        weatherItem = owWeatherDTO.getWeather().get(0);
    }

    @When("I check the weather ID")
    public void iGetTheWeatherID() {
        Assertions.assertTrue(weatherItem.hasId());
        System.out.println(weatherItem.getId());
    }

    @Then("Then it should within a valid range")
    public void thenItShouldWithinAValidRange() {
        Assertions.assertTrue(owWeatherDTO.getId() > 199 || owWeatherDTO.getId() < 805);
    }

    @Then("It should have the correct corresponding description, main description and iconID")
    public void itShouldHaveTheCorrectCorrespondingDescriptionMainDescriptionAndIconID() {
        System.out.println(weatherItem.getDescription());
        System.out.println(weatherItem.getMain());
        Assertions.assertTrue(weatherItem.isValidIconDescMainIdCombo());
    }

}
