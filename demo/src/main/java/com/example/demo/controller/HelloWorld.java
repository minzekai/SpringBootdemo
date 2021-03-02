package com.example.demo.controller;

import com.example.demo.service.UserRelataionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @Value("${avatarPath}")
    private String name;
    @Autowired
    private UserRelataionService userRelataionService;
    @GetMapping("index")
    public String hello(){
        return "hello world"+name;
    }

    @GetMapping("log")
    public String log(){
        return userRelataionService.logtest();
    }

    @GetMapping("cTest")
    public String creatTest(){
        return "单元测试";
    }
}
