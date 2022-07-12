package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sys{

	@JsonProperty("country")
	private String country;

	@JsonProperty("sunrise")
	private Integer sunrise;

	@JsonProperty("sunset")
	private Integer sunset;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("type")
	private Integer type;

	@JsonProperty("message")
	private Double message;

	public String getCountry(){
		return country;
	}

	public Integer getSunrise(){
		return sunrise;
	}

	public Integer getSunset(){
		return sunset;
	}

	public Integer getId(){
		return id;
	}

	public Integer getType(){
		return type;
	}

	public Double getMessage(){
		return message;
	}

	public boolean isSunriseBeforeSunset() {
		return sunrise > sunset;
	}

	public boolean hasExactlyTwoChars() {
		return country.length() == 2;

	public boolean isTypeAndIdValidValues() {
		return type >= 0 && id >= 0;
	}

	public boolean isSunriseAValidTimeStamp() {
		return true;
	}

	public boolean isSunsetAValidTimeStamp() {
		return true;

	}
}