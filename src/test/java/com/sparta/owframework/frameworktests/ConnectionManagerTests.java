package com.sparta.owframework.frameworktests;

import com.sparta.owframework.openweathermanager.ConnectionManager;
import com.sparta.owframework.openweathermanager.Units;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConnectionManagerTests {
    static String base = "https://api.openweathermap.org/data/2.5/weather?";
    static String key = "&appid=fakeKey";

    @BeforeAll
    static void setupAll() {
        ConnectionManager.assignNewKey("fakeKey");
        System.out.println("base: " + base + "\n" +
                "Key: " + key);
    }

    @DisplayName("get Connections")
    @Nested
    class getConnections {

        @Test
        @DisplayName("check: getConnection returns baseurl and key as string")
        void checkGetConnectionReturnsBaseurlAndKeyAsString() {
            assertEquals(base + key,
                    ConnectionManager.getConnection());
        }

        @Test
        @DisplayName("check: getStatusCode returns correctly")
        void checkGetStatusCodeReturnsCorrectly() {
            assertEquals(401,
                    ConnectionManager.getStatusCode());
        }

        @DisplayName("City variations")
        @Nested
        class cityVariations {
            String cityNameStandard = base + "q=london" + key + Units.STANDARD.getValue();
            String cityNameMetric = base + "q=london" + key + Units.METRIC.getValue();
            String cityNameImperial = base + "q=london" + key + Units.IMPERIAL.getValue();

            @Test
            @DisplayName("check: getConnectionCity(name) returns correctly")
            void checkGetConnectionCityNameReturnsCorrectValue() {
                assertEquals(cityNameStandard,
                        ConnectionManager.getConnectionCity("london"));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, standard) returns correctly")
            void checkGetConnectionCityNameStandardReturnsCorrectValue() {
                assertEquals(cityNameStandard,
                        ConnectionManager.getConnectionCity("london", Units.STANDARD));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, metric) returns correctly")
            void checkGetConnectionCityNameMetricReturnsCityNameMetric() {
                assertEquals(cityNameMetric,
                        ConnectionManager.getConnectionCity("london", Units.METRIC));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, imperial) returns correctly")
            void checkGetConnectionCityNameImperialReturnsCityNameImperial() {
                assertEquals(cityNameImperial,
                        ConnectionManager.getConnectionCity("london", Units.IMPERIAL));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, country_code) returns correctly")
            void checkGetConnectionCityNameCountryCodeReturnsCorrectly() {
                assertEquals(base + "q=london,gb" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionCity("london", "gb"));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, country_code, standard) returns correctly")
            void checkGetConnectionCityNameCountryCodeStandardReturnsCorrectly() {
                assertEquals(base + "q=london,gb" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionCity("london", "gb", Units.STANDARD));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, country_code, metric) returns correctly")
            void checkGetConnectionCityNameCountryCodeMetricReturnsCorrectly() {
                assertEquals(base + "q=london,gb" + key + Units.METRIC.getValue(),
                        ConnectionManager.getConnectionCity("london", "gb", Units.METRIC));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, country_code, imperial) returns correctly")
            void checkGetConnectionCityNameCountryCodeImperialReturnsCorrectly() {
                assertEquals(base + "q=london,gb" + key + Units.IMPERIAL.getValue(),
                        ConnectionManager.getConnectionCity("london", "gb", Units.IMPERIAL));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, state_code, country_code) returns correctly")
            void checkGetConnectionCityNameStateCodeCountryCodeReturnsCorrectly() {
                assertEquals(base + "q=birmingham,al,us" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionCity("birmingham", "al", "us"));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, state_code, country_code, standard) returns correctly")
            void checkGetConnectionCityNameStateCodeCountryCodeStandardReturnsCorrectly() {
                assertEquals(base + "q=birmingham,al,us" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionCity("birmingham", "al", "us", Units.STANDARD));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, state_code, country_code, metric) returns correctly")
            void checkGetConnectionCityNameStateCodeCountryCodeMetricReturnsCorrectly() {
                assertEquals(base + "q=birmingham,al,us" + key + Units.METRIC.getValue(),
                        ConnectionManager.getConnectionCity("birmingham", "al", "us", Units.METRIC));
            }

            @Test
            @DisplayName("check: getConnectionCity(name, state_code, country_code, imperial) returns correctly")
            void checkGetConnectionCityNameStateCodeCountryCodeImperialReturnsCorrectly() {
                assertEquals(base + "q=birmingham,al,us" + key + Units.IMPERIAL.getValue(),
                        ConnectionManager.getConnectionCity("birmingham", "al", "us", Units.IMPERIAL));
            }

            @Test
            @DisplayName("check: getConnectionId(city_id) returns correctly")
            void checkGetConnectionCityIdReturnsCorrectly() {
                assertEquals(base + "id=100000" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionId(100000));
            }

            @Test
            @DisplayName("check: getConnectionId(city_id, standard) returns correctly")
            void checkGetConnectionIdCityIdStandardReturnsCorrectly() {
                assertEquals(base + "id=100000" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionId(100000, Units.STANDARD));
            }

            @Test
            @DisplayName("check: getConnectionId(city_id, metric) returns correctly")
            void checkGetConnectionIdCityIdMetricReturnsCorrectly() {
                assertEquals(base + "id=100000" + key + Units.METRIC.getValue(),
                        ConnectionManager.getConnectionId(100000, Units.METRIC));
            }

            @Test
            @DisplayName("check: getConnectionId(city_id, imperial) returns correctly")
            void checkGetConnectionIdCityIdImperialReturnsCorrectly() {
                assertEquals(base + "id=100000" + key + Units.IMPERIAL.getValue(),
                        ConnectionManager.getConnectionId(100000, Units.IMPERIAL));
            }

            @Test
            @DisplayName("check: getConnectionLatLon(lat, lon) returns correctly")
            void checkGetConnectionLatLonLatLonReturnsCorrectly() {
                assertEquals(base + "lat=0.0&lon=0.0" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionLatLon(0, 0));
            }

            @Test
            @DisplayName("check: getConnectionLatLon(lat, lon, standard) returns correctly")
            void checkGetConnectionLatLonLatLonStandardReturnsCorrectly() {
                assertEquals(base + "lat=0.0&lon=0.0" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionLatLon(0, 0, Units.STANDARD));
            }

            @Test
            @DisplayName("check: getConnectionLatLon(lat, lon, metric) returns correctly")
            void checkGetConnectionLatLonLatLonMetricReturnsCorrectly() {
                assertEquals(base + "lat=0.0&lon=0.0" + key + Units.METRIC.getValue(),
                        ConnectionManager.getConnectionLatLon(0, 0, Units.METRIC));
            }

            @Test
            @DisplayName("check: getConnectionLatLon(lat, lon, imperial) returns correctly")
            void checkGetConnectionLatLonLatLonImperialReturnsCorrectly() {
                assertEquals(base + "lat=0.0&lon=0.0" + key + Units.IMPERIAL.getValue(),
                        ConnectionManager.getConnectionLatLon(0, 0, Units.IMPERIAL));
            }

            @Test
            @DisplayName("check: getConnectionZipCode(zipCode) returns correctly")
            void checkGetConnectionZipCodeZipCodeReturnsCorrectly() {
                assertEquals(base + "zip=11101" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionZipCode("11101"));
            }

            @Test
            @DisplayName("check: getConnectionZipCode(zipCode, standard) returns correctly")
            void checkGetConnectionZipCodeZipCodeStandardReturnsCorrectly() {
                assertEquals(base + "zip=11101" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionZipCode("11101", Units.STANDARD));
            }

            @Test
            @DisplayName("check: getConnectionZipCode(zipCode, metric) returns correctly")
            void checkGetConnectionZipCodeZipCodeMetricReturnsCorrectly() {
                assertEquals(base + "zip=11101" + key + Units.METRIC.getValue(),
                        ConnectionManager.getConnectionZipCode("11101", Units.METRIC));
            }

            @Test
            @DisplayName("check: getConnectionZipCode(zipCode, imperial) returns correctly")
            void checkGetConnectionZipCodeZipCodeImperialReturnsCorrectly() {
                assertEquals(base + "zip=11101" + key + Units.IMPERIAL.getValue(),
                        ConnectionManager.getConnectionZipCode("11101", Units.IMPERIAL));
            }

            @Test
            @DisplayName("check: getConnectionZipCode(zipCode, countryCode) returns correctly")
            void checkGetConnectionZipCodeZipCodeCountryCodeReturnsCorrectly() {
                assertEquals(base + "zip=sw2,gb" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionZipCode("sw2", "gb"));
            }

            @Test
            @DisplayName("check: getConnectionZipCode(zipCode, countryCode, standard) returns correctly")
            void checkGetConnectionZipCodeZipCodeCountryCodeStandardReturnsCorrectly() {
                assertEquals(base + "zip=sw2,gb" + key + Units.STANDARD.getValue(),
                        ConnectionManager.getConnectionZipCode("sw2", "gb", Units.STANDARD));
            }

            @Test
            @DisplayName("check: getConnectionZipCode(zipCode, countryCode, metric) returns correctly")
            void checkGetConnectionZipCodeZipCodeCountryCodeMetricReturnsCorrectly() {
                assertEquals(base + "zip=sw2,gb" + key + Units.METRIC.getValue(),
                        ConnectionManager.getConnectionZipCode("sw2", "gb", Units.METRIC));
            }

            @Test
            @DisplayName("check: getConnectionZipCode(zipCode, countryCode, imperial) returns correctly")
            void checkGetConnectionZipCodeZipCodeCountryCodeImperialReturnsCorrectly() {
                assertEquals(base + "zip=sw2,gb" + key + Units.IMPERIAL.getValue(),
                        ConnectionManager.getConnectionZipCode("sw2", "gb", Units.IMPERIAL));
            }

        }
    }
}
