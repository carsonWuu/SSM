package com.cason.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cason.bean.StudentBean;
import com.cason.service.impl.StudentBeanServiceImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
@RequestMapping("")
public class StudentListController {
	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	
	@Autowired
	StudentBeanServiceImpl studentBeanServiceImpl;
	
	@RequestMapping(value="/show",method=RequestMethod.POST)
	public @ResponseBody String studentlist() {
		List<StudentBean> list = studentBeanServiceImpl.list();
//		Map<String,Object> map = new HashMap();
	
		System.out.println(list);
		return gson.toJson(list);
	}
	

	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String addStudent(@RequestBody StudentBean stu) {
		
		System.out.println(stu);
		int n= studentBeanServiceImpl.add(stu);
		Map<String,Object> map = new HashMap();
		map.put("result",n);
//		List<StudentBean> list = studentBeanServiceImpl.list();
		
		
		return gson.toJson(map);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String updateStudent(@RequestBody StudentBean stu) {
		
		System.out.println(stu);
		int n= studentBeanServiceImpl.update(stu);
		Map<String,Object> map = new HashMap();
		map.put("result",n);
//		List<StudentBean> list = studentBeanServiceImpl.list();
		
		
		return gson.toJson(map);
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String deleteStudent(@RequestBody StudentBean stu) {
		
		System.out.println(stu);
		int n= studentBeanServiceImpl.delete(stu);
		Map<String,Object> map = new HashMap();
		map.put("result",n);
//		List<StudentBean> list = studentBeanServiceImpl.list();
		
		
		return gson.toJson(map);
	}
}
