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
    OWWeatherDTO owWeatherDTO = new OWWeatherDTO();
    WeatherDTOHelper weatherDTOHelper = new WeatherDTOHelper();



    @Nested //F
    @DisplayName("Coord") //F
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
            Assertions.assertTrue(coord.isLatBetweenNeg90AndPos90());
        }

        @Test
        @DisplayName("Check that verifyLongRange ... within [-180, 180] ") //A
        void checkThatVerifyLongRangeOneEighty (){
            //use mocking
            //pass a value less than -180
            //do another one above 180
            // another {-180, 0}, 0, {0, 180}
            Assertions.assertTrue(coord.isLongBetweenNeg180AndPos180());
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

    @Nested
    @DisplayName("Main") //F
    class MainTests {
        @Test
        @DisplayName("Check temp values is present")
        void TempPresent() {

            Assertions.assertTrue(main.hasTemp());
        }

        @Test
        @DisplayName("Check Temp Min values is present")
        void TempMinPresent(){

            Assertions.assertTrue(main.hasTempMin());
        }

        @Test
        @DisplayName("Check feel like values are present")
        void FeelsLikeValuePresent(){

            Assertions.assertTrue(main.hasFeelsLike());
        }

        @Test
        @DisplayName("Check temp max value is  present")
        void MaxValueValuePresent(){

            Assertions.assertTrue(main.hasTempMax());
        }

        @Test
        @DisplayName("Check humidity value is  present")
        void HumidityValuePresent(){

            Assertions.assertTrue(main.hasHumidity());
        }

        @Test
        @DisplayName("Check pressure value is  present")
        void PressureValuePresent(){

            Assertions.assertTrue(main.hasPressure());
        }

        @Test
        @DisplayName("Check sea level value is  present")
        void SeaLevelValuePresent(){

            Assertions.assertTrue(main.hasSeaLevel());
        }

        @Test
        @DisplayName("Check ground level value is  present")
        void GroundLevelValuePresent(){

            Assertions.assertTrue(main.hasGrndLevel());
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

        @Test
        @DisplayName("Temperature between the Temp minimum and maximum")
        void TemperatureBetwnMinMax(){

            Assertions.assertTrue(main.isTempBetweenTempMinAndMax());

        }
        @Test
        @DisplayName("Pressure between 100 and 1100")
        void PressureMinMax(){

            Assertions.assertTrue(main.isPressureBetween100And1100());

        }


    }

    @Nested
    @DisplayName("OWWeatherDTP")  //F
    class OWWeatherDTO{
        @Test
        @DisplayName("Id not null")
        void IdNotNull() {
            Assertions.assertNotNull(owWeatherDTO.has);

            }
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


    @Nested
    @DisplayName("WeatherDTOHelper") //F
    class WeatherDTOHelper{

        @Test
        @DisplayName("between 0 and 100")
        void Between0and100(){
            Assertions.assertTrue(weatherDTOHelper.isbetween);
        }

    }

    @DisplayName("") //A
    @Nested
    class WeatherItem{

    }

    @DisplayName("Wind")  //F
    @Nested

    class WindTests {
        @Test
        @DisplayName("Check wind & gust values present and valid")
        void TempPresentAndValid() {

            Assertions.assertTrue(wind.hasSpeed());
            Assertions.assertTrue(wind.hasGust());
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

            Assertions.assertTrue(wind.hasDeg();
            Assertions.assertTrue(wind.isValidDegreesValue());
        }

        @Test
        @DisplayName("Deg not null")
        void DegPresent() {

            Assertions.assertNotNull(wind.getSpeed());
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


