package com.clothingd.xiaopu.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.clothingd.xiaopu.validation.UserRoleValidation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Documented
@Target({ ElementType.FIELD})//元注解
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { UserRoleValidation.class})
public @interface UserRole
{
	//提供校验失败后的提示信息
	String message() default "UserRole参数的值只能是0或1或2";//0代表普通用户，1代表设计师，2代表管理员
	//指定分组
	Class<?>[] groups() default {};
	//负载 获取state的附加信息
	Class<? extends Payload>[] payload() default {};
}
