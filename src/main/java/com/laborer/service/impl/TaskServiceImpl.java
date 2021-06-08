package com.laborer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laborer.entity.Task;
import com.laborer.mapper.TaskMapper;
import com.laborer.service.ITaskService;
import org.springframework.stereotype.Service;

/**
 * @Description: 任务表
 * @Author: jeecg-boot
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {

}
