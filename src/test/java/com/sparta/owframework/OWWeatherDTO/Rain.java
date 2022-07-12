package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain{

	@JsonProperty("3h")
	private Integer jsonMember3h;

	@JsonProperty("1h")
	private Integer jsonMember1h;

	public Integer getJsonMember3h(){
		return jsonMember3h;
	}

	public Integer getJsonMember1h(){
		return jsonMember1h;
	}
}