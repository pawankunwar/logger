package com.example.pk.Logger.levelHandlers;

import com.example.pk.Logger.Model.ILogger;
import com.example.pk.Logger.enums.Level;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class InfoLogger extends ILogger {
    ILogger next;
    @Override
    public String log(Level l, String message) {
        if(Level.INFO == l) {
            return Level.INFO.getVal() + message;
        } else if (next!= null){
             {
                return next.log(l, message);
            }
        } else {
            return "No valid level found";
        }
    }
}
