package com.clothingd.xiaopu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@TableName(value = "work")
public class Work
{
	@TableId(value = "work_id",type = IdType.AUTO)
	private Integer workId;

	@TableField(value = "work_title")
	private String workTitle;

	@TableField(value = "work_introduction")
	private String workIntroduction;

	@TableField(value = "work_category")
	private Integer workCategory;

	@TableField(value = "work_img")
	private String workImg;

	@TableField(value = "work_likes_num")
	private Long workLikesNum;

	@TableField(value = "work_status")
	private Integer workStatus;

	@TableField(value = "work_price")
	private Integer workPrice;

	@TableField(value = "user_id")
	private Integer userId;

	@TableField(value = "user_name")
	private String username;

	@TableField(value = "user_role")
	private Integer userRole;

	protected Work(Integer workId,String workTitle,String workIntroduction,Integer workCategory, String workImg,Long workLikesNum,Integer workStatus,Integer workPrice,Integer userId,
		String username,Integer userRole)
	{
		this.workId = workId;
		this.workTitle = workTitle;
		this.workIntroduction = workIntroduction;
		this.workCategory = workCategory;
		this.workImg = workImg;
		this.workLikesNum = workLikesNum;
		this.workStatus = workStatus;
		this.workPrice = workPrice;
		this.userId = userId;
		this.username = username;
		this.userRole = userRole;
	}
}
