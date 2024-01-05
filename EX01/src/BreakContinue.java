
public class BreakContinue {

	public static void main(String[] args) {
		for(int a=0;a<5;a++) {
			if(a==2) {
				break;		// 반복문 중지
			}
//			System.out.println(a);
		}
		for(int a=0;a<5;a++) {
			if(a%2==0) {
				continue; // 이후 실행문을 건너뛰고 a++로 이동
			}
			System.out.println(a);
		}
	}
}
