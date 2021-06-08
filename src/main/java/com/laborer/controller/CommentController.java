package com.laborer.controller;

import com.laborer.entity.Comment;
import com.laborer.service.ICommentService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

 /**
 * @Description: 评论表
 * @Author: zhangzhe
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@RestController
@RequestMapping("/comment")
@Slf4j
public class CommentController{
	@Autowired
	private ICommentService commentService;
}
