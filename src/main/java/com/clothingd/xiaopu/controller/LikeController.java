package com.clothingd.xiaopu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clothingd.xiaopu.pojo.Like;
import com.clothingd.xiaopu.pojo.Result;
import com.clothingd.xiaopu.pojo.Work;
import com.clothingd.xiaopu.service.LikeService;
import com.clothingd.xiaopu.utils.ThreadLocalUtil;


@RestController
public class LikeController
{
	@Autowired
	private LikeService likeService;

	@PostMapping("/like/getLikeList")
	public Result<List<Work>> getLikeList(){
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer fromUserId = (Integer) map.get("user_id");
		List<Work> likeList = likeService.getLikeList(fromUserId);
		return Result.success(likeList);
	}


	@PostMapping("/message/likes")
	public Result<List<Like>> getLikes(){
		Map<String,Object> map = ThreadLocalUtil.get();
		Integer toUserId = (Integer) map.get("user_id");
		List<Like> likes = likeService.getLikes(toUserId);
		return Result.success(likes);
	}
}
