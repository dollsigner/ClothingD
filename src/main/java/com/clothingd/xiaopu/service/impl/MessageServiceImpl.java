package com.clothingd.xiaopu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothingd.xiaopu.Dao.MessageDao;
import com.clothingd.xiaopu.pojo.Message;
import com.clothingd.xiaopu.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService
{
	@Autowired
	private MessageDao messageDao;

	@Override
	public List<Message> List(final Integer toUserId)
	{
		List<Message> list = messageDao.list(toUserId);
		return list;
	}
}
