package com.sp.practice.zoo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Zoo.xml");
		Zoo zoo =(Zoo) ctx.getBean("zoo");
		System.out.println(zoo.toString());
	}
	
	
}
