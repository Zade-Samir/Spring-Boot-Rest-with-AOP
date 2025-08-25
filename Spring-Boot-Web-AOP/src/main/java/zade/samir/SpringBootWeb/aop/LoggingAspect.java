package zade.samir.SpringBootWeb.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	public void logMethodCall() {
		System.out.println("Method called");
	}
}
