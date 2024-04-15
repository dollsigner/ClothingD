package com.clothingd.xiaopu.controller;

import java.util.List;
import java.util.Map;

import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clothingd.xiaopu.pojo.Result;
import com.clothingd.xiaopu.pojo.User;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.UserService;
import com.clothingd.xiaopu.utils.ThreadLocalUtil;


@RestController
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userService;


	@PostMapping("/login")
	public Result login(){
		//implement login method
		return Result.success();
	}
//implement login method

	@PostMapping("/userInfo")
	public Result<User> getUserInfo(@RequestParam Integer userId){
		User user = userService.findById(userId);
		return Result.success(user);
	}

	@PostMapping("/updateUserIntro")
	public Result updateUserIntro(@RequestParam String userIntro){
		userService.updateUserIntro(userIntro);
		return Result.success();
	}





}
