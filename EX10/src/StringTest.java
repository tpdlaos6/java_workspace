
public class StringTest {

	public static void main(String[] args) {
		String a="Happy Java";
		String b="Happy Java";
		System.out.println(a);
		System.out.println(a==b); 
		System.out.println(a.equals(b)); 
		a="Java is fun";
		System.out.println(a==b);
		System.out.println(a.equals(b)); 
		
		String c=new String("Happy Java");
		String d=new String("Happy Java");
//		c="Java is fun";
		System.out.println(d);
		
		// 변수 생성시 메모리가 랜덤하게 정해지기 때문에, ==로 비교하면 false가 뜸
		System.out.println(c==d); 
		// 따라서 문자열이 같은지 비교할때는, == 보다는 equals로 비교하는 게 낫다
		System.out.println(c.equals(a));
		
		
		// indexOf : 특정 문자열이 시작되는 위치
		System.out.println(a.indexOf("Java"));
		
		// contains : 특정 문자열이 포함되어 있는지 여부(포함되면 true, 아니면 false)
		System.out.println(a.contains("Java"));
		
		// charAt : 특정 위치에 어떤 문자가 있는지 리턴
		System.out.println(c.charAt(6));
		
		// replaceAll : 문자열 전체를 바꿔줌. 원본이 바뀌진 않음
		System.out.println(a.replaceAll("Java","World"));
		System.out.println(c);
		
		// substring : (시작위치,끝위치)여기서 끝위치는 미만을 뜻함
		System.out.println(a.substring(0,4));
		
		// toUpperCase : 문자열 전체를 대문자로
		System.out.println(a.toUpperCase());
		
		// toLowerCase : 문자열 전체를 소문자로
		System.out.println(a.toLowerCase());
		
		
		// split
		String e="a:b:c:d";
		String[] result=e.split(":");
		for (int i=0; i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
		// String.format : 문자열 안에 정수10을 넣는 예시. 문자를 넣을땐 %s로 쓴다
		String greeting="I eat %d apples";
		System.out.println(String.format(greeting, 10));
		// 실제론 아래 형태로 많이 사용한다...
		System.out.println("I eat "+10+" apples");
		
		// 문자열 안에 %가 존재하고 있기에, %를 두 번 써야 에러가 안남.
		System.out.println(String.format("Error is %d%%.", 98));  

		// '    3.4213' 출력 // 총 10자리이면서, 소숫점은 4자리까지 표시라는 뜻
		System.out.println(String.format("%10.4f", 3.42134234));

	}
}

