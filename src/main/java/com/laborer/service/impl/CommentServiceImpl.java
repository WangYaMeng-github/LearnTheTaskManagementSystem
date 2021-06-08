package com.laborer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laborer.entity.Comment;
import com.laborer.mapper.CommentMapper;
import com.laborer.service.ICommentService;
import org.springframework.stereotype.Service;

/**
 * @Description: 评论表
 * @Author: jeecg-boot
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
