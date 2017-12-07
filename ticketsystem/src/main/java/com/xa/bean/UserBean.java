package com.xa.bean;

import java.io.Serializable;

/**
 * 用户
 * @author try hard
 *
 */
public class UserBean implements Serializable{
    private Integer userId;//用户主键id

    private String loginName;//登录名

    private String password;//登录密码

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}