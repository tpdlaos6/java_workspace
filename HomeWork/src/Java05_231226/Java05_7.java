package Java05_231226;

import java.util.Scanner;

public class Java05_7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("ID를 입력하시오");
		String ID=s.next();
		
		if(ID.contains("!")) {
			System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");
		}else if(ID.contains("@")) {
			System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");
		}else if(ID.contains("#")) {
			System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");
		}else if(ID.contains("$")) {
			System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");
		}else if(ID.contains("%")) {
			System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");
		}else if(ID.contains("^")) {
			System.out.println("아이디에 !,@,#,$,%,^가 포함되면 안됩니다.");
		}				
	}
}
