package com.mycompany.controller;

public class ArrayTest2 {

	public static void main(String[] args) {
		Book[] books;
		books = new Book[3];
		
//		books[0] = new Book();
//		books[1] = new Book();
//		books[2] = new Book();

		//위 세줄 코드를 아래 두줄로 표현 가능
		
		for(int i=0;i<books.length;i++) {
			books[i]=new Book();
		}
		books[0].setName("OOP");
		books[0].setPrice(15000);
		System.out.println(books[0].getName());
		System.out.println(books[0].getPrice());
	}
	

}
