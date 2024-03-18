ClothingD Springboot 工程

## 1、数据库设计

### 1.1 user表

#### 1.1.1 简介

![image-20240318200100500](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318200100500.png)

**user表用于存储用户相关信息**

eg：

![image-20240318200849639](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318200849639.png)

#### 1.1.2 字段

- user_id: int主键，user唯一标识
- user_role: int值，0,1,2 分别标识普通用户，设计师，管理员
- user_avatar: varchar字符型，存储用户头像的网络路径
- user_introduction: 用户个人简介

### 1.2 work表

#### 1.2.1 简介

![image-20240318202044605](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318202044605.png)

**work表用于存储作品相关信息**

![image-20240318201224967](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318201224967.png)

#### 1.2.2 字段

- work_id: 主键，work唯一标识
- work_title: varchar,  作品标题
- work_introduction: varchar, 作品简介
- work_catagory: int值，指代作品类型，0,1,2 分别代表 旧衣求改造、作品售卖、灵感求实现
- work_img: varchar, 作品图片
- work_likes: int, 作品点赞数
- work_status: int值, 作品状态,  0 1 分别代表 未成交 已成交
- work_price: numeric, 作品价格
- user_id: 发布用户id
- user_name: 发布用户名字
- user_role: 发布用户角色 0 1 2 分别代表普通用户 设计师 管理员

### 1.3 message表

#### 1.3.1 简介

![image-20240318202214990](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318202214990.png)

**message表存放留言板相关数据**

![image-20240318202549317](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318202549317.png)

#### 1.3.2 字段

- message_id 每条message的唯一标识
- from_user_id 消息来源用户id
- from_user_name 消息来源用户名
- to_user_id 消息目的用户id
- to_user_name 消息目的用户名
- message_old_text 表示本条消息回复的消息内容；当本条消息为回复消息时有效，若本条消息为作品留言消息则无效；
- message_now_text 本条消息内容

### 1.4 like表

#### 1.4.1 简介

![image-20240318202740750](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318202740750.png)



![image-20240318202644381](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318202644381.png)

**like表存放点赞相关数据**

#### 1.4.2 字段

- like_id 每条点赞唯一标识
- work_id 点赞的作品id
- work_title 点赞的作品标题
- work_introduction 点赞的作品简介
- from_user_id 点赞来源用户id
- from_user_name 点赞来源用户名
- to_user_id 收到点赞的用户id
- to_user_name 收到点赞的用户名

### 1.5 bargin表

#### 1.5.1 简介

![image-20240318212821563](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318212821563.png)

#### ![image-20240318203051398](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318203051398.png)

**存放议价消息相关数据**

#### 1.5.2 字段

- bragin_id 议价消息唯一标识
- bargin_price 议价价格
- bargin_status 议价状态 0 1 2 分别代表 未响应 已接受 已拒绝
- from_user_id 议价来源用户id
- from_user_name 议价来源用户名
- to_user_id 议价目的用户id
- to_user_name 议价目的用户名
- work_id 议价的作品id
- work_title 议价的作品标题
- work_introduction 议价的作品简介

### 1.6 rank表

#### 1.6.1 简介

![image-20240318204139623](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318204139623.png)

![image-20240318204250194](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318204250194.png)

**成交记录排行**

#### **1.6.2** 字段

- rank_record_id 唯一标识
- user_id
- user_role
- user_deal_num 成交数量
- user_likes_num 收到的赞的数量

### 1.7 report表

#### 1.7.1 简介

![image-20240318204807388](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318204807388.png)

![image-20240318204913876](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318204913876.png)![image-20240318204924130](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318204924130.png)

**存放举报记录**

#### 1.7.2 字段

- report_id 举报记录唯一标识
- report_reason 举报理由
- report_status 举报处理结果； 0 1 2 分别代表 未处理、违规已删除、未违规未删除
- from_user_id 举报来源用户id
- from_user_name 举报来源用户名
- work_id 被举报的作品id
- work_title 被举报的作品标题 

### 1.8 champion表

#### 1.8.1 简介

![image-20240318205529650](C:\Users\86132\AppData\Roaming\Typora\typora-user-images\image-20240318205529650.png)

**每月插入两条记录，分别记录当月点赞最多和成交量最多的普通用户与设计师用户**

#### 1.8.2 字段

- record_id 记录唯一标识
- user_id 该冠军用户id
- user_role 该冠军角色
- user_deal_num 该冠军成交数量
- user_likes_num 该冠军收到的赞数
- champion_type   0 1 分别代表 成交冠军 点赞冠军
- time 时间戳，插入数据时候更新

## 2. 接口设计

### 2.1 主页相关接口

#### 2.1.1 登录接口

#### 2.1.2 获取用户详细信息接口

(user表)

#### 2.1.3 更新用户简介接口

(user_introduction)

#### 2.1.4 获取设计师成交排行接口

(rank表)

#### 2.1.5 获取管理员处理记录接口

(report表)

#### 2.1.6 获取普通用户发布作品接口

(work表 user_id)

#### 2.1.7 获取普通用户感兴趣作品接口

(like表 from_user_id)

#### 2.1.8 获取普通用户已购买作品接口

(bargin表 from_user_id  bargin_status)

#### 2.1.9 获取设计师用户待售商品

(work 表 user_id work_status)

#### 2.1.9 获取设计师用户已售商品

(work 表 user_id work_status)

### 2.2 消息相关接口

#### 2.2.1 获取点赞列表

(like 表 to_user_id)

#### 2.2.2 获取议价列表

(bargin 表 to_user_id from_user_id)

#### 2.2.3 获取留言列表

(message 表 to_user_id)

### 2.3社区相关接口

#### 2.3.1 获取作品列表

#### 2.3.2 根据作品id获取作品详细数据

#### 2.3.3 发布新作品

#### 2.3.4 点赞接口

#### 2.3.5 举报接口

#### 2.3.6 议价接口

#### 2.3.7 私聊接口

