
public class FinalTest {
	
	//상수
	static final double PI=3.14; // 변경 불가. 공유메모리
	
	public static void main(String[] args) {
		System.out.println(FinalTest.PI); // static은 class 명으로 바로 접근 사용
		FinalTest ft=new FinalTest();
		System.out.println(ft.PI); // static PI는 하나만 만들어서 공유
		FinalTest ft2=new FinalTest();
		System.out.println(ft2.PI); // static PI는 하나만 만들어서 공유
		
//		ft.PI=10000; // 변경이 안된다는 에러표시.
	}

}
