package com.clothingd.xiaopu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothingd.xiaopu.Dao.AdminDao;
import com.clothingd.xiaopu.pojo.Rank;
import com.clothingd.xiaopu.pojo.Report;
import com.clothingd.xiaopu.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminDao adminDao;


	@Override
	public List<Rank> getRankList()
	{
		List<Rank> rankList = adminDao.getRankList();
		return rankList;
	}

	@Override
	public List<Report> getReportList()
	{
		List<Report> reportList = adminDao.getReportList();
		return reportList;
	}
}
