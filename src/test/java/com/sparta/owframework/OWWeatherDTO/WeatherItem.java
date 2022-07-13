package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherItem {

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("description")
	private String description;

	@JsonProperty("main")
	private String main;

	@JsonProperty("id")
	private Integer id;

	public String getIcon() {
		return icon;
	}

	public String getDescription() {
		return description;
	}

	public String getMain() {
		return main;
	}

	public Integer getId() {
		return id;
	}

	public boolean hasId() {
		return id != null;
	}

	public boolean hasIcon() {
		return icon != null;
	}

	public boolean hasDescription() {
		return description != null;
	}

	public boolean hasMain() {
		return main != null;
	}

	public boolean isValidIconDescMainIdCombo() {
		return switch (id) {
			case 200 -> description.equals("thunderstorm with light rain") && main.equals("Thunderstorm") && icon.equals("11d");
			case 201 -> description.equals("thunderstorm with rain") && main.equals("Thunderstorm") && icon.equals("11d");
			case 202 -> description.equals("thunderstorm with heavy rain") && main.equals("Thunderstorm") && icon.equals("11d");
			case 210 -> description.equals("light thunderstorm") && main.equals("Thunderstorm") && icon.equals("11d");
			case 211 -> description.equals("thunderstorm") && main.equals("Thunderstorm") && icon.equals("11d");
			case 212 -> description.equals("heavy thunderstorm") && main.equals("Thunderstorm") && icon.equals("11d");
			case 221 -> description.equals("ragged thunderstorm") && main.equals("Thunderstorm") && icon.equals("11d");
			case 230 -> description.equals("thunderstorm with light drizzle") && main.equals("Thunderstorm") && icon.equals("11d");
			case 231 -> description.equals("thunderstorm with drizzle") && main.equals("Thunderstorm") && icon.equals("11d");
			case 232 -> description.equals("thunderstorm with heavy drizzle") && main.equals("Thunderstorm") && icon.equals("11d");
			case 300 -> description.equals("light intensity drizzle") && main.equals("Drizzle") && icon.equals("09d");
			case 301 -> description.equals("drizzle") && main.equals("Drizzle") && icon.equals("09d");
			case 302 -> description.equals("heavy intensity drizzle") && main.equals("Drizzle") && icon.equals("09d");
			case 310 -> description.equals("light intensity drizzle rain") && main.equals("Drizzle") && icon.equals("09d");
			case 311 -> description.equals("drizzle rain") && main.equals("Drizzle") && icon.equals("09d");
			case 312 -> description.equals("heavy intensity drizzle rain") && main.equals("Drizzle") && icon.equals("09d");
			case 313 -> description.equals("shower rain and drizzle") && main.equals("Drizzle") && icon.equals("09d");
			case 314 -> description.equals("heavy shower rain and drizzle") && main.equals("Drizzle") && icon.equals("09d");
			case 321 -> description.equals("shower drizzle") && main.equals("Drizzle") && icon.equals("09d");
			case 500 -> description.equals("light rain") && main.equals("Rain") && icon.equals("10d");
			case 501 -> description.equals("moderate rain") && main.equals("Rain") && icon.equals("10d");
			case 502 -> description.equals("heavy intensity rain") && main.equals("Rain") && icon.equals("10d");
			case 503 -> description.equals("very heavy rain") && main.equals("Rain") && icon.equals("10d");
			case 504 -> description.equals("extreme rain") && main.equals("Rain") && icon.equals("10d");
			case 511 -> description.equals("freezing rain") && main.equals("Rain") && icon.equals("13d");
			case 520 -> description.equals("light intensity shower rain") && main.equals("Rain") && icon.equals("09d");
			case 521 -> description.equals("shower rain") && main.equals("Rain") && icon.equals("09d");
			case 522 -> description.equals("heavy intensity shower rain") && main.equals("Rain") && icon.equals("09d");
			case 531 -> description.equals("ragged shower rain") && main.equals("Rain") && icon.equals("09d");
			case 600 -> description.equals("light snow") && main.equals("Snow") && icon.equals("13d");
			case 601 -> description.equals("Snow") && main.equals("Snow") && icon.equals("13d");
			case 602 -> description.equals("Heavy snow") && main.equals("Snow") && icon.equals("13d");
			case 611 -> description.equals("Sleet") && main.equals("Snow") && icon.equals("13d");
			case 612 -> description.equals("Light shower sleet") && main.equals("Snow") && icon.equals("13d");
			case 613 -> description.equals("Shower sleet") && main.equals("Snow") && icon.equals("13d");
			case 615 -> description.equals("Light rain and snow") && main.equals("Snow") && icon.equals("13d");
			case 616 -> description.equals("Rain and snow") && main.equals("Snow") && icon.equals("13d");
			case 620 -> description.equals("Light shower snow") && main.equals("Snow") && icon.equals("13d");
			case 621 -> description.equals("Shower snow") && main.equals("Snow") && icon.equals("13d");
			case 622 -> description.equals("Heavy shower snow") && main.equals("Snow") && icon.equals("13d");
			case 701 -> description.equals("mist") && main.equals("Mist") && icon.equals("50d");
			case 711 -> description.equals("Smoke") && main.equals("Smoke") && icon.equals("50d");
			case 721 -> description.equals("Haze") && main.equals("Haze") && icon.equals("50d");
			case 731 -> description.equals("Haze") && main.equals("Dust") && icon.equals("50d");
			case 741 -> description.equals("fog") && main.equals("Fog") && icon.equals("50d");
			case 751 -> description.equals("sand") && main.equals("Sand") && icon.equals("50d");
			case 761 -> description.equals("dust") && main.equals("Dust") && icon.equals("50d");
			case 762 -> description.equals("volcanic ash") && main.equals("Ash") && icon.equals("50d");
			case 771 -> description.equals("squalls") && main.equals("Squall") && icon.equals("50d");
			case 781 -> description.equals("tornado") && main.equals("Tornado") && icon.equals("50d");
			case 800 -> description.equals("clear sky") && main.equals("Clear") && (icon.equals("01d") || icon.equals("01n"));
			case 801 -> description.equals("few clouds: 11-25%") && main.equals("Clouds") && (icon.equals("02d") || icon.equals("02n"));
			case 802 -> description.equals("scattered clouds: 25-50%") && main.equals("Clouds") && (icon.equals(" 03d") || icon.equals("03n"));
			case 803 -> description.equals("broken clouds: 51-84%") && main.equals("Clouds") && (icon.equals(" 04d") || icon.equals("04n"));
			case 804 -> description.equals("overcast clouds: 85-100%") && main.equals("Clouds") && (icon.equals(" 04d") || icon.equals("04n"));
			default -> false;
		};
	}
}