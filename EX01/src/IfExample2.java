import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("몇 학년인가요(1~6)?");
		short grade=s.nextShort();
		if(grade>=2 && grade<=4) {
			System.out.println("햄버거를 드세요");
		}
		else {
			System.out.println("김밥을 드세요");
		}
	}

}
