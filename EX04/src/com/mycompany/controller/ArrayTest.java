package com.mycompany.controller;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//number는 reference 변수이고, double형 배열을 가리킨다.
		double[] number;
		number=new double[3];
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<number.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			number[i]=s.nextDouble();
						
		}
		double avg=(number[0]+number[1]+number[2])/3;
		System.out.println("평균 : "+avg);
	}

}
