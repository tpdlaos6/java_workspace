package Java05_231226;

public class Java05_5 {

	public static void main(String[] args) {
		String a="홍길동,010-1111-2222,hkd@hkd.com";

		String[] b=a.split(",");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
