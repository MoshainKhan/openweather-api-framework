package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coord{

	@JsonProperty("lon")
	private Double lon;

	@JsonProperty("lat")
	private Double lat;

	public Double getLon(){
		return lon;
	}

	public Double getLat(){
		return lat;
	}

	public boolean isLatBetweenNeg90AndPos90(double number) {
		return number >= -90 || number <= 90;
	}

	public boolean isLongBetweenNeg180AndPos180(double number) {
		return number >= -180 || number <= 180;
	}

}