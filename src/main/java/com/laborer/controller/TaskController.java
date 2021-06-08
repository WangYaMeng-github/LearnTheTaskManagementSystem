package com.laborer.controller;

import com.laborer.service.ITaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

 /**
 * @Author: zhangzhe
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@RestController
@RequestMapping("/task")
@Slf4j
public class TaskController{
	@Autowired
	private ITaskService taskService;

	@RequestMapping("/list")
	public void list(){

	}

}
