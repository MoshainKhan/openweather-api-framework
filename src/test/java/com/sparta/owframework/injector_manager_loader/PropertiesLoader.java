package com.sparta.owframework.injector_manager_loader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    public static Properties getProperties() {

        Properties properties = new Properties();

        try {
            properties.load(new FileReader("src/test/java/com/sparta/owframework/injector_manager_loader/MUST_BE_IGNORED.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
