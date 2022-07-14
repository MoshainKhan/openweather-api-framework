package com.sparta.owframework.apitests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.owframework.OWWeatherDTO.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class ApiTests {

    OWWeatherDTO weatherDTO;

    com.sparta.owframework.OWWeatherDTO.Clouds clouds;
    Coord coord;
    Main main;
    Rain rain;
    Snow snow;
    Sys sys;
    List<WeatherItem> weatherItems;
    Wind wind;


    @BeforeAll
    @DisplayName("Setup weatherDTO object using example json response.")
    void setUp() {
        OWWeatherDTO weatherDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/correct_weather_data.json"), OWWeatherDTO.class);
            clouds = weatherDTO.getClouds();
            coord = weatherDTO.getCoord();
            main = weatherDTO.getMain();
            rain = weatherDTO.getRain();
            snow = weatherDTO.getSnow();
            sys = weatherDTO.getSys();
            weatherItems = weatherDTO.getWeatherItems();
            wind = weatherDTO.getWind();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Nested
    @DisplayName("OWWeatherDTO tests")
    public class OWWeatherDTOTests {

        @Test
        @DisplayName("check cod is a valid status code")
        void checkCodIsValidStatusCode() {
            Assertions.assertTrue(WeatherDTOHelper.isValidStatusCode(weatherDTO.getCod()));
        }

        @Test
        @DisplayName("check visibility is type Integer")
        void checkVisibilityIsTypeInteger() {
            Assertions.assertEquals(Integer.class, weatherDTO.getVisibility().getClass());
        }

        @Test
        @DisplayName("check visibility is within valid boundaries")
        void checkVisibilityIsInValidBoundaries() {
            Assertions.assertTrue(weatherDTO.isValidVisibilityBoundaries());
        }

        @Test
        @DisplayName("Check London is returned for city name when London is called")
        void checkCityNameLondonReturned(){
            Assertions.assertEquals("London", weatherDTO.getName());
        }

        @Test
        @DisplayName("checkCorrectIdWhenLondonIsCalled")
        void checkCorrectIdWhenCallingLondon(){ Assertions.assertEquals(2643743, weatherDTO.getId());}

        @Test
        @DisplayName("check timezone is valid multiple")
        void checkTimezoneIsValidMultiple(){ Assertions.assertTrue(weatherDTO.isMultipleOf3600());}

        @Test
        @DisplayName("check timezone greater than 0")
        void checkTimezoneIsGreaterThan0() { Assertions.assertTrue(weatherDTO.getTimezone() >= 0);}

        @Test
        @DisplayName("checkDateIsCorrect")
        void checkDateIsCorrect() {
            Assertions.assertTrue(weatherDTO.requestDateSentCorrect());
        }

    }

    @Nested
    @DisplayName("Coord tests")
    public class CoordTests {

        @Test
        @DisplayName("Check both long and lat are present")
        void checkLongAndLatArePresent() {
            Assertions.assertTrue(coord.hasLat() && coord.hasLong());
        }
        @Test
        @DisplayName("checkLatitudeIsWithinBounds")
        void checkLatWithinBounds() {Assertions.assertTrue(coord.isLatBetweenNeg90AndPos90());}

        @Test
        @DisplayName("checkLongitudeIsWithinBounds")
        void checkLongWithinBounds() {Assertions.assertTrue(coord.isLongBetweenNeg180AndPos180());}



    }

    @Nested
    @DisplayName("Clouds tests")
    public class Clouds {

        @Test
        @DisplayName("Check all value within valid boundaries")
        void checkAllWithinBoundaries() {
            Assertions.assertTrue(WeatherDTOHelper.isBetween0And100(clouds.getAll()));
        }
    }

    @Nested
    @DisplayName("Main tests")
    public class MainTests {
        @Test
        @DisplayName("Check temp is between temMin and tempMax")
        void checkTempIsBetweenTempMinAndTempMax() {
            Assertions.assertTrue(main.isTempBetweenTempMinAndMax());
        }

        @Test
        @DisplayName("Check pressure is between 100 and 1100")
        void checkPressureBetween100And1100() {
            Assertions.assertTrue(main.isPressureBetween100And1100());
        }

        @Test
        @DisplayName("Check feelsLike is at least 5 below or 5 above temp")
        void checkFeelsLike5AboveOr5BelowTemp() {
            Assertions.assertTrue(main.is5LessOr5More());
        }

        @Test
        @DisplayName("Check humidity within valid boundaries")
        void checkHumidityWithinBoundaries() {
            Assertions.assertTrue(WeatherDTOHelper.isBetween0And100(main.getHumidity()));
        }
    }

    @Nested
    @DisplayName("Rain Tests")
    public class RainTests {
        @Test
        @DisplayName("Check rain 1hr 0 or greater")
        void check1hrRain0OrGreater() {
            Assertions.assertTrue(rain.getJsonMember1h() >= 0);
        }

        @DisplayName("Check rain 3hr 0 or greater")
        void check3hrRain0OrGreater() {
            Assertions.assertTrue(rain.getJsonMember3h() >= 0);
        }
    }

    @Nested
    @DisplayName("Snow tests")
    public class SnowTests {
        @Test
        @DisplayName("Check snow 1hr 0 or greater")
        void check1hrSnow0OrGreater() {
            Assertions.assertTrue(snow.getJsonMember1h() >= 0);
        }

        @DisplayName("Check snow 3hr 0 or greater")
        void check3hrSnow0OrGreater() {
            Assertions.assertTrue(snow.getJsonMember3h() >= 0);
        }
    }

    @Nested
    @DisplayName("Sys tests")
    public class SysTests {
        @Test
        @DisplayName("checkCountryCodeExactly2Chars")
        void checkCountryCodeExactly2Chars(){
            Assertions.assertTrue(sys.hasExactlyTwoChars());
        }

        @Test
        @DisplayName("check sunrise is before sunset")
        void checkSunriseISBeforeSunset(){
            Assertions.assertTrue(sys.isSunriseBeforeSunset());
        }

        @Test
        @DisplayName("check country code is valid")
        void checkCountryCodeIsValid(){
            Assertions.assertTrue(sys.hasCountryCode());
        }


    }

    @Nested
    @DisplayName("WeatherItem tests")
    public class WeatherItemTests {
        @Test
        @DisplayName("checkWeatherIdDescriptionMainIconValid")
        void checkWeatherIDInRange() {
            for (WeatherItem item : weatherItems) {
                Assertions.assertTrue(item.isValidIconDescMainIdCombo());
            }
        }
    }

    @Nested
    @DisplayName("Wind tests")
    public class WindTests {
        @Test
        @DisplayName("check wind speed 0 or greater")
        void checkWindSpeed0OrGreater(){
            Assertions.assertTrue(wind.getSpeed() >= 0);
        }

        @Test
        @DisplayName("check gust is 0 or greater")
        void checkGustIS0OrGreater(){
            Assertions.assertTrue(wind.isGust0OrGreater());
        }

        @Test
        @DisplayName("check gust greater than wind")
        void checkGustIsGreaterThanSpeed(){
            Assertions.assertTrue(wind.isGustGreaterThanSpeed());
        }

        @Test
        @DisplayName("check deg valid value")
        void checkDegValidValue(){
            Assertions.assertTrue(wind.isValidDegreesValue());
        }

    }
}
