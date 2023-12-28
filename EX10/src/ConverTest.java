
public class ConverTest {
	public static void main(String[] args) {
		String num="123";
		int n=Integer.parseInt(num); // String to int
		System.out.println(n); // 123 출력
		
		String s=Integer.toString(n); // int to String
		System.out.println(n);
		
		
		short s1=123;
		int i1=s1; // short to int. 자동 형변환
		
		int i2=123;
		short s2=(short)i2; 
		// (short) 안쓰면 에러 남. 에러 안날라면 (short) 써서 강제 형변환 필요
	}

}
