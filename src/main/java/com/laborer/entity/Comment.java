package com.laborer.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 评论表
 * @Author: zhangzhe
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
    private String id;
	/**评论内容*/
    private String commentContent;
	/**评论时间*/
	private Date commentTime;
	/**任务外键*/
	private String taskId;
	/**创建日期*/
	private Date createTime;
	/**更新日期*/
	private Date updateTime;
}
