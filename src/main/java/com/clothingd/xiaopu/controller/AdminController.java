package com.clothingd.xiaopu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clothingd.xiaopu.pojo.Rank;
import com.clothingd.xiaopu.pojo.Report;
import com.clothingd.xiaopu.pojo.Result;
import com.clothingd.xiaopu.service.AdminService;


@RestController
public class AdminController
{
	@Autowired
	private AdminService adminService;


	@PostMapping("/rank/getRankList")
	public Result<List<Rank>> getRankList(){
		List<Rank> rankList = adminService.getRankList();
		return Result.success(rankList);
	}


	@PostMapping("/report/getReportList")
	public Result<List<Report>> getReportList(){
		List<Report> reportList = adminService.getReportList();
		return Result.success(reportList);
	}
}
