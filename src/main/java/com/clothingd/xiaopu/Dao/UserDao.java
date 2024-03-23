package com.clothingd.xiaopu.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.clothingd.xiaopu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
