package com.sparta.owframework.OWWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds{

	@JsonProperty("all")
	private Integer all;

	public Integer getAll(){
		return all;
	}

	public boolean hasCloud() {
		return getAll() == null;
	}


}