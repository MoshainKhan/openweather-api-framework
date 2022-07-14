package com.sparta.owframework.openweathermanager;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    public String getKeyFromProperties() {

        Properties properties = new Properties();

        try {
            properties.load(new FileReader("src/test/java/com/sparta/owframework/openweathermanager/MUST_BE_IGNORED.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("password");
    }
}
