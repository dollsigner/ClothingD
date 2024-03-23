package com.clothingd.xiaopu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@TableName(value = "report")
public class Report
{
	@TableId(value = "report_id",type = IdType.AUTO)
	private Integer reportId;

	@TableField(value = "report_reason")
	private String reportReason;

	@TableField(value = "report_status")
	private Integer reportStatus;

	@TableField(value = "from_user_id")
	private Integer fromUserId;

	@TableField(value = "from_user_name")
	private  String fromUserName;

	@TableField(value = "work_id")
	private Integer workId;

	@TableField(value = "work_title")
	private String workTitle;

	public Report(Integer reportId,String reportReason,Integer reportStatus,Integer fromUserId, String fromUserName,Integer workId,String workTitle)
	{
		this.reportId = reportId;
		this.reportReason = reportReason;
		this.reportStatus = reportStatus;
		this.fromUserId = fromUserId;
		this.fromUserName = fromUserName;
		this.workId = workId;
		this.workTitle = workTitle;
	}
}
