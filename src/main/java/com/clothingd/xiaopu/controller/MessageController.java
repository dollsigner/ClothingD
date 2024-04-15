package com.clothingd.xiaopu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clothingd.xiaopu.pojo.Message;
import com.clothingd.xiaopu.pojo.Result;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.MessageService;
import com.clothingd.xiaopu.utils.ThreadLocalUtil;


@RestController
public class MessageController
{
	@Autowired
	private MessageService messageService;

	@PostMapping("/message/list")
	public Result<List<Message>> list(){
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer toUserId = (Integer) map.get("user_id");
		List<Message> list = messageService.List(toUserId);
		return Result.success(list);
	}



}
