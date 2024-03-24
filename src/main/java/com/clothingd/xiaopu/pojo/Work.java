package com.clothingd.xiaopu.pojo;

import org.hibernate.validator.constraints.URL;
import org.jetbrains.annotations.NotNull;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.clothingd.xiaopu.anno.UserRole;
import com.clothingd.xiaopu.anno.WorkCategory;
import com.clothingd.xiaopu.anno.WorkStatus;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;



@Data
@TableName(value = "work")
public class Work
{
	@TableId(value = "work_id",type = IdType.AUTO)
	@NotNull
	private Integer workId;

	@TableField(value = "work_title")
	@NotEmpty
	@Pattern(regexp = "^\\S{1,10}$")
	private String workTitle;

	@TableField(value = "work_introduction")
	@NotEmpty
	@Pattern(regexp = "^\\S{1,200}$")
	private String workIntroduction;

	@TableField(value = "work_category")
	@WorkCategory
	private Integer workCategory;

	@TableField(value = "work_img")
	@URL
	private String workImg;

	@TableField(value = "work_likes_num")
	private Long workLikesNum;

	@TableField(value = "work_status")
	@WorkStatus
	private Integer workStatus;

	@TableField(value = "work_price")
	private Integer workPrice;

	@TableField(value = "user_id")
	private Integer userId;

	@TableField(value = "user_name")
	private String username;

	@TableField(value = "user_role")
	@UserRole
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
