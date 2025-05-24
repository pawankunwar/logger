package com.example.pk.Logger.Model;

import com.example.pk.Logger.enums.Level;

public interface ILoggerType {
    void log(Level l, String message);
}
