package com.clothingd.xiaopu.pojo;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@TableName(value = "bargin")
public class Bargin
{
	@TableId(value = "bargin_id", type = IdType.AUTO)
	private Integer barginId;

	@TableField(value = "bargin_price")
	private BigDecimal barginPrice;

	@TableField(value = "bargin_status")
	private Integer barginStatus;

	@TableField(value = "from_user_id")
	private Integer formUserId;

	@TableField(value = "from_user_name")
	private String fromUserName;

	@TableField(value = "to_user_id")
	private Integer toUserId;

	@TableField(value = "to_user_name")
	private String toUserName;

	@TableField(value = "work_id")
	private Integer workId;

	@TableField(value = "work_title")
	private String workTitle;

	@TableField(value = "work_introduction")
	private String workIntroduction;

	public Bargin(Integer barginId,BigDecimal barginPrice,Integer barginStatus,Integer formUserId,
			String fromUserName,Integer toUserId,String toUserName,Integer workId,String workTitle, String workIntroduction)
	{
		this.barginId = barginId;
		this.barginPrice = barginPrice;
		this.barginStatus = barginStatus;
		this.formUserId = formUserId;
		this.fromUserName = fromUserName;
		this.toUserId = toUserId;
		this.toUserName = toUserName;
		this.workId = workId;
		this.workTitle = workTitle;
		this.workIntroduction = workIntroduction;
	}
}
