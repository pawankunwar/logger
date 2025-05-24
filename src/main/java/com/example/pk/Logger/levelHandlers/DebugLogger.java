package com.example.pk.Logger.levelHandlers;

import com.example.pk.Logger.Model.ILogger;
import com.example.pk.Logger.enums.Level;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DebugLogger extends ILogger {
    ILogger next;
    @Override
    public String log(Level l, String message) {
        if(Level.DEBUG == l) {
            return Level.DEBUG.getVal() + message;
        } else {
            return  next.log(l, message);
        }
    }
}
