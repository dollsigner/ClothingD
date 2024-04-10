package com.clothingd.xiaopu.service.impl;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.clothingd.xiaopu.Dao.WorkDao;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.WorkService;
import com.clothingd.xiaopu.utils.ThreadLocalUtil;


public class WorkServiceImpl implements WorkService
{
	@Autowired
	private WorkDao workDao;
	@Override
	public void add(Work work)
	{
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer userId = (Integer) map.get("user_id");
		Integer userRole = (Integer) map.get("user_role");
		String username = (String) map.get("user_name");
		work.setUserId(userId);
		work.setUsername(username);
		work.setUserRole(userRole);
		work.setWorkLikesNum(0L);
		workDao.add(work);
	}
}
