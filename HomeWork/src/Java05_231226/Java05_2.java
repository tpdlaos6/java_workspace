package Java05_231226;

public class Java05_2 {

	public static void main(String[] args) {
		String a="010-1234-5678";
		String[] b=a.split("-");
		
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]);
	}

}
