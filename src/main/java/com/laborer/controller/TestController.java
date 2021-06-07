package com.laborer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Wangym
 * @Date: 2021/6/7 11:32
 * @Description:
 */
@Controller
@RequestMapping("/index")
public class TestController {

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("name","王亚萌");
        return "index";
    }

}
