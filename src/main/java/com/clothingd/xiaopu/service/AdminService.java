package com.clothingd.xiaopu.service;

import java.util.List;

import com.clothingd.xiaopu.pojo.Rank;
import com.clothingd.xiaopu.pojo.Report;


public interface AdminService
{
	List<Rank> getRankList();

	List<Report> getReportList();
}
