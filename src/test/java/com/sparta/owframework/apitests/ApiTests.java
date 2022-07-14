
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

    Clouds clouds;
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
            weatherItems = weatherDTO.getWeather();
            wind = weatherDTO.getWind();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Nested
    @DisplayName("OWWeatherDTO tests")
    public class OWWeatherDTOTests {
        @Test
        @DisplayName("Check city value cis type String")
        void checkCityValueIsTypeString(){
            Assertions.assertEquals(String.class, weatherDTO.getName().getClass());
        }

        @Test
        @DisplayName("Check id value is type Integer")
        void checkIdValueIsTypeInteger(){
            Assertions.assertEquals(Integer.class, weatherDTO.getId().getClass());
        }

        @Test
        @DisplayName("Check timezone value is type Integer")
        void checkTimezoneValueIsTypeInteger(){
            Assertions.assertEquals(Integer.class, weatherDTO.getTimezone().getClass());
        }

        @Test
        @DisplayName("check cod is type Integer")
        void checkCodIsTypeInteger() {
            Assertions.assertEquals(Integer.class, weatherDTO.getCod().getClass());
        }

        @Test
        @DisplayName("check dt is type Integer")
        void checkDtIsTypeInteger() {
            Assertions.assertEquals(Integer.class, weatherDTO.getDt().getClass());
        }


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



    }


    @Test
    @DisplayName("checkLatitudeIsWithinBounds")
    void checkLatWithinBounds() {Assertions.assertTrue(coord.isLatBetweenNeg90AndPos90());}

    @Test
    @DisplayName("checkLongitudeIsWithinBounds")
    void checkLongWithinBounds() {Assertions.assertTrue(coord.isLongBetweenNeg180AndPos180());}

    @Test
    @DisplayName("checkCorrectHTTPCode")
    void checkHTTPCode() {Assertions.assertEquals(200, weatherDTO.getCod());}


    @Test
    @DisplayName("checkWeatherIdDescriptionMainIconValid")
    void checkWeatherIDInRange() {
        for (WeatherItem item : weatherItems) {
            Assertions.assertTrue(item.isValidIconDescMainIdCombo());
        }
    }


    @Test
    @DisplayName("checkDateIsCorrect")
    void checkDateIsCorrect() {
        Assertions.assertTrue(weatherDTO.requestDateSentCorrect());
    }

    @Test
    @DisplayName("checkCountryCodeExactly2Chars")
    void checkCountryCodeExactly2Chars(){
        Assertions.assertTrue(sys.hasExactlyTwoChars());
    }

    @Test
    @DisplayName("CheckTimezoneInRange")
    void checkTimezoneInRange() {
        Assertions.assertTrue(weatherDTO.isTimeZoneValid());
    }

    @Test
    @DisplayName("CheckCountryCodeIsInMap")
    void








}
>>>>>>> 825f015de91995e49d9028f8b47037909c5ef367
