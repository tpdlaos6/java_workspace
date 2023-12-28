package com.mycompany.controller;


	class Mouse {
		String name;
		
		private void showName() {
			System.out.println(this.name);
		}
	}




public class PackageTest{
	public static void main(String[] args) {
		Mouse m=new Mouse();
//		m.showName(); // private 메서드이기 때문에 접근불가 에러가 뜸
		m.name="휠마우스"; // default 필드 접근 가능
		
		Book b=new Book();
		b.setName("Java");
		b.setPrice(10000);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	}
	
	
}