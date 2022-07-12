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

	public Double getMessage(){ return message; }

	public boolean isMessage() {
		return message != null;
	}


	public boolean isCountry() {
		return country != null;
	}

	public boolean isSunrise() {
		return sunrise != null;

	public boolean isSunriseBeforeSunset() {
		return sunrise > sunset;
	}

	public boolean hasExactlyTwoChars() {
		return country.length() == 2;
	}

	public boolean isSunset() {
		return sunset != null;
	}

	public boolean isId() {
		return id != null;
	}

	public boolean isType() {
		return type != null;
	}

	public boolean isSunriseBeforeSunset() {
		if (isSunrise() && isSunset()) {
			return sunrise > sunset;
		} else {
			return false;
		}
	}

    public boolean hasExactlyTwoChars() {
		if (isCountry()) {
			return country.length() == 2;
		} else {
			return false;
		}
	}
}