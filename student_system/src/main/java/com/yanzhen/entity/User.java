package com.yanzhen.entity;

import com.yanzhen.utils.Entity;

import java.util.Date;

/**
 * 
 * @author 596183363@qq.com
 * @time 2020-06-19 10:28:13
 */
public class User extends Entity {

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String remark;
	/**
	 * 
	 */
	private String userName;
	/**
	 * 
	 */
	private String userPwd;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
}