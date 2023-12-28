
public class StringBufferTest {

	public static void main(String[] args) {
		String s="abcdefg";
		System.out.println(s.replace("abc","xyz"));
		System.out.println(s); // 원본이 변경되지 않음
		
		
		// StringBuffer는 append 메서드를 사용하여 문자열 추가가 가능
		StringBuffer sb=new StringBuffer();
		sb.append("jumg to java"); 
		System.out.println(sb);
		sb.insert(0, "hello ");
		System.out.println(sb); // 원본이 바뀜
		
//		sb.substring(sb.substring(0,3));
//		System.out.println(sb.substring(0.3));
	}

}
