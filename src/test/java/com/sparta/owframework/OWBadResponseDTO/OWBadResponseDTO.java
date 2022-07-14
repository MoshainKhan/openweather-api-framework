package com.sparta.owframework.OWBadResponseDTO;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;
import java.util.Arrays;

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

	public int getCodAsInt() {
		return Integer.parseInt(cod);
	}
}