package com.sp.practice.zoo;

import org.springframework.beans.factory.annotation.Autowired;

public class Zoo {
	@Autowired(required=false)
	private Tiger tiger;
	@Autowired(required=false)
	private Monkey monkey;
//	public Tiger getTiger(){
//		return tiger;
//	}
//	public void setTiger(Tiger tiger){
//		this.tiger = tiger;
//	}
//	public Monkey getMonkey(){
//		return this.monkey;
//	}
//	public void setMonkey(Monkey monkey){
//		this.monkey = monkey;
//	}
	@Override
	public String toString(){
		return tiger + "\n" +monkey;
	}
}
