
public class RecursiveTest_재귀함수 {
	
	public static String a = "";
	
	//recursive method. 재귀함수, 팩토리얼 구하기
	public static int fact(int n) {
		if(n<=1) {
			a+=Integer.toString(n);
			return n;			
		}
		else {
			a+=Integer.toString(n)+"*";
			return n*fact(n-1);
		}
	}
	

	public static void main(String[] args) {
		System.out.println(fact(4));
		System.out.println(Recu.a);
	}

}
