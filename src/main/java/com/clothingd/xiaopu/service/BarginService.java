package com.clothingd.xiaopu.service;

import java.util.List;

import com.clothingd.xiaopu.pojo.Bargin;
import com.clothingd.xiaopu.pojo.Work;


public interface BarginService
{
	List<Work> getBoughtList(Integer fromUserId);

	List<Bargin> getBargins(Integer userId);
}
