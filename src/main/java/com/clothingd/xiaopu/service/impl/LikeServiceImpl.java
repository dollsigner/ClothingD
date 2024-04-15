package com.clothingd.xiaopu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothingd.xiaopu.Dao.LikeDao;
import com.clothingd.xiaopu.pojo.Like;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.LikeService;

@Service
public class LikeServiceImpl implements LikeService
{
	@Autowired
	private LikeDao likeDao;

	@Override
	public List<Work> getLikeList(final Integer fromUserId)
	{
		List<Work> likeList = likeDao.getLikeList(fromUserId);
		return likeList;
	}

	@Override
	public List<Like> getLikes(final Integer toUserId)
	{
		List<Like> likes = likeDao.getLikes(toUserId);
		return likes;
	}
}
