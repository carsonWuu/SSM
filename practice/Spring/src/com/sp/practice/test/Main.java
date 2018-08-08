package com.sp.practice.test;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Person person = ctx.getBean("person",Person.class);
		person.info();
	}
}
