package com.clothingd.xiaopu.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



import com.clothingd.xiaopu.validation.WorkStatusValidation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Documented
@Target({ ElementType.FIELD})//元注解
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { WorkStatusValidation.class})
public @interface WorkStatus
{
	//提供校验失败后的提示信息
	String message() default "WorkStatus参数的值只能是0或1";//0代表未成交，1代表已成交
	//指定分组
	Class<?>[] groups() default {};
	//负载 获取state的附加信息
	Class<? extends Payload>[] payload() default {};
}
