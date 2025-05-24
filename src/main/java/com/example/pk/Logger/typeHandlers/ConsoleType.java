package com.example.pk.Logger.typeHandlers;

import com.example.pk.Logger.LogHandler;
import com.example.pk.Logger.Model.ILoggerType;
import com.example.pk.Logger.enums.Level;

public class ConsoleType implements ILoggerType {

    @Override
    public void log(Level l, String message) {
        System.out.println("Writing to a console "+ LogHandler.log(l, message));
    }
}
