/*
package com.sparta.owframework.frameworktests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.owframework.OWWeatherDTO.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FrameworkTestsAddi {
    public static OWWeatherDTO weatherDTO;

    public static List<WeatherItem> weatherItem;

*/

    /*
    @Disabled("Not necessary/working")
    @DisplayName("Testing empty values")
    @Nested
    class EmptyValues{
        @BeforeAll
        static void setupAll(){
            ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/weatherEmpty.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            weatherItem = (WeatherItem) weatherDTO.getWeather();
        }

        @DisplayName("Rain Empty")
        @Nested
        class RainEmpty{

            @Test
            @DisplayName("Check that hasJsonMember1h returns false for empty values ") //note this, rain must be there but null values
            void checkThatHasJsonMember1hFalseForEmptyRain (){
                Assertions.assertFalse(weatherDTO.getRain().hasJsonMember1h());
            }

            @Test
            @DisplayName("Check that hasJsonMember3h returns false for empty values ")
            void checkThatHasJsonMember3hFalseForEmptyRain (){
                Assertions.assertFalse(weatherDTO.getRain().hasJsonMember3h());
            }
        }

        @DisplayName("Snow Empty")
        @Nested
        class SnowEmpty{

            @Test
            @DisplayName("Check that hasJsonMember1h returns false for empty values ") //note this, rain must be there but null values
            void checkThatHasJsonMember1hFalseForEmptySnow (){
                Assertions.assertFalse(weatherDTO.getSnow().hasJsonMember1h());
            }

            @Test
            @DisplayName("Check that hasJsonMember3h returns false for empty values ")
            void checkThatHasJsonMember3hFalseForEmptySnow (){
                Assertions.assertFalse(weatherDTO.getSnow().hasJsonMember3h());
            }
        }

        @DisplayName("Sys Empty")
        @Nested
        class SysEmpty{

            @Test
            @DisplayName("Check that hasCountry false for null country")
            void checkThatHasCountryFalseForNullCountry (){
                Assertions.assertFalse(weatherDTO.getSys().hasCountry());
            }

            @Test
            @DisplayName("Check that hasSunrise false for null Sunrise")
            void checkThatHasSunriseFalseForNullSunrise (){
                Assertions.assertFalse(weatherDTO.getSys().hasSunrise());
            }

            @Test
            @DisplayName("Check that hasSunset false for null Sunset")
            void checkThatHasSunsetFalseForNullSunset (){
                Assertions.assertFalse(weatherDTO.getSys().hasSunset());
            }

            @Test
            @DisplayName("Check that hasId false for null Id")
            void checkThatHasIdFalseForNullId (){
                Assertions.assertFalse(weatherDTO.getSys().hasId());
            }

            @Test
            @DisplayName("Check that hasType false for null Type")
            void checkThatHasTypeFalseForNullType (){
                Assertions.assertFalse(weatherDTO.getSys().hasType());
            }

            @Test
            @DisplayName("Check that hasMessage false for null message")
            void checkThatHasMessageFalseForNullMessage (){
                Assertions.assertFalse(weatherDTO.getSys().hasMessage());
            }

            @Disabled("Unsure if necessary/logical test")
            @Test
            @DisplayName("Check that hasExactlyTwoChars false if country.length == null ")
            void checkThatHasExactlyTwoCharsFalseIfCountry (){
            }



        }

        @DisplayName("WeatherItem Empty")
        @Nested
        class WeatherItemEmpty{

            @Test
            @DisplayName("Check that hasId false if null ID ")
            void checkThatHasIdFalseIfNullID () {
                Assertions.assertFalse(weatherItem.hasId());
            }

            @Test
            @DisplayName("Check that hasIcon false if null Icon ")
            void checkThatHasIconFalseIfNullIcon () {
                Assertions.assertFalse(weatherItem.hasIcon());
            }

            @Test
            @DisplayName("Check that hasDescription false if null Description ")
            void checkThatHasDescriptionFalseIfNullDescription () {
                Assertions.assertFalse(weatherItem.hasDescription());
            }

            @Test
            @DisplayName("Check that hasMain false if null Main ")
            void checkThatHasMainFalseIfNullMain () {
                Assertions.assertFalse(weatherItem.hasMain());
            }

        }


    }

     */


