package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserControllerC3p0 {
    private Logger log= LoggerFactory.getLogger(UserControllerC3p0.class);

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("addUserC3p0")
    public void addUser() {
        UserDto userDto=new UserDto(1,"测试");
        log.info("UserControllerC3p0-addUser,入参，当前用户:{}",userDto);
        userServiceImpl.addUser(userDto);

    }

    @GetMapping("updateUserC3p0")
    public void updateUser() {
        UserDto userDto=new UserDto(1,"测试");
        log.info("UserServiceTest-updateUser,入参，当前用户:{}",userDto);
        userServiceImpl.updateUser(userDto,0);
    }

    @GetMapping("selectUserC3p0")
    public UserDto selectUser() {
        log.info("UserControllerC3p0-selectUser,入参，当前用户:{}");
        return userServiceImpl.selectUser(0);
    }

    @GetMapping("selectAllC3p0")
    public List<UserDto> selectAll() {


        log.info("UserControllerC3p0-selectAll,入参，当前用户:{}");
        return userServiceImpl.selectAll();
    }

    @GetMapping("deleteUserC3p0")
    public void deleteUser() {
        log.info("UserControllerC3p0-deleteUser,入参，当前用户:{}");
        userServiceImpl.deleteUser(0);
    }
}
