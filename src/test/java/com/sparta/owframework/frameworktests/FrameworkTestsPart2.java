package com.sparta.owframework.frameworktests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.owframework.OWWeatherDTO.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

public class FrameworkTestsPart2 {
    public static OWWeatherDTO weatherDTO;

    public static WeatherItem weatherItem;


    @DisplayName("Testing boundary (below minimum)")
    @Nested
    class OutOfBoundMinimum {
        @BeforeAll
        static void setupAll(){
            ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/weatherOutOfBounds.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @DisplayName("Coord below min")
        @Nested
        class CoordBelowMin{
            @Test
            @DisplayName("Check that isLatBetweenNeg90AndPos90 false for lower than -90 ") //A
            void checkThatisLatBetweenNeg90AndPos90FalseLowerThanMinus90 (){

                Assertions.assertFalse(weatherDTO.getCoord().isLatBetweenNeg90AndPos90());
            }

            @Test
            @DisplayName("Check that isLongBetweenNeg180AndPos180 is false for lower than -180")
            void checkThatisLongBetweenNeg180AndPos180FalseLowerThanMinus180 (){
                Assertions.assertFalse(weatherDTO.getCoord().isLongBetweenNeg180AndPos180());
            }

        }

        @DisplayName("Sys below bound")
        @Nested
        class SysBelowBound{
            @Test
            @DisplayName("Check that hasExactlyTwoChars false if country.length < 2 ")
            void checkThatHasExactlyTwoCharsFalseIfCountryLessThanTwo (){
                Assertions.assertFalse(weatherDTO.getSys().hasExactlyTwoChars());
            }

        }

        @DisplayName("Main below bound")
        @Nested
        class MainBelowBound{
            @Test
            @DisplayName("Check that is5LessOr5More false for more than 5 below")
            void checkThatis5LessOr5MoreIsFalseForMoreThan5Below (){
                Assertions.assertFalse(weatherDTO.getMain().is5LessOr5More());
            }

        }


    }


    @DisplayName("Testing boundary (above maximum)")
    @Nested
    class OutOfBoundsMaximum{
        @BeforeAll
        static void setupAll(){
            ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/weatherOutOfBoundsMax.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @DisplayName("Coord above max")
        @Nested
        class CoordAboveMax{


            @Test
            @DisplayName("Check that isLatBetweenNeg90AndPos90 false for higher than 90 ") //A
            void checkThatIsLatBetweenNeg90AndPos90FalseHigherThan90 (){

                Assertions.assertFalse(weatherDTO.getCoord().isLatBetweenNeg90AndPos90());
            }

            @Test
            @DisplayName("Check that isLongBetweenNeg180AndPos180 is false for higher than 180")
            void checkThatIsLongBetweenNeg180AndPos180FalseHigherThan180 (){
                Assertions.assertFalse(weatherDTO.getCoord().isLongBetweenNeg180AndPos180());
            }
        }

        @DisplayName("Sys above bound")
        @Nested
        class SysAboveBound{
            @Test
            @DisplayName("Check that hasExactlyTwoChars false if country.length > 2 ")
            void checkThatHasExactlyTwoCharsFalseIfCountryMoreThanTwo (){
                Assertions.assertFalse(weatherDTO.getSys().hasExactlyTwoChars());
            }

        }

        @DisplayName("Main above bound")
        @Nested
        class MainAboveBound{
            @Test
            @DisplayName("Check that is5LessOr5More false for more than 5 above")
            void checkThatis5LessOr5MoreIsFalseForMoreThan5Above (){
                Assertions.assertFalse(weatherDTO.getMain().is5LessOr5More());
            }

        }


    }

    @DisplayName("Testing boundary (on minimum bound)")
    @Nested
    class BoundaryValueMin{
        @BeforeAll
        static void setupAll(){
            ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/weatherOnBoundaryMin.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        @DisplayName("Coord on min boundary")
        @Nested
        class CoordMinBoundary{
            @Test
            @DisplayName("Check that isLatBetweenNeg90AndPos90 true for -90") //A
            void checkThatIsLatBetweenNeg90AndPos90TrueFor90 (){

                Assertions.assertTrue(weatherDTO.getCoord().isLatBetweenNeg90AndPos90());
            }

            @Test
            @DisplayName("Check that isLongBetweenNeg180AndPos180 true for -180")
            void checkThatIsLongBetweenNeg180AndPos180TrueFor180 (){
                Assertions.assertTrue(weatherDTO.getCoord().isLongBetweenNeg180AndPos180());
            }
        }

        @DisplayName("Main on min bound")
        @Nested
        class MainOnMinBound{
            @Test
            @DisplayName("Check that is5LessOr5More true for exactly 5 below")
            void checkThatis5LessOr5MoreIsTrueForExactly5Below (){
                Assertions.assertTrue(weatherDTO.getMain().is5LessOr5More());
            }

        }

    }

