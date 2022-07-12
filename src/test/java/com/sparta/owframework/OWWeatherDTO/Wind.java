package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind{

	@JsonProperty("deg")
	private Integer deg;

	@JsonProperty("speed")
	private Double speed;

	@JsonProperty("gust")
	private Double gust;

	public Integer getDeg(){
		return deg;
	}

	public Double getSpeed(){
		return speed;
	}

	public Double getGust() {return gust; }


	public boolean hasSpeed() {
		return speed != null;
	}

	public boolean hasGust() {
		return gust != null;
	}

	public boolean hasDeg() {
		return deg != null;
	}

	public boolean isValidDegreesValue() {
		if (hasDeg()) {
			return deg >= 0 && deg <= 360;
		} else {
			return false;
		}
	}

	public boolean isGustGreaterThanSpeed() {
		if (hasGust()) {
			return gust >= speed;
		} else {
			return false;
		}
	}

	public boolean validSpeedAndGust() {
		if (hasSpeed()) {
			return speed >= 0 && gust >= 0;
		} else {
			return speed >= 0;
		}
	}
}