package com.example.pk.Logger.levelHandlers;

import com.example.pk.Logger.Model.ILogger;
import com.example.pk.Logger.enums.Level;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class WarnLogger extends ILogger {
    ILogger next;
    @Override
    public String log(Level l, String message) {
        if(Level.WARN == l) {
            return Level.WARN.getVal() + message;
        } else {
            return next.log(l, message);
        }
    }
}
