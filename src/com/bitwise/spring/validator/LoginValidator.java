package com.bitwise.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bitwise.spring.controller.Login;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Login.class.equals(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
		
		
	}

}
