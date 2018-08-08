package com.sp.spring;

public class User {
	private String username;
	private String password;
	private String address;
	private boolean receivePaper; 
	 private String [] favoriteFrameworks;   
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
		
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
	public void setAddress(String address){
		this.address =address;
	}
	
	public String getAddress(){
		return this.address;
	}
	public boolean isReceivePaper() {
	      return receivePaper;
	   }
	   public void setReceivePaper(boolean receivePaper) {
	      this.receivePaper = receivePaper;
	   }
	
	public String[] getFavoriteFrameworks() {
		      return favoriteFrameworks;
	}
	public void setFavoriteFrameworks(String[] favoriteFramewoks) {
		this.favoriteFrameworks = favoriteFrameworks;
	}
	
	@Override
	public String toString(){
		return this.username+"\t"+this.password+"\t"+this.address+"\t"+this.favoriteFrameworks;
	}
}
