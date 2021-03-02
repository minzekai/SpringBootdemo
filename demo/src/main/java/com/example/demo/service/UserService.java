package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    Logger log= LoggerFactory.getLogger(UserService.class);

    private List<UserDto> list;
    public UserService() {
         list=new ArrayList<UserDto>();
         UserDto locUser1=new UserDto(0,"admin");
        UserDto locUser2=new UserDto(100,"admin2");
         list.add(locUser1);
         list.add(locUser2);
    }

    /**
     * 增加用户
     * @param user
     */
    public List<UserDto> addUser(UserDto user){
        log.info("UserService-addUser,入参，当前用户:{}",user.getUsername());
        list.add(user);
        return list;
    }

    /**
     * 修改用户
     */
    public List<UserDto> updateUser(UserDto userDto,Integer id){
        for (UserDto user:list) {
            if(user.getUserid()==id){
                log.info("UserService-updateUser,入参，当前用户:{}",userDto.getUsername());
                user.setUserid(userDto.getUserid());
                user.setUsername(userDto.getUsername());
            }
        }
        return list;
    }

    /**
     * 根据ID查询用户
     */
    public UserDto selectUser(Integer id){
        for (UserDto user:list) {
            if(user.getUserid()==id){
                log.info("UserService-updateUser,入参，当前用户:{}",id);
                return user;
            }
        }
        return null;
    }

    /**
     * 查询全部用户
     */
    public List<UserDto> selectAll(){
        log.info("UserService-selectAll,入参，当前用户:{}",list);
        return list;
    }

    /**
     * 删除用户
     */
    public List<UserDto> deleteUser(Integer id){
        for (int i=list.size()-1;i>=0;i--) {
            if(list.get(i).getUserid()==id){
                log.info("UserService-deleteUser,入参，当前用户:{}",id);
                list.remove(i);
            }
        }
        return list;
    }

}
