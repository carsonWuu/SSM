package com.cason.service;

import java.util.List;

import com.cason.bean.StudentBean;

public interface StudentBeanService {
	
	public int add(StudentBean StudentBean);  
	
	public int delete(StudentBean StudentBean);
	
	public int update(StudentBean StudentBean);  
	
	public List<StudentBean> list();
	
	public List<StudentBean> get(StudentBean studentBean);
	
}
