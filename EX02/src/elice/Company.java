package elice;

public class Company {

	public static void main(String[] args) {
		Set1 s1; // 변수선언. s1은 레퍼런스변수이고, SET1타입 객체를 가르키는 reference를 저장
		//Set1()은 기본생성자. 작성하지 않으면 자동으로 추가됨
		s1=new Set1(); // instance 생성. new SET1() 생성자(constructor) 호출
		s1.rinse=1;
		s1.shampoo=1;
		s1.soap=3;
		s1.toothbrush=2;
		s1.toothpaste=1;
		
		System.out.println(s1.soap);
		
		Set1 s3=new Set1();
		s3.rinse=1;
		s3.shampoo=1;
		s3.soap=2;
		s3.toothbrush=0;
		s3.toothpaste=4;
		
		System.out.println(s3.rinse);
		
		
		Set1 s4=new Set1(10);
		System.out.println(s4.toothbrush);
		
		Set1 s5=new Set1(10,20,30,40,50);
		System.out.println(s5.shampoo);
		
		System.out.println(s5.add());
		s5.output("설선물세트");
		
		
		Set2 cs1=new Set2(10,10,777);
		System.out.println(cs1.canola);		
		cs1.output("설선물세트2호");
	}

}
