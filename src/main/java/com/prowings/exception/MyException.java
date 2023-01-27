package com.prowings.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class MyException {

	private String INCORRECTID = "INCORRECT EMPLOYEE ID";

	@ExceptionHandler(EmployeeNotPresentException.class)
	public ErrorRespone handleEmployeeNotPresent(EmployeeNotPresentException ex, WebRequest wr) {

		ErrorRespone er = new ErrorRespone();
		er.setDetails(ex.getLocalizedMessage()); 
		er.setMessage(INCORRECTID);
		return er;
	}

}
