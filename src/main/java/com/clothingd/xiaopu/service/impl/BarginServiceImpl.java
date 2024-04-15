package com.clothingd.xiaopu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothingd.xiaopu.Dao.BarginDao;
import com.clothingd.xiaopu.pojo.Bargin;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.BarginService;


@Service
public class BarginServiceImpl implements BarginService
{
	@Autowired
	private BarginDao barginDao;



	@Override
	public List<Work> getBoughtList(final Integer fromUserId)
	{
		List<Work> boughtList = barginDao.getBoughtList(fromUserId);
		return boughtList;
	}

	@Override
	public List<Bargin> getBargins(final Integer userId)
	{
		List<Bargin> bargins = barginDao.getBargins(userId);
		return bargins;
	}
}
