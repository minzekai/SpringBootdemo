package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    Logger log= LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    void addUser() {
        UserDto userDto=new UserDto(1,"测试");
        log.info("UserServiceTest-addUser,入参，当前用户:{}",userDto);
        List<UserDto> list=userService.addUser(userDto);
        for (UserDto user:list) {
            System.out.println(user);
        }

    }

    @Test
    void updateUser() {
        UserDto userDto=new UserDto(1,"测试");
        log.info("UserServiceTest-addUser,入参，当前用户:{}",userDto);
        List<UserDto> list=userService.updateUser(userDto,0);
        for (UserDto user:list) {
            System.out.println(user);
        }
    }

    @Test
    void selectUser() {

        UserDto userDto=userService.selectUser(0);
        log.info("UserServiceTest-addUser,入参，当前用户:{}",userDto);
            System.out.println(userDto);
    }

    @Test
    void selectAll() {

        List<UserDto> list=userService.selectAll();
        log.info("UserServiceTest-addUser,入参，当前用户:{}",list);
        for (UserDto user:list) {
            System.out.println(user);
        }
    }

    @Test
    void deleteUser() {
        List<UserDto> list=userService.deleteUser(0);
        log.info("UserServiceTest-addUser,入参，当前用户:{}",list);
        for (UserDto user:list) {
            System.out.println(user);
        }
    }
}