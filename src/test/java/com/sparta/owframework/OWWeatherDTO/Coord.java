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

	public boolean hasLong() {
		return getLon() != null;
	}

	public boolean hasLat() {
		return getLon() != null;
	}


	public boolean isLatBetweenNeg90AndPos90() {

		return lat >= -90 && lat <= 90;
	}

	public boolean isLongBetweenNeg180AndPos180() {
		return lon >= -180  && lon <= 180;
	}

	public boolean has4NumsAfterDecimalPoint(double coord) {
		String strCoord = String.valueOf(coord);
		String dcmlChecker = strCoord.substring(strCoord.indexOf("."));
		return dcmlChecker.length() == 4;

	}

}