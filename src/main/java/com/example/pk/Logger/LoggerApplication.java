package com.example.pk.Logger;

import com.example.pk.Logger.Model.ILoggerType;
import com.example.pk.Logger.enums.Level;
import com.example.pk.Logger.enums.LoggerType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);
		ILoggerType logger = TypeFactory.getLogger(LoggerType.FILE);
		logger.log(Level.INFO, "This is first Message for file");
		logger.log(Level.ERROR, "This is second message for file");
		logger = TypeFactory.getLogger(LoggerType.CONSOLE);
		logger.log(Level.INFO, "This is first Message console");
		logger.log(Level.ERROR, "This is second message console");
	}

}
