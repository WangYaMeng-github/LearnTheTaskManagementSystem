package com.laborer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laborer.entity.Video;
import com.laborer.mapper.VideoMapper;
import com.laborer.service.IVideoService;
import org.springframework.stereotype.Service;

/**
 * @Description: 视频表
 * @Author: jeecg-boot
 * @Date:   2021-06-08
 * @Version: V1.0
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {

}
