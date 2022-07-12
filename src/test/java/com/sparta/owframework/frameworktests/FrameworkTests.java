package com.sparta.owframework.frameworktests;

import com.sparta.owframework.OWWeatherDTO.Coord;
import com.sparta.owframework.OWWeatherDTO.Main;
import com.sparta.owframework.OWWeatherDTO.Wind;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class FrameworkTests {

    Coord coord = new Coord();
    Main main = new Main();

    Wind wind = new Wind();



    @DisplayName("Coord") //F
    @Nested //F
    class CoordTests{ //A & F tests

        @Test
        @DisplayName("Check Lon values are present")
        void LonValuePresent(){

            Assertions.assertNotNull(coord.getLon());

        }
        @Test
        @DisplayName("Check Lat values are present")
        void LatValuePresent(){

            Assertions.assertNotNull(coord.getLat());

        }

        @Test
        @DisplayName("Check Lat datatype")
        void LatDataType(){

            Assertions.assertSame(Double.class,coord.getLat().getClass());
        }

        @Test
        @DisplayName("Check Lon datatype")
        void LonDataType(){

            Assertions.assertSame(Double.class,coord.getLon().getClass());

        }

        @Test
        @DisplayName("Check that verifyLatRange ... within [-90, 90] ") //A
        void checkThatVerifyLatRangeNinety (){
            //use mocking
            //pass a value less than -90
            //do another one above 90
            // another {-90, 0}, 0, {0, 90}
        }

        @Test
        @DisplayName("Check that verifyLongRange ... within [-180, 180] ") //A
        void checkThatVerifyLongRangeOneEighty (){
            //use mocking
            //pass a value less than -180
            //do another one above 180
            // another {-180, 0}, 0, {0, 180}
        }

    }

    @DisplayName("Clouds") //A
    @Nested
    class Clouds{
        @Test
        @DisplayName("Check that cloudValueIsInRange[0,100] ") //clouds
        void checkThatCloudsPercentage (){
            //mock clouds
            //-, 0, 0-100, 100+
        }
    }

    @DisplayName("Main") //F
    @Nested
    class MainTests {
        @Test
        @DisplayName("Check temp values are present")
        void TempPresent() {

            Assertions.assertNotNull(main.getTemp());
        }

        @Test
        @DisplayName("Check Temp Min values are present")
        void TempMinPresent(){

            Assertions.assertNotNull(main.getTempMin());
        }

        @Test
        @DisplayName("Check feel like values are present")
        void FeelsLikeValuePresent(){

            Assertions.assertNotNull(main.getFeelsLike());
        }
        @Test
        @DisplayName("Check temp datatype")
        void TempType(){

            Assertions.assertSame(Double.class,main.getTemp().getClass());

        }
        @Test
        @DisplayName("Check min temp datatype")
        void MinTempType(){

            Assertions.assertSame(Double.class,main.getTempMin().getClass());

        }

        @Test
        @DisplayName("Check feels like datatype")
        void FeelsLikeType(){

            Assertions.assertSame(Double.class,main.getFeelsLike().getClass());

        }



    }


    @DisplayName("") //F
    @Nested
    class OWWeatherDTO{

    }

    @DisplayName("Rain") //A
    @Nested
    class Rain{
        @Test
        @DisplayName("Check that rainInMm ...") //RAIN
        void checkThatRainInM (){
            //mock rain
            //pass some fake rain?
        }

        @Test
        @DisplayName("Check that rainForLastHour")
        void checkThatRainForLastHour (){
        }

        @Test
        @DisplayName("Check that rainForLastThreeHours ")
        void checkThatRainForLastThreeHour (){
        }

        @Test
        @DisplayName("Check that rainTakeNull ")
        void checkThatRainTakeNull (){
        }
    }

    @DisplayName("Snow") //A
    @Nested
    class Snow{
        @Test
        @DisplayName("Check that  3 hours...")
        void checkThatSnow3Hours (){

        }

        @Test
        @DisplayName("Check that  1 hours...")
        void checkThatSnow1Hours (){

        }

        @Test
        @DisplayName("Check that snowNull")
        void checkThatSnowNull (){
        }

    }

    @DisplayName("Sys") //A
    @Nested
    class Sys{

    }

    @DisplayName("WeatherDTOHelper") //F
    @Nested
    class WeatherDTOHelper{

    }

    @DisplayName("") //A
    @Nested
    class WeatherItem{

    }

    @Nested
    @DisplayName("Wind")  //F
    class WindTests {
        @Test
        @DisplayName("Check wind & gust values present and valid")
        void TempPresentAndValid() {

            Assertions.assertNotNull(wind.getSpeed());
            Assertions.assertNotNull(wind.getGust());
            Assertions.assertTrue(wind.validSpeedAndGust());
        }

            @Test
            @DisplayName("Gust is greater than wind speed")
            void GustGreaterThanWindSpeed() {

                Assertions.assertTrue(wind.isGustGreaterThanSpeed());
            }


        @Test
        @DisplayName("Degrees validity and present check")
        void DegreesValidityAndPresent() {

            Assertions.assertNotNull(wind.getDeg());
            Assertions.assertTrue(wind.isValidDegreesValue());
        }





    }


    @DisplayName("Injector Tests") //A
    @Nested
    class CheckForValidEndpointReturns{
        @Test
        @DisplayName("Check that injector returns correct THING (DTO?) by city")
        void checkThatValidReturnFromCityEndpoint (){
            actualResponse = Injector.instructionstoInjectByCity(relevantConnectionManager);

            Assertions.assertEquals(Response.class, actualResponse.getClass());
        }

        //repeat similar for different ?endpoints? need to see injector/connections manager first for understanding

    }

    @DisplayName("Addi other tests") //A
    @Nested
    class PotentialDelete{
//  - potentially duplicated, but to be checked at later date to ensure coverage

        @Test
        @DisplayName("Check that ensureIconValid ") //RESPONSE
        void checkThatEnsureIconValid (){

        }

        @Test
        @DisplayName("Check that checkHumidityRange") //HUMIDITY
        void checkThatHumidityRange (){

            // mock humidity
            // pass this into something

        }

        @Test //VISIBILITY
        @DisplayName("Check that methodToCheckVisibility ... positive for [0, 10K], false {-inf, 0}, {10K, inf}")
        void checkThatMethodToCheckVisibility (){
        }


        @Test
        @DisplayName("Check that checkDtWithin24Hours tests for past 24 hours ")
        void checkThat (){
            //may have additional internal methods to assist with this
            //mock something

        }

    }






}


