package com.clothingd.xiaopu.Dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.clothingd.xiaopu.pojo.User;
import com.clothingd.xiaopu.pojo.Work;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface UserDao extends BaseMapper<User> {


	@Select("select * from user where user_id=#{userId}")
	User findById(Integer userId);

	@Update("update user set user_introduction=#{userIntro} where user_id=#{userId}")
	void updateUserIntro(String userIntro, Integer userId);

}
