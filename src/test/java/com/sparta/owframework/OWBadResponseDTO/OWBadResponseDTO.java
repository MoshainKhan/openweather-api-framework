package com.sparta.owframework.OWBadResponseDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OWBadResponseDTO {

	@JsonProperty("cod")
	private String cod;

	@JsonProperty("message")
	private String message;

	public String getCod(){
		return cod;
	}

	public String getMessage(){
		return message;
	}
}