package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class UserRelataionService {
    private Logger log= LoggerFactory.getLogger(UserRelataionService.class);
    public String logtest(){
        log.info("用于测试infi");
        log.error("用于测试error");
//        log.debug("用于测试debug");
        log.info("UserRelationService-addUser,入参，用户josn：{}");
        return "这是日志的测试方法";
    }
}
