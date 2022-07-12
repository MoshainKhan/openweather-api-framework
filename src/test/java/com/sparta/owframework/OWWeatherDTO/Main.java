package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main{

	@JsonProperty("temp")
	private Double temp;

	@JsonProperty("temp_min")
	private Double tempMin;

	@JsonProperty("grnd_level")
	private Double grndLevel;

	@JsonProperty("humidity")
	private Integer humidity;

	@JsonProperty("pressure")
	private Double pressure;

	@JsonProperty("sea_level")
	private Double seaLevel;

	@JsonProperty("feels_like")
	private Double feelsLike;

	@JsonProperty("temp_max")
	private Double tempMax;

	public Double getTemp(){
		return temp;
	}

	public Double getTempMin(){
		return tempMin;
	}

	public Double getGrndLevel(){
		return grndLevel;
	}

	public Integer getHumidity(){
		return humidity;
	}

	public Double getPressure(){
		return pressure;
	}

	public Double getSeaLevel(){
		return seaLevel;
	}

	public Double getFeelsLike(){
		return feelsLike;
	}

	public Double getTempMax(){
		return tempMax;
	}

	public boolean isMinLessThanMax(double max, double min) {
		return min < max;
	}

	public boolean isTempBetweenTempMinAndMax(double max, double min, double value) {
		return value >= min && value <= max;
	}

	public boolean isPressureBetween100And1100(double pressure) {
		return pressure >= 100 || pressure <= 1100;
	}


}