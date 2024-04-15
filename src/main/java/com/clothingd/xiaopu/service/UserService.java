package com.clothingd.xiaopu.service;

import java.util.List;

import com.clothingd.xiaopu.pojo.User;
import com.clothingd.xiaopu.pojo.Work;


public interface UserService
{
	User findById(Integer userId);

	void updateUserIntro(String userIntro);
}
