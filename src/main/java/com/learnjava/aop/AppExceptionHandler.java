package com.learnjava.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.learnjava.constants.URLConstants;
import com.learnjava.exception.UserNotFoundException;

@ControllerAdvice
public class AppExceptionHandler {
	@Value("${user.notexist}")
	String userNotExists;

	@ExceptionHandler(UserNotFoundException.class)
	public ModelAndView userNotFoundException() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(URLConstants.EXCEPTION_MESSAGE, userNotExists);
		return modelAndView;
	}
}
