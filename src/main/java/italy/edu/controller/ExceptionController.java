package italy.edu.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class ExceptionController {
	private static Logger logger = Logger.getLogger(ExceptionController.class);
	//Nếu nhập đường dẫn sai	
	@ExceptionHandler(value = {NoHandlerFoundException.class})
	public String exceptionHandler(Exception exception) {
		logger.error(exception);
		return "error";
	}
}
