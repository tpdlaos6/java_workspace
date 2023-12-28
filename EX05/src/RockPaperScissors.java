import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("0,1,2 중 하나를 입력하세요(0:가위,1:바위,2:보)");
		Scanner s=new Scanner(System.in);
		int myChoice=s.nextInt();
		
		double randomNumber=Math.random(); // 0 ~ 1 미만
		System.out.println(randomNumber);
		double NumberMultiple10=randomNumber*10;
		int randomInt=(int)NumberMultiple10; // double to int
		int computerChoice=randomInt%3; // 컴퓨터가 선택한 값. 0,1,2 중 하나
		
		System.out.println("컴퓨터 : "+computerChoice);
		System.out.println("나 : "+myChoice);
		
		if(myChoice==0) {
			if(computerChoice==0) {
				System.out.println("비겼습니다.");
			}else if(computerChoice==1) {
				System.out.println("컴퓨터가 이겼습니다.");
				
			}else if(computerChoice==2) {
				System.out.println("당신이 이겼습니다.");
			}
		}else if(myChoice==1) {
	if(computerChoice==0) {
		System.out.println("당신이 이겼습니다.");
				
			}else if(computerChoice==1) {
				System.out.println("비겼습니다.");
				
			}else if(computerChoice==2) {
				System.out.println("컴퓨터가 이겼습니다.");
				
			}
		}else if(myChoice==2) {
	if(computerChoice==0) {
		System.out.println("컴퓨터가 이겼습니다.");
				
			}else if(computerChoice==1) {
				System.out.println("당신이 이겼습니다.");
				
			}else if(computerChoice==2) {
				System.out.println("비겼습니다.");
				
			}
		}
	}

}
