package com.clothingd.xiaopu.service;

import com.clothingd.xiaopu.pojo.User;


public interface UserService
{
	User findById(Integer userId);

	void updateUserIntro(String userIntro);
}
