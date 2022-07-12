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
		if (gust != null) {
			return gust >= speed;
		} else {
			return false;
		}
	}

	public boolean validSpeedAndGust() {
		if (gust != null) {
			return speed >= 0 && gust >= 0;
		} else {
			return speed >= 0;
		}
	}

	public static void main(String[] args) {
		Integer hello = null;

		int hel = 4;

		System.out.println(hel >= hello);
	}
}