import java.util.Scanner;

public class Prac_111 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		
		System.out.println("a의 점수?");
		int a=s.nextInt();
		System.out.println("b의 점수?");
		int b=s.nextInt();
		System.out.println("c의 점수?");
		int c=s.nextInt();
		System.out.println("a,b,c의 평균은"+" "+"(a+b+c)/3");
		
		int avg=(a+b+c)/3;

	}

}
