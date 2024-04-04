package com.clothingd.xiaopu.service;

import org.springframework.stereotype.Service;

import com.clothingd.xiaopu.pojo.Work;


@Service
public interface WorkService
{

	//添加work
	void add(Work work);
}
