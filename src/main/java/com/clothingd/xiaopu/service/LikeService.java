package com.clothingd.xiaopu.service;

import java.util.List;

import com.clothingd.xiaopu.pojo.Like;
import com.clothingd.xiaopu.pojo.Work;


public interface LikeService
{
	List<Work> getLikeList(Integer fromUserId);

	List<Like> getLikes(Integer toUserId);
}
