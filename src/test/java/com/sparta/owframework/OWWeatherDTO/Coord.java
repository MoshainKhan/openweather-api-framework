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

	public boolean isLatBetweenNeg90AndPos90() {

		return lat >= -90 && lat <= 90;
	}

	public boolean isLongBetweenNeg180AndPos180() {
		return lon >= -180  && lon <= 180;
	}

}