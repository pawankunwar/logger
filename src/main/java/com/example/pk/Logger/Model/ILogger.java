package com.example.pk.Logger.Model;

import com.example.pk.Logger.enums.Level;

public abstract class ILogger {

    public abstract String log(Level l, String message);
}
