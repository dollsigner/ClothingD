package com.clothingd.xiaopu.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.clothingd.xiaopu.pojo.Rank;
import com.clothingd.xiaopu.pojo.Report;


@Mapper
public interface AdminDao
{
	@Select("select * from rank")
	List<Rank> getRankList();

	@Select("select * from report")
	List<Report> getReportList();
}
