import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		try {	
		System.out.println("정수를 입력하세요 =>  ");
		String s2=s.next();
		int i=Integer.parseInt(s2);
		}catch(Exception e) {
		}
		System.out.println("이 부분이 출력되는지 보세요...");
	}
		
}
