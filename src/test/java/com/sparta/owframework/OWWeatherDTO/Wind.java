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

	public boolean isValidDegreesValue() {
		return deg >= 0 && deg <= 360;
	}

	public boolean isGustGreaterThanSpeed() {
		return gust >= speed;
	}

	public boolean validSpeedAndGust() {
		return speed >= 0 && gust >= 0;
	}
}