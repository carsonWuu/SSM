package com.sp.practice.zooService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ZooService.xml");
		Zoo zoo =(Zoo) ctx.getBean("zoo");
		System.out.println(zoo.toString());
	}
	
	
}
