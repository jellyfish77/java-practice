package com.jellyfish77.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	public static final Logger LOGGER = LogManager.getLogger(Log4jDemo.class.getName()); 
	
	public static void main(String[] args) {
		
		LOGGER.trace("Trace Message Logged !!!");
		LOGGER.debug("Debug Message Logged !!!");
	    LOGGER.info("Info Message Logged !!!");
	    LOGGER.warn("Warn Message Logged !!!");
	    LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
	    LOGGER.fatal("Fatal Message Logged !!!");
	    

	}

}
