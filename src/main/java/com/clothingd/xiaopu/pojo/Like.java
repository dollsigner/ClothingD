package com.clothingd.xiaopu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@TableName(value = "like")
public class Like
{
	@TableId(value = "like_id",type = IdType.AUTO)
	private Integer likeId;

	@TableField(value = "work_id")
	private Integer workId;

	@TableField(value = "work_title")
	private String workTitle;

	@TableField(value = "work_introduction")
	private  String workIntroduction;

	@TableField(value = "work_likes_num")
	private Integer workLikesNum;

	@TableField(value = "from_user_id")
	private Integer fromUserId;

	@TableField(value = "from_user_name")
	private String fromUserName;

	@TableField(value = "to_user_id")
	private Integer toUserId;

	@TableField(value = "to_user_name")
	private String toUserName;

	public Like(final Integer likeId, final Integer workId, final String workTitle, final String workIntroduction,
			final Integer workLikesNum, final Integer fromUserId, final String fromUserName, final Integer toUserId,
			final String toUserName)
	{
		this.likeId = likeId;
		this.workId = workId;
		this.workTitle = workTitle;
		this.workIntroduction = workIntroduction;
		this.workLikesNum = workLikesNum;
		this.fromUserId = fromUserId;
		this.fromUserName = fromUserName;
		this.toUserId = toUserId;
		this.toUserName = toUserName;
	}
}
