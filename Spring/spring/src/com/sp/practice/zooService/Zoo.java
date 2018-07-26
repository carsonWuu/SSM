package com.sp.practice.zooService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class Zoo {
	
	@Autowired
	private Tiger tiger;
	
	@Autowired
	private Monkey monkey;

	@Override
	public String toString(){
		return tiger + "\n" +monkey;
	}
}
