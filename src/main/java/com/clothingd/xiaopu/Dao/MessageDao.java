package com.clothingd.xiaopu.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.clothingd.xiaopu.pojo.Message;


@Mapper
public interface MessageDao
{

	@Select("select * from message where to_user_id=#{toUserId}")
	List<Message> list(Integer toUserId);
}
