package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow{

	@JsonProperty("3h")
	private Double jsonMember3h;

	@JsonProperty("1h")
	private Double jsonMember1h;

	public boolean hasJsonMember3h(){
		return jsonMember3h != null;
	}

	public boolean hasJsonMember1h(){
		return jsonMember1h != null;
	}

	public Double getJsonMember3h(){
		return jsonMember3h;
	}

	public Double getJsonMember1h(){
		return jsonMember1h;
	}

	public boolean snowIsGreaterThanZero1h(){return jsonMember1h > 0;}
	public boolean snowIsGreaterThanZero3h(){return jsonMember3h > 0;}
}