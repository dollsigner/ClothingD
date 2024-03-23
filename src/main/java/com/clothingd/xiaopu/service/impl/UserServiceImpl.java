package com.clothingd.xiaopu.service.impl;

import com.clothingd.xiaopu.Dao.UserDao;
import com.clothingd.xiaopu.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl
{
    @Autowired
    UserDao userDao;

    public void addUser(Integer userId, Integer userRole, String username, String userAvatar, String userIntroduction) {
        userDao.insert(new User(userId,userRole,username,userAvatar,userIntroduction));
    }
}
