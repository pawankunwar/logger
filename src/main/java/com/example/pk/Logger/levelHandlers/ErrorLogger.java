package com.example.pk.Logger.levelHandlers;

import com.example.pk.Logger.Model.ILogger;
import com.example.pk.Logger.enums.Level;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ErrorLogger extends ILogger {
    ILogger next;
    @Override
    public String log(Level l, String message) {
        if(Level.ERROR == l) {
            return  Level.ERROR.getVal() + message;
        } else {
            return next.log(l, message);
        }
    }
}
