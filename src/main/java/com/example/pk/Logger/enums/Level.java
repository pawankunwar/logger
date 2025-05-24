package com.example.pk.Logger.enums;

public enum Level {
    INFO("INFO"),
    ERROR("ERROR"),
    WARN("WARN"),
    DEBUG("DEBUG");

    final String val;

    Level(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