/*
    @DisplayName("Testing within boundary")
    @Nested
    class withinBoundary{
        @BeforeAll
        static void setupAll(){
            ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/correct_weather_data.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            weatherItem = weatherDTO.getWeather().get(0);

        }

        @DisplayName("Coord within bounds")
        @Nested
        class CoordWithinBounds{
            @Test
            @DisplayName("Check that isLatBetweenNeg90AndPos90 true for within -90, 90") //A
            void checkThatIsLatBetweenNeg90AndPos90TrueInBoundary (){
                Assertions.assertTrue(weatherDTO.getCoord().isLatBetweenNeg90AndPos90());
            }

            @Test
            @DisplayName("Check that isLongBetweenNeg180AndPos180 is true within ")
            void checkThatIsLongBetweenNeg180AndPos180FalseHigherThan180 (){
                Assertions.assertTrue(weatherDTO.getCoord().isLongBetweenNeg180AndPos180());
            }
        }

        @DisplayName("Rain")
        @Nested
        class Rain{

            @Test
            @DisplayName("Check that hasJsonMember1h returns true for non-empty values ")
            void checkThatHasJsonMember1hTrueNonEmpty (){
                Assertions.assertTrue(weatherDTO.getRain().hasJsonMember1h());
            }

            @Test
            @DisplayName("Check that hasJsonMember3h true for non-empty values ")
            void checkThatHasJsonMember3hTrueNonEmpty (){
                Assertions.assertTrue(weatherDTO.getRain().hasJsonMember3h());
            }

        }

        @DisplayName("Snow")
        @Nested
        class Snow{

            @Test
            @DisplayName("Check that hasJsonMember1h returns true for non-empty values ")
            void checkThatHasJsonMember1hTrueNonEmptySnow (){
                Assertions.assertTrue(weatherDTO.getSnow().hasJsonMember1h());
            }

            @Test
            @DisplayName("Check that hasJsonMember3h true for non-empty values ")
            void checkThatHasJsonMember3hTrueNonEmptySnow (){
                Assertions.assertTrue(weatherDTO.getSnow().hasJsonMember3h());
            }

        }

        @DisplayName("Sys")
        @Nested
        class Sys{

            @Test
            @DisplayName("Check that hasCountry true for non-null country")
            void checkThatHasCountryTrueForNonNullCountry (){
                Assertions.assertTrue(weatherDTO.getSys().hasCountry());
            }

            @Test
            @DisplayName("Check that hasSunrise true for non-null Sunrise")
            void checkThatHasSunriseTrueForNonNullSunrise (){
                Assertions.assertTrue(weatherDTO.getSys().hasSunrise());
            }

            @Test
            @DisplayName("Check that hasSunset true for non-null Sunset")
            void checkThatHasSunsetTrueForNonNullSunset (){
                Assertions.assertTrue(weatherDTO.getSys().hasSunset());
            }

            @Test
            @DisplayName("Check that hasId true for non-null Id")
            void checkThatHasIdTrueForNonNullId (){
                Assertions.assertTrue(weatherDTO.getSys().hasId());
            }

            @Test
            @DisplayName("Check that hasType true for non-null Type")
            void checkThatHasTypeTrueForNonNullType (){
                Assertions.assertTrue(weatherDTO.getSys().hasType());
            }

            @Test
            @DisplayName("Check that hasMessage true for non-null message")
            void checkThatHasMessageTrueForNonNullMessage (){
                Assertions.assertTrue(weatherDTO.getSys().hasMessage());
            }

            @Test
            @DisplayName("Check that isSunriseBeforeSunset true for sunset after sunrise ")
            void checkThatIsSunriseBeforeSunsetTrueForSunsetLast (){
                Assertions.assertTrue(weatherDTO.getSys().isSunriseBeforeSunset());
            }

            @Test
            @DisplayName("Check that hasExactlyTwoChars true if country.length == 2 ")
            void checkThatHasExactlyTwoCharsFalseIfCountry (){
                Assertions.assertTrue(weatherDTO.getSys().hasExactlyTwoChars());
            }



        }

        @DisplayName("WeatherItem")
        @Nested
        class WeatherItemTest{

            @Test
            @DisplayName("Check that hasId true if not null ID ")
            void checkThatHasIdTrueIfNotNullID () {
                Assertions.assertTrue(weatherItem.hasId());
            }

            @Test
            @DisplayName("Check that hasIcon true if not null Icon ")
            void checkThatHasIconTrueIfNotNullIcon () {
                Assertions.assertTrue(weatherItem.hasIcon());
            }

            @Test
            @DisplayName("Check that hasDescription true if not null Description ")
            void checkThatHasDescriptionTrueIfNotNullDescription () {
                Assertions.assertTrue(weatherItem.hasDescription());
            }

            @Test
            @DisplayName("Check that hasMain true if not null Main ")
            void checkThatHasMainTrueIfNotNullMain () {
                Assertions.assertTrue(weatherItem.hasMain());
            }


            @Test
            @DisplayName("Check that correct combination returns true isValidIconDescMainIdCombo")
            void checkThatCorrectCombinationReturnsTrueIsValidIconDescMainIDCombo (){
                Assertions.assertTrue(weatherItem.isValidIconDescMainIdCombo());
            }


        }

    }








}

 */

