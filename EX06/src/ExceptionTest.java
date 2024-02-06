import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
		
//		try {	
//		System.out.println("정수를 입력하세요 =>  ");
//		String s2=s.next();
//		int i=Integer.parseInt(s2);
//		}catch(Exception e) {
//		}
//		System.out.println("이 부분이 출력되는지 보세요...");
	
		
		
//		try {
//			Exception e=new Exception("고의발생");
//			throw e;
//		} catch(Exception e) {
//			System.out.println("에러. ");
//			e.printStackTrace();
//		}
		
		
		int num1 = 100;
		int num2 = 0;
		int result = 0;
		
		if (num2 != 0) {
			result = num1 / num2;
		} else {
			System.out.println("0으로 나눌 수 없습니다. ");
		}
		System.out.println("result = " + result);
		System.out.println();

		try {
			result = num1 / num2;
			System.out.println("result = " + result);
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누면 발생하는 Exception");
			System.out.println(ex.getClass());
			ex.printStackTrace();
		}
	}
		
}
