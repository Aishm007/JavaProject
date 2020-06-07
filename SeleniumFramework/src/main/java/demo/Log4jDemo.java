package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger log = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		
		System.out.println("hello Log4j.....\n");
		log.trace("This is a trace message");
		log.info("This is the information message");
		log.error("This is a error message");
		log.warn("This is a warning message");
		log.fatal("This is a fatal error message");
		
		System.out.println("Completed");
	}

}
