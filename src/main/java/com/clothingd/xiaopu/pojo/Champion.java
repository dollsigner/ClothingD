package com.clothingd.xiaopu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@TableName(value = "champion")
public class Champion
{
	@TableId(value = "record_id",type = IdType.AUTO)
	private Integer recordId;

	@TableField(value = "user_id")
	private Integer userId;

	@TableField(value = "user_id")
	private Integer userRole;

	@TableField(value = "user_deal_num")
	private Long userDealNum;

	@TableField(value = "user_like_num")
	private Long userLikeNum;

	@TableField(value = "chanpion_type")
	private Integer championType;

	public Champion(Integer recordId,Integer userId,Integer userRole,Long userDealNum, Long userLikeNum,Integer championType)
	{
		this.recordId = recordId;
		this.userId = userId;
		this.userRole = userRole;
		this.userDealNum = userDealNum;
		this.userLikeNum = userLikeNum;
		this.championType = championType;
	}
}
