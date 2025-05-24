package com.example.pk.Logger.typeHandlers;

import com.example.pk.Logger.LogHandler;
import com.example.pk.Logger.Model.ILogger;
import com.example.pk.Logger.Model.ILoggerType;
import com.example.pk.Logger.enums.Level;

public class FileType implements ILoggerType {

    public void log(Level l, String message) {
        System.out.println("Writing to a file "+ LogHandler.log(l, message));
    }
}
