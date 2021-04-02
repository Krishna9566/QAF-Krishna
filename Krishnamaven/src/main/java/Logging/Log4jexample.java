package Logging;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jexample {
	
	static Logger logger=LogManager.getLogger();

	public static void main(String[] args) {
		
		logger.trace("TRACE LOGGER MESAGE");
		logger.debug("DEBUG LOGGER MESAGE");
		logger.info("INFO LOGGER MESAGE");
		logger.warn("WARNING LOGGER MESAGE");
		logger.error("ERROR LOGGER MESAGE");
		logger.fatal("FATAL LOGGER MESAGE");

		
	}

}
