package com.laborer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laborer.entity.User;
import com.laborer.mapper.UserMapper;
import com.laborer.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Description: 用户
 * @Author: jeecg-boot
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
