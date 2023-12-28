
public class Java01_231219 {

	public static void main(String[] args) {

		
		for(int i=1;i<=5;i++) {
			for(int k=1; k<=5-i; k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		for(int dan=2;dan<=9;dan++) {
			for (int number=1; number<=9; number++) {
				System.out.print(dan+"*"+number+"="+dan*number);
				if(number%9==0) {
					System.out.println("");
				}
			}
		}

	    }
	}

