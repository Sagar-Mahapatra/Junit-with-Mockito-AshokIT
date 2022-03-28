package com.ashokit.controller.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ashokit.exception.ResourceNotFoundException;
import com.ashokit.model.UserResp;

@RestControllerAdvice
public class UserRestControllerAdvice {

	@ExceptionHandler(ResourceNotFoundException.class)
	public UserResp handleResourceNotFoundException(ResourceNotFoundException e) {
		return new UserResp(e.getRespCode(), e.getRespMsg());
	}

}
