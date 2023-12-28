import java.util.Scanner; // ctrl+shift+o : 임포트 단축키

public class IfExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("몇 등인가요? (1 또는 2) : ");
		int grade=s.nextInt();
		if(grade==1) {
			System.out.println("TV를 보세요");
		}
		else {
			System.out.println("설거지를 하세요");			
			
		}
	}

}
