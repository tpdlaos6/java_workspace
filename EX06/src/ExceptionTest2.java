import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		try {
		System.out.println("분자 : ");
		int a=s.nextInt();
		System.out.println("분모 : ");
		int b=s.nextInt();		
		System.out.println(a/b);
		
		System.out.println("정수 입력=> ");
		String str=s.next();
		int i=Integer.parseInt(str);
		}catch(ArithmeticException e){
			System.out.println("분모가 0이면 안되요");
		}catch(NumberFormatException e) {
			System.out.println("숫자형식만 정수로 변환 가능");
		}
		
		System.out.println("예외처리된 부분 빼고 출력");
		

	
	}

}
