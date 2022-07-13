package com.sparta.owframework.apitests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class ApiTests {


    @Test
    @DisplayName("checkCorrectIdWhenLondonIsCalled")
    void checkCorrectIdWhenCallingLondon(){ Assertions.assertEquals(2643743, city_id);}


    @Test
    @DisplayName("checkLatitudeIsWithinBounds")
    void checkLatWithinBounds() {Assertions.assertTrue(-90> <90);}

    @Test
    @DisplayName("checkLongitudeIsWithinBounds")
    void checkLongWithinBounds() {Assertions.assertTrue(-180> <180);}

    @Test
    @DisplayName("checkCorrectCityNameReturned")
    void checkCorrectCityNameReturned() {Assertions.assertEquals("London", );}

    @Test
    @DisplayName("checkCorrectHTTPCode")
    void checkHTTPCode() {Assertions.assertEquals(200,);}


    @Test
    @DisplayName("checkWeatherIDIsInRange")
    void checkWeatherIDInRange() {Assertions.assertTrue(200<=<=804);}






    
}
