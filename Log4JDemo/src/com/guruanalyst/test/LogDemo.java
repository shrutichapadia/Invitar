package com.guruanalyst.test;

import org.apache.log4j.Logger;

public class LogDemo {

	//You are creating a logger object for this class
	public static final Logger log = Logger.getLogger(LogDemo.class);
	
	public static void main(String [] args){
		//log.info("Test log");
		log.debug("Testing...logging into console");
		
		//log.debug(message);
		
	}

}
