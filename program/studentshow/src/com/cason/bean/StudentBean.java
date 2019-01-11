package com.cason.bean;

import java.util.Date;

public class StudentBean {
	private String id;
	private String name;
	private int sex;

//    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setSex(int sex) {
		this.sex= sex;
	}
	public int getSex() {
		return this.sex;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getBirthday() {
		return this.birthday;
	}
	@Override
	public String toString() {
		return (id+"\t"+name+"\t"+sex+"\t"+birthday);
	}
}
