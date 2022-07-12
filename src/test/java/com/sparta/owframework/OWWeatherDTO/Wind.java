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


	public boolean isSpeed() {
		return speed != null;
	}

	public boolean isGust() {
		return gust != null;
	}

	public boolean isDeg() {
		return deg != null;
	}

	public boolean isValidDegreesValue() {
		if (isDeg()) {
			return deg >= 0 && deg <= 360;
		} else {
			return false;
		}
	}

	public boolean isGustGreaterThanSpeed() {
		if (isGust()) {
			return gust >= speed;
		} else {
			return false;
		}
	}

	public boolean validSpeedAndGust() {
		if (isSpeed()) {
			return speed >= 0 && gust >= 0;
		} else {
			return speed >= 0;
		}
	}
}