    @DisplayName("Testing boundary (on max bound)")
    @Nested
    class BoundaryValueMax {
        @BeforeAll
        static void setupAll(){
            ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/weatherOnBoundaryMax.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @DisplayName("Coord on max bound")
        @Nested
        class CoordMaxBound{
            @Test
            @DisplayName("Check that isLatBetweenNeg90AndPos90 true for 90 ") //A
            void checkThatIsLatBetweenNeg90AndPos90TrueFor90 (){
                Assertions.assertTrue(weatherDTO.getCoord().isLatBetweenNeg90AndPos90());
            }

            @Test
            @DisplayName("Check that isLongBetweenNeg180AndPos180 is true for 180")
            void checkThatIsLongBetweenNeg180AndPos180TrueFor180 (){
                Assertions.assertTrue(weatherDTO.getCoord().isLongBetweenNeg180AndPos180());
            }
        }

        @DisplayName("Main on max bound")
        @Nested
        class MainOnMaxBound{
            @Test
            @DisplayName("Check that is5LessOr5More true for exactly 5 above")
            void checkThatis5LessOr5MoreIsTrueForExactly5Above (){
                Assertions.assertTrue(weatherDTO.getMain().is5LessOr5More());
            }

        }

    }

    @DisplayName("Testing invalid values (e.g. min < max) ")
    @Nested
    class InvalidValues{
        @BeforeAll
        static void setupAll(){
            ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/Incorrect_weather_data.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            weatherItem = weatherDTO.getWeatherItem(0);
          //  weatherItem = weatherDTO.getWeather().get(0);
        }

        @DisplayName("Sys invalid")
        @Nested
        class SysInvalid{

            @Test
            @DisplayName("Check that isSunriseBeforeSunset false for sunset before sunrise ")
            void checkThatIsSunriseBeforeSunsetFalseForSunsetFirst (){
                Assertions.assertFalse(weatherDTO.getSys().isSunriseBeforeSunset());
            }
        }

        @DisplayName("WeatherItem invalid")
        @Nested
        class WeatherItemInvalid{
            @Test
            @DisplayName("Check that incorrect combination returns false isValidIconDescMainIdCombo")
            void checkThatIncorrectCombinationReturnsFalseIsValidIconDescMainIDCombo (){
                Assertions.assertFalse(weatherItem.isValidIconDescMainIdCombo());
            }

        }

    }

    @DisplayName("Testing within boundary")
    @Nested
    class WithinBoundary {
        @BeforeAll
        static void setupAll(){
            ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/correct_weather_data.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            weatherItem = weatherDTO.getWeatherItem(0);
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
        class RainInBoundary{

            @Test
            @DisplayName("Check that hasJsonMember1h returns true for non-empty values ")
            void checkThatHasJsonMember1hTrueNonEmpty (){
                Assumptions.assumeTrue(weatherDTO.hasRain());
                Assertions.assertTrue(weatherDTO.getRain().hasJsonMember1h());
            }

            @Test
            @DisplayName("Check that hasJsonMember3h true for non-empty values ")
            void checkThatHasJsonMember3hTrueNonEmpty (){
                Assumptions.assumeTrue(weatherDTO.hasRain());
                Assertions.assertTrue(weatherDTO.getRain().hasJsonMember3h());
            }

        }

        @DisplayName("Snow")
        @Nested
        class SnowInBoundary{

            @Test
            @DisplayName("Check that hasJsonMember1h returns true for non-empty values ")
            void checkThatHasJsonMember1hTrueNonEmptySnow (){
                Assumptions.assumeTrue(weatherDTO.hasSnow());
                Assertions.assertTrue(weatherDTO.getSnow().hasJsonMember1h());
            }

            @Test
            @DisplayName("Check that hasJsonMember3h true for non-empty values ")
            void checkThatHasJsonMember3hTrueNonEmptySnow (){
                Assumptions.assumeTrue(weatherDTO.hasSnow());
                Assertions.assertTrue(weatherDTO.getSnow().hasJsonMember3h());
            }

        }

        @DisplayName("Sys")
        @Nested
        class SysInBoundary{

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

        @DisplayName("Main in Boundary")
        @Nested
        class MainInBoundary{
            @Test
            @DisplayName("Check that is5LessOr5More true for within 5 of temp ")
            void checkThatis5LessOr5MoreIsTrueForWithin5OfTemp (){
                Assertions.assertTrue(weatherDTO.getMain().is5LessOr5More());
            }

        }

        @DisplayName("WeatherItem")
        @Nested
        class WeatherItem{



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

    @DisplayName("Testing incorrect precision")
    @Nested
    class IncorrectPrecision{

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
        @DisplayName("Check that has4NumsAfterDecimalPoint false for > 4 after decimal point")
        void checkThatHas4NumsAfterDecimalPointFalseForMoreThan4 (){
            Assertions.assertFalse(weatherDTO.getCoord().has4NumsAfterDecimalPoint(4.12345));
        }

        @Test
        @DisplayName("Check that has4NumsAfterDecimalPoint false for , 4 after decimal point")
        void checkThatHas4NumsAfterDecimalPointFalseForLessThan4 (){
            Assertions.assertFalse(weatherDTO.getCoord().has4NumsAfterDecimalPoint(4.123));
        }

        @Test
        @DisplayName("Check that has4NumsAfterDecimalPoint true for exactly 4 after decimal point")
        void checkThatHas4NumsAfterDecimalPointTrueFor4 (){
            Assertions.assertTrue(weatherDTO.getCoord().has4NumsAfterDecimalPoint(4.1234));
        }

    }






}
