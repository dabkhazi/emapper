package com.example.emapper;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TokenValidator implements ConstraintValidator <ValidToken, String>{
		
	@Override
	public void initialize(ValidToken constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		context.disableDefaultConstraintViolation();
		context.buildConstraintViolationWithTemplate("{token.error.message.critical}").addConstraintViolation();
		return false;
	}

}
