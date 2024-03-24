package com.clothingd.xiaopu.validation;

import com.clothingd.xiaopu.anno.UserRole;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class UserRoleValidation implements ConstraintValidator<UserRole,Integer>
{
	@Override
	public boolean isValid(final Integer value, final ConstraintValidatorContext constraintValidatorContext)
	{
		//提供校验规则
		if(value == null){
			return false;
		}
		if(value.equals(0) || value.equals(1) || value.equals(2)){
			return true;
		}
		return false;
	}
	}

