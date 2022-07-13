package com.sparta.owframework.filemanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVReader {
    public static HashMap<String, String> readFromFile(String filename) {
        HashMap<String, String> countryCodes = new HashMap<>();

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {

                    //long commaCount = line.codePoints().filter(ch -> ch == ',').count();

                    line = line.replace("\"", "");
                    String name = line.substring(0,line.length()-3);
             //       String nameEdit = name.substring(0,name.length()-2);
                    String code = line.substring(line.length()-2);




                    countryCodes.put(name, code);


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return countryCodes;
    }
}
