package com.example.demo.dto;

public class UserDto {
    private Integer userid;
    private String username;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                '}';
    }

    public UserDto(Integer userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public UserDto() {
    }
}
