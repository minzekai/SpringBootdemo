package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserInfoService;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private Logger log= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;

    @GetMapping("get")
    public UserDto getuser(){
        UserDto userDto=userInfoService.getuserdto();
        log.info("UserController-getuser,入参，当前用户：{}",userDto.getUsername());
        return userDto;
    }



    @GetMapping("addUser")
    public List<UserDto> addUser() {
        UserDto userDto=new UserDto(1,"测试");
        log.info("UserController-addUser,入参，当前用户:{}",userDto);
        List<UserDto> list=userService.addUser(userDto);
        return list;

    }

    @GetMapping("updateUser")
    public List<UserDto> updateUser() {
        UserDto userDto=new UserDto(1,"测试");
        log.info("UserServiceTest-updateUser,入参，当前用户:{}",userDto);
        List<UserDto> list=userService.updateUser(userDto,0);
        return list;
    }

    @GetMapping("selectUser")
    public UserDto selectUser() {

        UserDto userDto=userService.selectUser(0);
        log.info("UserController-selectUser,入参，当前用户:{}",userDto);
        return userDto;
    }

    @GetMapping("selectAll")
    public List<UserDto> selectAll() {

        List<UserDto> list=userService.selectAll();
        log.info("UserController-selectAll,入参，当前用户:{}",list);
        return list;
    }

    @GetMapping("deleteUser")
    public List<UserDto> deleteUser() {
        List<UserDto> list=userService.deleteUser(0);
        log.info("UserController-deleteUser,入参，当前用户:{}",list);
        return list;
    }
}
