package com.clothingd.xiaopu.service;

import java.util.List;

import com.clothingd.xiaopu.pojo.Message;


public interface MessageService
{
	List<Message> List(Integer toUserId);
}
