package com.clothingd.xiaopu.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "rank")
public class Rank
{
	@TableId(value = "rank_record_id", type = IdType.AUTO)
	private Integer rankRecorkId;

	@TableField(value = "user_id")
	private Integer userId;

	@TableField(value = "user_role")
	private Integer userRole;

	@TableField(value = "user_deal_num")
	private Long userDealNum;

	@TableField(value = "user_likes_num")
	private Long userLikesNum;

	@TableField(value = "time")
	private Date time;

	public Rank(Integer rankRecorkId,Integer userId,Integer userRole,Long userDealNum,
			Long userLikesNum,Date time)
	{
		this.rankRecorkId = rankRecorkId;
		this.userId = userId;
		this.userRole = userRole;
		this.userDealNum = userDealNum;
		this.userLikesNum = userLikesNum;
		this.time = time;
	}
}
