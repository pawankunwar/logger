package com.example.pk.Logger;

import com.example.pk.Logger.Model.ILogger;
import com.example.pk.Logger.enums.Level;
import com.example.pk.Logger.levelHandlers.DebugLogger;
import com.example.pk.Logger.levelHandlers.ErrorLogger;
import com.example.pk.Logger.levelHandlers.InfoLogger;
import com.example.pk.Logger.levelHandlers.WarnLogger;

public class LogHandler {

    public static String log(Level level, String message) {
        ILogger logger = new InfoLogger(new DebugLogger(new ErrorLogger(new WarnLogger())));
        return logger.log(level, " "+message+" ");
    }
}
