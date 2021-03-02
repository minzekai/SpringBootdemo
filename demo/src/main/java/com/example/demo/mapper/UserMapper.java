package com.example.demo.mapper;

import com.example.demo.dto.UserDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
import org.mybatis.spring.annotation.MapperScan;

public interface UserMapper {
    /**
     * 增加用户
     */
    @Insert("INSERT INTO user VALUES (#{userid},#{username})")
    public void addUser(Map<Object,Object> map);

    /**
     * 修改用户
     */
    @Update("UPDATE user SET  userid = #{userid},username=#{username} WHERE userid = #{id}")
    public void updateUser(Map<Object,Object> map,Integer id);

    /**
     * 根据ID查询用户
     */
    @Select("SELECT userid, username FROM user WHERE userid = #{id}")
    public UserDto selectUser(Integer id);

    /**
     * 查询全部用户
     */
    @Select("SELECT userid, username FROM user")
    public List<UserDto> selectAll();

    /**
     * 删除用户
     */
    @Delete("DELETE FROM user WHERE userid = #{id} ")
    public void deleteUser(Integer id);
}
