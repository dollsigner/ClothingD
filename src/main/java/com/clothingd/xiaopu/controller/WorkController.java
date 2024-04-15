package com.clothingd.xiaopu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clothingd.xiaopu.pojo.Result;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.WorkService;
import com.clothingd.xiaopu.utils.ThreadLocalUtil;


@RestController
@Validated

public class WorkController
{
	@Autowired
	private WorkService workService;

	@PostMapping("/community/upload")
	public Result add(@RequestBody@Validated(Work.Add.class) Work work){
		workService.add(work);
		return Result.success();
	}

	@PostMapping("/work/getAuthList")
	public Result<List<Work>> getAuthList(){
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer userId = (Integer) map.get("user_id");
		List<Work> authList = workService.getAuthList(userId);
		return Result.success(authList);
	}

	@PostMapping("/work/getToSellList")
	public Result<List<Work>> getToSellList(){
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer userId = (Integer) map.get("user_id");
		List<Work> getToSellList = workService.getToSellList(userId);
		return Result.success(getToSellList);
	}
	@PostMapping("/work/getToSellList")
	public Result<List<Work>> getSoldList(){
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer userId = (Integer) map.get("user_id");
		List<Work> getSoldList = workService.getSoldList(userId);
		return Result.success(getSoldList);
	}

}
