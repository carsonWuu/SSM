package com.sp.practice.zooService;
import org.springframework.stereotype.Service;

@Service
public class Tiger {
	private String tigerName ="TigerKing";
	public String toString(){
		return "TigerName:"+tigerName;
	}
}
