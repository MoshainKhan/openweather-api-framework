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

	public boolean hasMessage() {
		return message != null;
	}


	public boolean hasCountry() {
		return country != null;
	}

	public boolean hasSunrise() {
		return sunrise != null;
	}

	public boolean hasSunset() {
		return sunset != null;
	}

	public boolean hasId() {
		return id != null;
	}

	public boolean hasType() {
		return type != null;
	}

	public boolean isSunriseBeforeSunset() {
		if (hasSunrise() && hasSunset()) {
			return sunrise > sunset;
		} else {
			return false;
		}
	}

    public boolean hasExactlyTwoChars() {
		if (hasCountry()) {
			return country.length() == 2;
		} else {
			return false;
		}
	}
}