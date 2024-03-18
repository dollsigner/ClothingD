package com.clothingd.xiaopu.service;

import com.clothingd.xiaopu.Dao.UserDao;
import com.clothingd.xiaopu.pojo.UserPojo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void addUser(Integer userId, Integer userRole, String username, String userAvatar, String userIntroduction) {
        userDao.insert(new UserPojo(userId,userRole,username,userAvatar,userIntroduction));
    }
}
