

package com.sparta.owframework.frameworktests;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import com.sparta.owframework.OWWeatherDTO.*;
import java.io.File;
import java.io.IOException;


public class FrameworkTests {


    public static OWWeatherDTO weatherDTO;
    @BeforeAll
    static void setUpAll() {

        ObjectMapper mapper = new ObjectMapper();
            try {
                weatherDTO = mapper.readValue(new File("src/test/java/com/sparta/owframework/filemanager/correct_weather_data.json"), OWWeatherDTO.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        @Nested
        @DisplayName("Coord")
        class CoordTests {

            @Test
            @DisplayName("Check Lon values are present")
            void LonValuePresent() {
                Assertions.assertNotNull(weatherDTO.getCoord().getLon());

            }

            @Test
            @DisplayName("Check Lat values are present")
            void LatValuePresent() {

                Assertions.assertNotNull(weatherDTO.getCoord().getLat());

            }

            @Test
            @DisplayName("Check Lat datatype")
            void LatDataType() {

                Assertions.assertSame(Double.class, weatherDTO.getCoord().getLat().getClass());
            }

            @Test
            @DisplayName("Check Lon datatype")
            void LonDataType() {

                Assertions.assertSame(Double.class, weatherDTO.getCoord().getLon().getClass());

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
            void TempMinPresent() {

                Assertions.assertTrue(weatherDTO.getMain().hasTempMin());
            }

            @Test
            @DisplayName("Check feel like values are present")
            void FeelsLikeValuePresent() {

                Assertions.assertTrue(weatherDTO.getMain().hasFeelsLike());
            }

            @Test
            @DisplayName("Check temp max value is  present")
            void MaxValueValuePresent() {

                Assertions.assertTrue(weatherDTO.getMain().hasTempMax());
            }

            @Test
            @DisplayName("Check humidity value is  present")
            void HumidityValuePresent() {

                Assertions.assertTrue(weatherDTO.getMain().hasHumidity());
            }

            @Test
            @DisplayName("Check pressure value is  present")
            void PressureValuePresent() {

                Assertions.assertTrue(weatherDTO.getMain().hasPressure());
            }

            @Test
            @DisplayName("Check sea level value is  present")
            void SeaLevelValuePresent() {

                Assertions.assertTrue(weatherDTO.getMain().hasSeaLevel());
            }

            @Test
            @DisplayName("Check ground level value is  present")
            void GroundLevelValuePresent() {

                Assertions.assertTrue(weatherDTO.getMain().hasGrndLevel());
            }

            @Test
            @DisplayName("Check temp datatype")
            void TempType() {

                Assertions.assertSame(Double.class, weatherDTO.getMain().getTemp().getClass());

            }

            @Test
            @DisplayName("Check min temp datatype")
            void MinTempType() {

                Assertions.assertSame(Double.class, weatherDTO.getMain().getTempMin().getClass());

            }

            @Test
            @DisplayName("Check feels like datatype")
            void FeelsLikeType() {

                Assertions.assertSame(Double.class, weatherDTO.getMain().getFeelsLike().getClass());

            }

            @Test
            @DisplayName("Temperature between the Temp minimum and maximum")
            void TemperatureBetwnMinMax() {

                Assertions.assertTrue(weatherDTO.getMain().isTempBetweenTempMinAndMax());

            }

            @Test
            @DisplayName("Pressure between 100 and 1100")
            void PressureMinMax() {

                Assertions.assertTrue(weatherDTO.getMain().isPressureBetween100And1100());

            }


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
        class WeatherItem {

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

                Assertions.assertTrue(weatherDTO.getWind().hasDeg());
                Assertions.assertTrue(weatherDTO.getWind().isValidDegreesValue());
            }

            @Test
            @DisplayName("Deg not null")
            void DegPresent() {

                Assertions.assertNotNull(weatherDTO.getWind().getSpeed());
            }

        }


    }

