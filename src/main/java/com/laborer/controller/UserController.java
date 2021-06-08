package com.laborer.controller;

import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laborer.entity.User;
import com.laborer.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

 /**
 * @Description: 用户
 * @Author: jeecg-boot
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController{
	@Autowired
	private IUserService userService;

	@RequestMapping("index")
	public String index(){
		return "登录页面名字";
	}

	@RequestMapping("/login")
	public String login(User user){
		return null;
	}

	@RequestMapping("/list")
	public void list(){
		List<User> list = userService.list();
		
	}

}
