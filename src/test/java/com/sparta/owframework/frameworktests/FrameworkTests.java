package com.sparta.owframework.frameworktests;


import com.sparta.owframework.OWWeatherDTO.Coord;
import com.sparta.owframework.OWWeatherDTO.Main;
import com.sparta.owframework.OWWeatherDTO.OWWeatherDTO;
import com.sparta.owframework.OWWeatherDTO.Wind;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;


public class FrameworkTests {

    private static OWWeatherDTO weatherDTO;
    @BeforeAll
            static void setUpAll() {

        ObjectMapper mapper = new ObjectMapper();
        {
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/correct_weather_data.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    @Nested //F
    @DisplayName("Coord") //F
    class CoordTests{ //A & F tests

        @Test
        @DisplayName("Check Lon values are present")
        void LonValuePresent(){

            Assertions.assertNotNull(weatherDTO.getCoord().getLon());

        }
        @Test
        @DisplayName("Check Lat values are present")
        void LatValuePresent(){

            Assertions.assertNotNull(weatherDTO.getCoord().getLat());

        }

        @Test
        @DisplayName("Check Lat datatype")
        void LatDataType(){

            Assertions.assertSame(Double.class,weatherDTO.getCoord().getLat().getClass());
        }

        @Test
        @DisplayName("Check Lon datatype")
        void LonDataType(){

            Assertions.assertSame(Double.class,weatherDTO.getCoord().getLon().getClass());

        }



        @Test
        @DisplayName("Check that verifyLatRange ... within [-90, 90] ") //A
        void checkThatVerifyLatRangeNinety (){
            //use mocking
            //pass a value less than -90
            //do another one above 90
            // another {-90, 0}, 0, {0, 90}
            Assertions.assertTrue(weatherDTO.getCoord().isLatBetweenNeg90AndPos90());
        }

        @Test
        @DisplayName("Check that verifyLongRange ... within [-180, 180] ") //A
        void checkThatVerifyLongRangeOneEighty (){
            //use mocking
            //pass a value less than -180
            //do another one above 180
            // another {-180, 0}, 0, {0, 180}
            Assertions.assertTrue(weatherDTO.getCoord().isLongBetweenNeg180AndPos180());
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

            Assertions.assertTrue(weatherDTO.getMain().hasTemp());
        }

        @Test
        @DisplayName("Check Temp Min values is present")
        void TempMinPresent(){

            Assertions.assertTrue(weatherDTO.getMain().hasTempMin());
        }

        @Test
        @DisplayName("Check feel like values are present")
        void FeelsLikeValuePresent(){

            Assertions.assertTrue(weatherDTO.getMain().hasFeelsLike());
        }

        @Test
        @DisplayName("Check temp max value is  present")
        void MaxValueValuePresent(){

            Assertions.assertTrue(weatherDTO.getMain().hasTempMax());
        }

        @Test
        @DisplayName("Check humidity value is  present")
        void HumidityValuePresent(){

            Assertions.assertTrue(weatherDTO.getMain().hasHumidity());
        }

        @Test
        @DisplayName("Check pressure value is  present")
        void PressureValuePresent(){

            Assertions.assertTrue(weatherDTO.getMain().hasPressure());
        }

        @Test
        @DisplayName("Check sea level value is  present")
        void SeaLevelValuePresent(){

            Assertions.assertTrue(weatherDTO.getMain().hasSeaLevel());
        }

        @Test
        @DisplayName("Check ground level value is  present")
        void GroundLevelValuePresent(){

            Assertions.assertTrue(weatherDTO.getMain().hasGrndLevel());
        }
        @Test
        @DisplayName("Check temp datatype")
        void TempType(){

            Assertions.assertSame(Double.class,weatherDTO.getMain().getTemp().getClass());

        }
        @Test
        @DisplayName("Check min temp datatype")
        void MinTempType(){

            Assertions.assertSame(Double.class,weatherDTO.getMain().getTempMin().getClass());

        }

        @Test
        @DisplayName("Check feels like datatype")
        void FeelsLikeType(){

            Assertions.assertSame(Double.class,weatherDTO.getMain().getFeelsLike().getClass());

        }

        @Test
        @DisplayName("Temperature between the Temp minimum and maximum")
        void TemperatureBetwnMinMax(){

            Assertions.assertTrue(weatherDTO.getMain().isTempBetweenTempMinAndMax());

        }
        @Test
        @DisplayName("Pressure between 100 and 1100")
        void PressureMinMax(){

            Assertions.assertTrue(weatherDTO.getMain().isPressureBetween100And1100());

        }


    }

    @Nested
    @DisplayName("OWWeatherDTP")  //F
    class OWWeatherDTO{
        @Test
        @DisplayName("Id not null")
        void IdNotNull() {
            Assertions.assertNotNull(weatherDTO.getId());

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


//    @Nested
//    @DisplayName("WeatherDTOHelper") //F
//    class WeatherDTOHelper{
//
//        @Test
//        @DisplayName("between 0 and 100")
//        void Between0and100(){
//            Assertions.assertTrue(weatherDTO.get.isbetween);
//        }
//
//    }

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

            Assertions.assertTrue(weatherDTO.getWind().hasSpeed());
            Assertions.assertTrue(weatherDTO.getWind().hasGust());
            Assertions.assertTrue(weatherDTO.getWind().validSpeedAndGust());
        }
            @Test
            @DisplayName("Gust is greater than wind speed")
            void GustGreaterThanWindSpeed() {

                Assertions.assertTrue(weatherDTO.getWind().isGustGreaterThanSpeed());
            }

        @Test
        @DisplayName("Degrees validity and present check")
        void DegreesValidityAndPresent() {

            Assertions.assertTrue(weatherDTO.getWind().hasDeg();
            Assertions.assertTrue(weatherDTO.getWind().isValidDegreesValue());
        }

        @Test
        @DisplayName("Deg not null")
        void DegPresent() {

            Assertions.assertNotNull(weatherDTO.getWind().getSpeed());
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
}

