package com.clothingd.xiaopu.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.clothingd.xiaopu.pojo.Bargin;
import com.clothingd.xiaopu.pojo.Work;


@Mapper
public interface BarginDao
{


	@Select("select * from bargin where from_user_id=#{fromUserId} and bargin_status=1")
	List<Work> getBoughtList(Integer fromUserId);

	@Select("select * from bargin where to_user_id=#{userId} or from_user_id=#{userId}")
	List<Bargin> getBargins(Integer userId);
}
