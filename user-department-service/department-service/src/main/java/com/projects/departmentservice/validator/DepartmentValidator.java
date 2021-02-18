package com.projects.departmentservice.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DepartmentValidator implements ConstraintValidator<ValidateDepartment, String> {

	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		boolean success = false;
		
	    int x = Integer.parseInt(value);
	    
	    if(x >= 401 && x <= 409) {
	    	success = true;
	    }
	    return success;
	 }
	
}
