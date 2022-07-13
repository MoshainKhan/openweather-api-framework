package com.sparta.owframework.OWWeatherDTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OWWeatherDTO {



	@JsonProperty("rain")
	private Rain rain;

	@JsonProperty("visibility")
	private Integer visibility;

	@JsonProperty("timezone")
	private Integer timezone;

	@JsonProperty("main")
	private Main main;

	@JsonProperty("clouds")
	private Clouds clouds;

	@JsonProperty("sys")
	private Sys sys;

	@JsonProperty("dt")
	private Integer dt;

	@JsonProperty("coord")
	private Coord coord;

	@JsonProperty("snow")
	private Snow snow;

	@JsonProperty("weather")
	private List<WeatherItem> weather;

	@JsonProperty("name")
	private String name;

	@JsonProperty("cod")
	private Integer cod;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("base")
	private String base;

	@JsonProperty("wind")
	private Wind wind;

	public Rain getRain(){
		return rain;
	}

	public Integer getVisibility(){
		return visibility;
	}

	public Integer getTimezone(){
		return timezone;
	}

	public Main getMain(){
		return main;
	}

	public Clouds getClouds(){
		return clouds;
	}

	public Sys getSys(){
		return sys;
	}

	public Integer getDt(){
		return dt;
	}

	public Coord getCoord(){
		return coord;
	}

	public Snow getSnow(){
		return snow;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public String getName(){
		return name;
	}

	public Integer getCod(){
		return cod;
	}

	public Integer getId(){
		return id;
	}

	public String getBase(){
		return base;
	}

	public Wind getWind(){
		return wind;
	}

	public boolean hasRain() {
		return rain != null;
	}

	public boolean hasVisibility() {
		return visibility != null;
	}

	public boolean hasTimeZone() {
		return timezone != null;
	}

	public boolean hasMain() {
		return main != null;
	}

	public boolean hasClouds(){
		return clouds != null;
	}

	public boolean hasSys(){
		return sys != null;
	}

	public boolean hasDt(){
		return dt != null;
	}

	public boolean hasCoord(){
		return coord != null;
	}

	public boolean hasSnow(){ return snow != null; }

	public boolean hasWeather(){
		return weather != null;
	}

	public boolean hasName(){
		return name != null;
	}

	public boolean hasCod(){
		return cod != null;
	}

	public boolean hasId(){
		return id != null;
	}

	public boolean hasBase(){
		return base != null;
	}

	public boolean hasWind(){
		return wind != null;
	}

	public boolean isMultipleOf3600() {

		int absOfTimezone = Math.abs(timezone);

		if (absOfTimezone == 0) {
			return true;
		} else return timezone % 3600 == 0;
	}

	public boolean requestDateSentCorrect() {
		Date time = new Date((dt) * 1000L);
		String requestDate = time.toString();
		String currentDate = new Date().toString();
		String current = currentDate.substring(0, 11);
		return requestDate.contains(current);
	}

	public boolean isTimeZoneValid (){
		int minimumTimeZone = -43_200;
		int maximumTimeZone = 50_400;
		return (timezone >= minimumTimeZone && timezone <= maximumTimeZone);
	}

}