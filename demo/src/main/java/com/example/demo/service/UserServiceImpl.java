package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl {

    Logger log= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 增加用户
     * @param user
     */
    public void addUser(UserDto user){
        log.info("UserServiceImpl-addUser,入参，当前用户:{}",user.getUsername());
        Map<Object,Object> map=new HashMap<>();
        map.put("userid",user.getUserid());
        map.put("username",user.getUsername());
        userMapper.addUser(map);

    }

    /**
     * 修改用户
     */
    public void updateUser(UserDto userDto,Integer id){
        log.info("UserServiceImpl-updateUser,入参，当前用户:{}",userDto);
        Map<Object,Object> map=new HashMap<>();
        map.put("userid",userDto.getUserid());
        map.put("username",userDto.getUsername());
        userMapper.updateUser(map,id);
    }

    /**
     * 根据ID查询用户
     */
    public UserDto selectUser(Integer id){
        log.info("UserServiceImpl-selectUser,入参，当前用户:{}",id);

        return userMapper.selectUser(id);
    }

    /**
     * 查询全部用户
     */
    public List<UserDto> selectAll(){
        log.info("UserServiceImpl-selectAll,入参，当前用户:{}");
        return userMapper.selectAll();
    }

    /**
     * 删除用户
     */
    public void deleteUser(Integer id){
        log.info("UserServiceImpl-deleteUser,入参，当前用户:{}",id);
       userMapper.deleteUser(id);
    }
}
