package com.sparta.owframework.filemanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CountryCodesMap {

    public static String file = "src/test/resources/countrycodes/CountryCodes.csv";

    public static HashMap<String, String> getCountryCodesMap() {
        HashMap<String, String> countryCodes = new HashMap<>();

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {


                    line = line.replace("\"", "");
                    String name = line.substring(0,line.length()-3);

                    String code = line.substring(line.length()-2);

                    countryCodes.put(code, name);


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return countryCodes;
    }



}
