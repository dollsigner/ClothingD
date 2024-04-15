package com.clothingd.xiaopu.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.clothingd.xiaopu.pojo.Like;
import com.clothingd.xiaopu.pojo.Work;


@Mapper
public interface LikeDao
{

	@Select("select * from like where from_user_id=#{fromUserId}")
	List<Work> getLikeList(Integer fromUserId);

	@Select("select * from like where to_user_id=#{toUserId}")
	List<Like> getLikes(Integer toUserId);
}
