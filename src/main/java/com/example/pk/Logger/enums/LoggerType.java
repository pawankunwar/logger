package com.example.pk.Logger.enums;

public enum LoggerType {
    FILE("FILE"),
    CONSOLE("CONSOLE");

    final String val;

    LoggerType(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
