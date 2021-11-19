package com.atguigu.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: RouterController
 * @Author Tan
 * @Date: 2021/11/19 9:44
 * @Version 1.0
 */
@Controller
public class RouterController {

    //跳转到首页
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    //跳转到登录页面
    @RequestMapping("/toLogin")
    public String login(){
        return "views/login";
    }

    //跳转到level 页面
    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable("id") int id){
        return "views/level1/" + id;
    }

    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable("id") int id){
        return "views/level2/" + id;
    }

    @RequestMapping("/level3/{id}")
    public String level3(@PathVariable("id") int id){
        return "views/level3/" + id;
    }
}

