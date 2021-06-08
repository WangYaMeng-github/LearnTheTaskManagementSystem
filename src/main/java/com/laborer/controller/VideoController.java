package com.laborer.controller;

import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laborer.service.IVideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
 /**
 * @Description: 视频表
 * @Author: jeecg-boot
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@RestController
@RequestMapping("/com.laborer/video")
@Slf4j
public class VideoController{
	@Autowired
	private IVideoService videoService;

}
