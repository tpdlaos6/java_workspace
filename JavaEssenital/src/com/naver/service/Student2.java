package com.naver.service;

public class Student2 implements Person3 {
	// 인터페이스를 상속 받으면, 그 안에 있는 메서드를 꼭!!! 오버라이딩 해야 함
	
	public String name;
	public String department;
	
	@Override
	public void sleep() {
		System.out.println("2시간 잠을 잡니다");		
	}

}
