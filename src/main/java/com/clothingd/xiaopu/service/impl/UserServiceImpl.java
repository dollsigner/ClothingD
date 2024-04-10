package com.clothingd.xiaopu.service.impl;

import java.util.Map;

import com.clothingd.xiaopu.Dao.UserDao;
import com.clothingd.xiaopu.pojo.User;
import com.clothingd.xiaopu.service.UserService;
import com.clothingd.xiaopu.utils.ThreadLocalUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserDao userDao;

    public void addUser(Integer userId, Integer userRole, String userName, String userAvatar, String userIntroduction) {
        userDao.insert(new User(userId,userRole,userName,userAvatar,userIntroduction));
    }

    @Override
    public User findById(Integer userId)
    {
        User user = userDao.findById(userId);
        return user;
    }

    @Override
    public void updateUserIntro(String userIntro)
    {
        Map<String,Object> map = ThreadLocalUtil.get();
        Integer userId = (Integer) map.get("user_id");
        userDao.updateUserIntro(userIntro,userId);
    }
}
