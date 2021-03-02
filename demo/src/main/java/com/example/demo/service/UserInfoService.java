package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class UserInfoService {

    private Logger log= LoggerFactory.getLogger(UserInfoService.class);
    public UserDto getuserdto(){
        UserDto userDto=new UserDto();
        userDto.setUserid(1);
        userDto.setUsername("单元测试");
        log.info("UserInfoService-getuserdto,出参，当前用户:{}",userDto.getUsername());
        return userDto;
    }

}
