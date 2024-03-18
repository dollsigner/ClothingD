package com.clothingd.xiaopu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "user")
public class UserPojo {
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @TableField(value = "user_role")
    private Integer userRole;

    @TableField(value = "user_name")
    private String username;

    @TableField(value = "user_avatar")
    private String userAvatar;

    @TableField(value = "user_introduction")
    private String userIntroduction;

    public UserPojo(Integer userId, Integer userRole, String username, String userAvatar, String userIntroduction) {
        this.userId = userId;
        this.userRole = userRole;
        this.username = username;
        this.userAvatar = userAvatar;
        this.userIntroduction = userIntroduction;
    }


}
