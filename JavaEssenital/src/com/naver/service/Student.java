package com.naver.service;

public class Student extends Person{
	public String department;
	void study() {
		System.out.println("공부합니다");
	}
	@Override
	public void sleep() {
		System.out.println("하루에 4시간 잡니다.");
	}
	
	public Student() {} // 기본 생성자
	public Student(String name, String department) {
//		this.name=name;
		super(name); 
		// 위 this.name=name; 을 써도 되지만, 부모의 생성자를 호출해서 
		//name 을 초기화하는 방식이 권장됨
		this.department=department;
	}
}
