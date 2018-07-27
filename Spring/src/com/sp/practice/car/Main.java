package com.sp.practice.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]){
		Main m = new Main();
		m.test1();
	}
	public void test1(){
	    //读取配置文件
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("Car.xml");
	    CarFactory carFactory=(CarFactory) ctx.getBean("carFactory");
	    System.out.println(carFactory.toString());
	}
}
