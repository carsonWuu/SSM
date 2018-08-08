package com.sp.practice.zooService;

import org.springframework.stereotype.Service;

@Service
public class Monkey {
	private String monkerName = "MonkenKing";
	public String toString(){
		return "MonkeyName:"+monkerName;
	}
}
