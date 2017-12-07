package com.xa.bean;

import java.io.Serializable;

/**
 * 用户
 * @author try hard
 *
 */
public class UserBean implements Serializable{
    private Integer userId;//用户主键id

    private String userName;//用户名

    private String password;//密码

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}