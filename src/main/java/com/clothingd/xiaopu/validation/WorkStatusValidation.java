package com.clothingd.xiaopu.validation;

import com.clothingd.xiaopu.anno.WorkStatus;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class WorkStatusValidation implements ConstraintValidator<WorkStatus,Integer>
{
	@Override
	public boolean isValid(final Integer value, final ConstraintValidatorContext constraintValidatorContext)
	{
		//提供校验规则
		if(value == null){
			return false;
		}
		if(value.equals(0) || value.equals(1)){
			return true;
		}
		return false;
	}
}
