package addressbook_231222;

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);{			

		while(true){
				System.out.print("이름 : ");
				String name=s.next();
				if(s.next().equals("quit")){
					break;
				}
				System.out.print("국어 : ");
				int kor=s.nextInt();
				if(s.next().equals("quit")){
					break;
				}
				System.out.print("영어 : ");
				int eng=s.nextInt();
				if(s.next().equals("quit")){
					break;
				}
				System.out.print("수학 : ");
				int math=s.nextInt();
				if(s.next().equals("quit")){
					break;
				}
				System.out.println(name+"의 평균은 "+(kor+eng+math)/3+" 입니다");
				if(s.next().equals("quit")){
					break;
				}
			
			}
		}

	}
}


