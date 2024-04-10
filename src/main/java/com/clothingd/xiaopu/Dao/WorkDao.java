package com.clothingd.xiaopu.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.clothingd.xiaopu.pojo.Work;


@Mapper
public interface WorkDao
{
	@Insert("insert into work(work_title,work_introduction,work_category,work_img,work_likes_num,work_status,work_price,user_id,user_name,user_role) "
			+ "values(#{workTitle},#{workIntroduction},#{workCategory},#{workImg},0,#{workStatus},#{workPrice},#{userId},#{username},#{userRole})")
	void add(Work work);
}
