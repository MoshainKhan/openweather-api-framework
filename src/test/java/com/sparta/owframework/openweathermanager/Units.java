package com.sparta.owframework.openweathermanager;

public enum Units {
    METRIC("&units=metric"),
    IMPERIAL("&units=imperial"),
    STANDARD("&units=standard");

    private final String value;

    public String getValue() {
        return value;
    }

    Units(String s) {
        this.value = s;
    }
}
