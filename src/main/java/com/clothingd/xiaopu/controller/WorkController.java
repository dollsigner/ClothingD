package com.clothingd.xiaopu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clothingd.xiaopu.pojo.Result;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.WorkService;


@RestController
@Validated
@RequestMapping("/work")
public class WorkController
{
	@Autowired
	private WorkService workService;

	@PostMapping
	public Result add(@RequestBody@Validated(Work.Add.class) Work work){
		workService.add(work);
		return Result.success();
	}


}
