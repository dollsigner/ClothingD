package com.clothingd.xiaopu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clothingd.xiaopu.pojo.Bargin;
import com.clothingd.xiaopu.pojo.Like;
import com.clothingd.xiaopu.pojo.Result;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.BarginService;
import com.clothingd.xiaopu.utils.ThreadLocalUtil;


@RestController
public class BarginController
{
	@Autowired
	private BarginService barginService;

	@PostMapping("/bargin/getBoughtList")
	public Result<List<Work>> getBoughtList(){
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer fromUserId = (Integer) map.get("from_user_id");
		List<Work> boughtList = barginService.getBoughtList(fromUserId);
		return Result.success(boughtList);
	}

	@PostMapping("/message/bargin")
	public Result<List<Bargin>> getBargins(){
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer userId = (Integer) map.get("user_id");
		List<Bargin> bargins = barginService.getBargins(userId);
		return Result.success(bargins);
	}

}
