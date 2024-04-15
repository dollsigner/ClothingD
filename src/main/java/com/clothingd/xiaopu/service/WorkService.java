package com.clothingd.xiaopu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.clothingd.xiaopu.pojo.Work;


@Service
public interface WorkService
{

	//添加work
	void add(Work work);

	List<Work> getAuthList(Integer userId);

	List<Work> getToSellList(Integer userId);

	List<Work> getSoldList(Integer userId);
}
