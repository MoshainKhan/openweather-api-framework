package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.cucumber.java.an.E;

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

	public boolean hasTemp() {
		return temp != null;
	}

	public boolean hasTempMin() {
		return tempMin != null;
	}

	public boolean hasTempMax() {
		return tempMax != null;
	}

	public boolean hasHumidity() {
		return humidity != null;
	}

	public boolean hasPressure() {
		return pressure != null;
	}

	public boolean hasSeaLevel() {
		return seaLevel != null;
	}

	public boolean hasGrndLevel() {
		return grndLevel != null;
	}

	public boolean hasFeelsLike() {
		return feelsLike != null;
	}

	public boolean isTempBetweenTempMinAndMax() {
		return temp >= tempMin && temp <= tempMax;
	}

	public boolean isPressureBetween100And1100() {
		return pressure >= 100 && pressure <= 1100;
	}


}