
public class Switch테스트 {

	public static void main(String[] args) {
		int month=3;
		switch(month) {
		case 1: case 2: case 12: // 중복되는 것들은 이렇게 곂쳐서도 가능
			System.out.println("winter");
			break;
		case 3:
			System.out.println("spring");
			break;
		default : 
			System.out.println("other");
		
		}
	}

}
