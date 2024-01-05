import java.util.Scanner;

public class Java04_231222 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("이름을 입력하세요");
			String name=s.next();
			if(name.equals("quit")) {
				break;
			}
			
			
					
			System.out.print("국어점수가 몇점인가요");
			int kor=s.nextInt();
			if(String.valueOf(kor).equals("quit")) {
				break;
			}
			
			System.out.print("영어점수가 몇점인가요");
			int eng=s.nextInt();
			if(String.valueOf(eng).equals("quit")) {
				break;
			}
			
			System.out.print("수학점수가 몇점인가요");
			int math=s.nextInt();
			if(String.valueOf(math).equals("quit")) {
				break;
			}
			
			
			double average=(kor+eng+math)/3.0;
			
			System.out.println(name+"의 평균은 "+average+"입니다."+"\r");

			
		
//		System.out.println("이름 : "+name);
		
		}
	}
}
