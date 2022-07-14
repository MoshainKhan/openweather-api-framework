package com.sparta.owframework.frameworktests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OWWeatherDTOTests {
    private static OWWeatherDTO weatherDTO;
    @BeforeAll
    static void setupAll() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/correct_weather_data.json"), OWWeatherDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("check: has Coord")
    void checkHasCoord() {
        assertTrue(weatherDTO.hasCoord());
    }

    @Test
    @DisplayName("check: has WeatherItem")
    void checkHasWeatherItem() {
        assertTrue(weatherDTO.hasWeather());
    }

    @Test
    @DisplayName("check: has base")
    void checkHasBase() {
        assertTrue(weatherDTO.hasBase());
    }

    @Test
    @DisplayName("check: has main")
    void checkHasMain() {
        assertTrue(weatherDTO.hasMain());
    }

    @Test
    @DisplayName("check: has Visibility")
    void checkHasVisibility() {
        assertTrue(weatherDTO.hasVisibility());
    }

    @Test
    @DisplayName("check: has Wind")
    void checkHasWind() {
        assertTrue(weatherDTO.hasWind());
    }

    @Test
    @DisplayName("check: has Clouds")
    void checkHasClouds() {
        assertTrue(weatherDTO.hasClouds());
    }

    @Test
    @DisplayName("check: has Rain")
    void checkHasRain() {
        assertTrue(weatherDTO.hasRain());
    }

    @Test
    @DisplayName("check: has Snow")
    void checkHasSnow() {
        assertTrue(weatherDTO.hasSnow());
    }

    @Test
    @DisplayName("check: has Dt")
    void checkHasDt() {
        assertTrue(weatherDTO.hasDt());
    }

    @Test
    @DisplayName("check: has Sys")
    void checkHasSys() {
        assertTrue(weatherDTO.hasSys());
    }

    @Test
    @DisplayName("check: has Timezone")
    void checkHasTimezone() {
        assertTrue(weatherDTO.hasTimeZone());
    }

    @Test
    @DisplayName("check: has Id")
    void checkHasId() {
        assertTrue(weatherDTO.hasId());
    }

    @Test
    @DisplayName("check: has Name")
    void checkHasName() {
        assertTrue(weatherDTO.hasName());
    }

    @Test
    @DisplayName("check: has Cod")
    void checkHasCod() {
        assertTrue(weatherDTO.hasCod());
    }

    @Test
    @DisplayName("check: timezone is multiple of 3600")
    void checkTimezoneIsMultipleOf3600() {
        assertTrue(weatherDTO.isMultipleOf3600());
    }

    @Test
    @DisplayName("check: current date matches dt value")
    void checkCurrentDateMatchesDtValue() {
        assertTrue(weatherDTO.requestDateSentCorrect());
    }

    @Test
    @DisplayName("check: is timezone a valid timezone")
    void checkIsTimezoneAValidTimezone() {
        assertTrue(weatherDTO.isTimeZoneValid());
    }
}
