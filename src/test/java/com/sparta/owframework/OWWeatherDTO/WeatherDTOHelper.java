package com.sparta.owframework.OWWeatherDTO;

public class WeatherDTOHelper {

    public boolean isBetween0And100(int number) {
        return number >= 0 || number <= 100;
    }

    public boolean isNotLessThan0(double value) {
        return value >= 0;
    }

    public boolean isMinLessThanMax(double max, double min) {
        return min < max;
    }
}
