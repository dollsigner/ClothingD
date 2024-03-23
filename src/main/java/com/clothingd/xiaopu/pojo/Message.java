package com.clothingd.xiaopu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@TableName(value = "message")
public class Message
{
	@TableId(value = "message_id",type = IdType.AUTO)
	private Integer messageId;

	@TableField(value = "to_user_id")
	private Integer toUserId;

	@TableField(value = "to_user_name")
	private String toUserName;

	@TableField(value = "from_user_id")
	private Integer fromUserId;

	@TableField(value = "from_user_name")
	private String fromUserName;

	@TableField(value = "message_old_text")
	private String messageOldText;

	@TableField(value = "message_new_text")
	private String messageNewText;

	public Message(Integer messageId,Integer toUserId,String toUserName,Integer fromUserId,
			String fromUserName,String messageOldText,String messageNewText)
	{
		this.messageId = messageId;
		this.toUserId = toUserId;
		this.toUserName = toUserName;
		this.fromUserId = fromUserId;
		this.fromUserName = fromUserName;
		this.messageOldText = messageOldText;
		this.messageNewText = messageNewText;
	}
}
