package com.laborer.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @Description: 视频表
 * @Author: jeecg-boot
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@Data
public class Video implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	private String id;
	/**视频名称*/
	private String videoName;
	/**视频时长*/
	private Integer videoLength;
	/**视频序号*/
	private Integer videoXh;
	/**视频父级编号*/
	private String videoParent;
	/**创建日期*/
	private Date createTime;
}
