package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserInfoServiceTest {

    private Logger log= LoggerFactory.getLogger(UserInfoServiceTest.class);
    @Autowired
    private UserInfoService userInfoService;

    @Test
    void getuserdto() {
        UserDto userDto=userInfoService.getuserdto();
        log.info("UserInfoServiceTest-getuserdto,入参,当前用户:{}",userDto.getUsername());
        System.out.println(userDto);
    }
}