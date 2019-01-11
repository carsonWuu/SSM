package com.cason.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cason.bean.StudentBean;
import com.cason.mapper.StudentBeanMapper;
import com.cason.service.StudentBeanService;


@Service
public class StudentBeanServiceImpl  implements StudentBeanService{
	
	@Autowired
	StudentBeanMapper studentBeanMapper;
	
	
	@Override
	public List<StudentBean> list(){
		return studentBeanMapper.list();
	}


	@Override
	public int add(StudentBean StudentBean) {
		// TODO Auto-generated method stub
		return studentBeanMapper.add(StudentBean);
	}


	@Override
	public int delete(StudentBean StudentBean) {
		// TODO Auto-generated method stub
		return studentBeanMapper.delete(StudentBean);
	}


	@Override
	public int update(StudentBean StudentBean) {
		// TODO Auto-generated method stub
		return studentBeanMapper.update(StudentBean);
	};

}
