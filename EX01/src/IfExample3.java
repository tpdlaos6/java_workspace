import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("피자가게가 열렸나요(y or n?)");
		String pizza=s.next();
		System.out.println("치킨 가게가 열렸나요(y or n?)");
		String chicken=s.next();
		if(pizza.equals("y")) {
			System.out.println("피자가게로 가세요");
		}else if (chicken.equals("y")) {
			System.out.println("치킨가게로 가세요");
		}else {
			System.out.println("편의점에서 라면을 드세요");
		}
	}

}
