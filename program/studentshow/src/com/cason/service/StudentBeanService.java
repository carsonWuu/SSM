package com.cason.service;

import java.util.List;

import com.cason.bean.StudentBean;

public interface StudentBeanService {
	
	public int add(StudentBean StudentBean);  
	
	public List<StudentBean> list();
	
}
