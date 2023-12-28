package com.mycompany.controller;

public class ReferenceTest {

	public static void main(String[] args) {
		Book b=new Book();
		b.setName("jsp");
		b.setPrice(20000);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		
		Book b2;
		b2=b;
		System.out.println(b2.getName());
		System.out.println(b2.getPrice());
	
		
		b=new Book();
		System.out.println(b.getName());
	}

}
