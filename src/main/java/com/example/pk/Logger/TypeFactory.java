package com.example.pk.Logger;

import com.example.pk.Logger.Model.ILogger;
import com.example.pk.Logger.Model.ILoggerType;
import com.example.pk.Logger.enums.LoggerType;
import com.example.pk.Logger.typeHandlers.ConsoleType;
import com.example.pk.Logger.typeHandlers.FileType;

import java.util.Stack;

public class TypeFactory {
    public static ILoggerType getLogger(LoggerType loggerType) {
        if(loggerType == LoggerType.FILE) {
            return new FileType();
        } else if (loggerType == LoggerType.CONSOLE) {
            return new ConsoleType();
        }
        return null;
    }
}
