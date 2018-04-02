package util_package;

import java.util.logging.Logger;

public class LoggerClass {

	/**
	 * 
	 * It is to handle the request from inside a non static method call
	 * @param classname Object of Class
	 * @return Logger object
	 */
	public static Logger getLocalLogger(Object classname) {

		return Logger.getLogger(classname.getClass().getName());
	}
	
	/**
	 * It is to handle the request from inside a static method call
	 * @param classname Name of the class
	 * @return Logger object
	 */
	public static Logger getLocalLogger(String classname) {

		return Logger.getLogger(classname.getClass().getName());
	}
}
