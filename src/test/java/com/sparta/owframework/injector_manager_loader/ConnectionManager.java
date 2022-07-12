package com.sparta.owframework.injector_manager_loader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ConnectionManager {
    private static final String BASEURL = "https://api.openweathermap.org/data/2.5/weather?";
    private static final String APIKEY = PropertiesLoader.getProperties().getProperty("password");

    public static String getConnection() {
        getResponse();
        return BASEURL + getKey();
    }

    public static String getConnectionCity(String city_name) {
        return getConnectionCity(city_name, Units.STANDARD);
    }

    public static String getConnectionCity(String city_name, String country_code) {
        return getConnectionCity(city_name, Units.STANDARD) + "," + country_code;
    }

    public static String getConnectionCity(String city_name, String state_code, String country_code) {
        return getConnectionCity(city_name, Units.STANDARD) + "," + state_code + "," + country_code;
    }

    public static String getConnectionId(int city_id) {
        return getConnectionId(city_id, Units.STANDARD);
    }

    public static String getConnectionLatLon(double lat, double lon) { //search via lat & lon
        return getConnectionLatLon(lat, lon, Units.STANDARD);
    }

    public static String getConnectionZipCode(String zipCode) {
        return getConnectionZipCode(zipCode, Units.STANDARD);
    }

    public static String getConnectionZipCode(String zipCode, String country_code) {
        return getConnectionZipCode(zipCode, country_code, Units.STANDARD);
    }

    public static String getConnectionCity(String city_name, Units measurement) {
        getResponse();
        return BASEURL + "q=" + city_name + getKey() + measurement.getValue();
    }

    public static String getConnectionCity(String city_name, String country_code, Units measurement) {
        getResponse();
        return BASEURL + "q=" + city_name + "," + country_code + getKey() + measurement.getValue();
    }

    public static String getConnectionCity(String city_name, String state_code, String country_code, Units measurement) {
        getResponse();
        return BASEURL + "q=" + city_name + "," + state_code + "," + country_code + getKey() + measurement.getValue();
    }

    public static String getConnectionId(int city_id, Units measurement) {
        getResponse();
        return BASEURL + "id=" + city_id + getKey() + measurement.getValue();
    }

    public static String getConnectionZipCode(String zipCode, String country_code, Units measurement) {
        getResponse();
        return BASEURL + "zip=" + zipCode + "," + country_code + getKey() + measurement.getValue();
    }

    public static String getConnectionZipCode(String zipCode, Units measurement) {
        getResponse();
        return BASEURL + "zip=" + zipCode + getKey() + measurement.getValue();
    }

    public static String getConnectionLatLon(double lat, double lon, Units measurement) {
        getResponse();
        return BASEURL + "lat=" + lat + "&lon=" + lon + getKey() + measurement.getValue();
    }

    public static int getStatusCode() { return getResponse().statusCode(); }

    private static String getKey() { return "&appid=" + APIKEY; }

    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = null;
        HttpResponse<String> httpResponse;
        try {
            httpRequest = HttpRequest.newBuilder(URI.create(BASEURL)).build();
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return httpResponse;
    }
}
