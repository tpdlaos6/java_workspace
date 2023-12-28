
public class LoopExample2 {

	public static void main(String[] args) {
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		System.out.print("\n");
		
		for(int i=0;i<5;i++) {
			System.out.print("*");			
		}
		
		System.out.print("\n");
		
		for (int i=1;i<=5;i++) {
			//각 행의 수(i)와 같은 별의 수(j)까지 출력
			for (int j=1;j<=i;j++) {
				System.out.print("*");
				}	
		System.out.print("\n"); // 줄 바꿈
		}
			
		for(int dan=2;dan<=9;dan++) {
			for(int number=1;number<=9;number++) {
				System.out.println(dan+"X"+number+"="+dan*number);
			}
		}
	}
}
