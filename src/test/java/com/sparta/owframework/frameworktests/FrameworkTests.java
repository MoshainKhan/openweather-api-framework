package com.sparta.owframework.frameworktests;

import com.sparta.owframework.ConnectionManager;
import com.sparta.owframework.OWWeatherDTO.*;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;

public class FrameworkTests {

    static Clouds clouds;

    //for before all
    // private static String apiKey = locationOfAPIKey;

    @BeforeAll
    static void setupAll(){
        ConnectionManager.getConnection(option, value of option); //apiKey?
        ConnectionManager.getConnection("city", "London"); //apiKey?
        // etc.
    }

    @DisplayName("Injector Tests")
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

    @DisplayName("")
    @Nested
    class name{

        @Test
        @DisplayName("Check that ensureIconValid ") //RESPONSE
        void checkThatEnsureIconValid (){

        }

        @Test
        @DisplayName("Check that checkHumidityRange") //HUMIDITY
        void checkThatHumidityRange (){
            /*
            mock humidity
            pass this into something

             */
        }

        @Test //VISIBILITY
        @DisplayName("Check that methodToCheckVisibility ... positive for [0, 10K], false {-inf, 0}, {10K, inf}")
        void checkThatMethodToCheckVisibility (){
        }

        @Test
        @DisplayName("MOCKING")
        void mockingTests (){
            Clouds mockCloud = Mockito.mock(Clouds.class);
            Coord mockCoord = Mockito.mock(Coord.class);
            Main mockMain = Mockito.mock(Main.class);
            Rain mockRain = Mockito.mock(Rain.class);
            Snow mockSnow = Mockito.mock(Snow.class);
            Sys mockSys = Mockito.mock(Sys.class);
            WeatherItem mockWeatherItem = Mockito.mock(WeatherItem.class);
            Wind mockWind = Mockito.mock(Wind.class);


            Response mockResponse = Mockito.mock(Response.class);
            Injector.inject(something);

            Mockito.when(...)

        }

    }

    @DisplayName("Rain")
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

    @DisplayName("Snow")
    @Nested
    class Snow{
        @Test
        @DisplayName("Check that  3 hours...")
        void checkThatSnow3Hours (){

        }

    }

    @DisplayName("Temperature Helper Methods")
    @Nested
    class Temperature{

        @Test
        @DisplayName("Check that maxTempGreaterMin") //TEMP
        void checkThatMaxTempGreaterMin (){
            //mock temperatures/main/whereever this comes from
            //pass these fake ones in?
            //ensure positive integer output, or boolean or whatever etc.

            //depending on method, maybe test once with min > max, max < min, and min = max
        }

        @Test
        @DisplayName("Check that currentTempWithinMinMaxRange ")
        void checkThatCurrentTempWithinMinMaxRange (){
            //mock the temperature again
            //pass in fake temperature?

        }

        @Test
        @DisplayName("Check that Kelvin Positive Integer ")
        void checkThat (){
            //mock temperature
            //pass in negative, 0, and positive
        }

        @Test //HELP
        @DisplayName("Check that TemperatureValid ...")
        void checkThatTempValid (){

            //perhaps pass some v cold temperatures etc?

        }

    }

    @DisplayName("Coord helper methods ")
    @Nested
    class Coord{
        @Test
        @DisplayName("Check that checkCoordinateFormat ... format of coordinates")
        void checkThatCheckCoordinate (){
            //mocking needed
        }

        @Test
        @DisplayName("Check that verifyLatRange ... within [-90, 90] ")
        void checkThatVerifyLatRangeNinety (){
            //use mocking
            //pass a value less than -90
            //do another one above 90
            // another {-90, 0}, 0, {0, 90}
        }

        @Test
        @DisplayName("Check that verifyLongRange ... within [-180, 180] ")
        void checkThatVerifyLongRangeOneEighty (){
            //use mocking
            //pass a value less than -180
            //do another one above 180
            // another {-180, 0}, 0, {0, 180}
        }


    }

    @DisplayName("Clouds")
    @Nested
    class Clouds{
        @Test
        @DisplayName("Check that cloudValueIsInRange[0,100] ") //clouds
        void checkThatCloudsPercentage (){
            //mock clouds
            //-, 0, 0-100, 100+
        }
    }





}
