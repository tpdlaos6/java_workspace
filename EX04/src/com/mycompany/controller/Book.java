package com.mycompany.controller;

public class Book {
	private String name;
	private int price;
	
	//getter - 값을 불러오는 것
	public String getName() {
		return this.name;
	}
	
	//setter - 값을 저장하는 것. 따라서 return이 필요없음
	public void setName(String name) {
		this.name=name;
	}
	
	//getter
	public int getPrice() {
		return this.price;			
	}
	
	
	//setter
	public void setPrice(int price) {
		this.price=price;
	}
}
