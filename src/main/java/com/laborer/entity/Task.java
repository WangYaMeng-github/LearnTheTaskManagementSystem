package com.laborer.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 任务表
 * @Author: jeecg-boot
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	private String id;
	/**任务名称*/
	private String taskName;
	/**任务状态*/
	private Integer taskState;
	/**开始日期*/
	private Date taskBeginTime;
	/**截止日期*/
	private Date taskEndTime;
	/**用户id*/
	private String userId;
	/**逻辑删*/
	private Integer isDel;
	/**创建日期*/
	private Date createTime;
	/**更新日期*/
	private Date updateTime;
}
