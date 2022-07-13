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

	public boolean isValidStatusCode() {
		ArrayList<Integer> statusCodeArray = new ArrayList<>(Arrays.asList(100, 101, 102, 103, 200, 201, 202, 203, 204,
				205, 206, 207, 208, 226, 300, 301, 302, 303, 304, 305, 206, 307, 308, 400, 401, 402, 403, 404, 405, 406,
				407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 421, 422, 423, 424, 425, 426, 428, 429, 431,
				451, 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, 511));
		return statusCodeArray.contains(Integer.parseInt(cod));
		
	}
}