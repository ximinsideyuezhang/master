package com.yanzhen.entity;

import com.yanzhen.utils.Entity;

import java.util.Date;

/**
 * 
 * @author 596183363@qq.com
 * @time 2020-06-19 10:28:13
 */
public class Course extends Entity {

	/**
	 * 
	 */
	private String courseName;
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private String remark;

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}