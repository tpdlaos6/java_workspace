import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("식권이 몇장 필요한가요?");
		short number=s.nextShort();
		
		//for 문
		for(short i=1;i<=number;i++) {
			System.out.println("[식권] #"+i);
		}
//	}
		
//		while문
		short i=1;
		while(i<=number) {
			System.out.println("[식권] #"+i);
			i++;
		};
		
		//do while 문 (잘 안씀)
//		short i=1;
//		do {
//			System.out.println("[식권] #"+i);
//			i++;
//		}while(i<=number);
		}
}
