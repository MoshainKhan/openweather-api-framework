package com.sparta.owframework.injector_manager_loader;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Injector {

    public static OWWeatherDTO injectOWWeatherDTO(String url){
        OWWeatherDTO weatherDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            weatherDTO = mapper.readValue(new URL(url), OWWeatherDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return weatherDTO;
    }

    public static OWBadResponseDTO injectOWBadResponseDTO(String url){
        OWBadResponseDTO badResponseDTO = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            badResponseDTO = mapper.readValue(new URL(url), OWBadResponseDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return badResponseDTO;
    }
}
