package Java05_231226;

import java.util.HashMap;

public class Java05_9 {

	public static void main(String[] args) {
		HashMap<String,String> a=new HashMap<>();
		a.put("삼국지","김씨");
		a.put("수호지","이씨");
		a.put("영웅문","박씨");

		HashMap<String,String> b=new HashMap<>();
		b.put("삼국지","삼국출판사");
		b.put("수호지","수호출판사");
		b.put("영웅문","영웅출판사");
		
		HashMap<String,Integer> c=new HashMap<>();
		c.put("삼국지",10000);
		c.put("수호지",20000);
		c.put("영웅문",30000);
		
		for(String k : c.keySet())
		System.out.println(c.get(k));
	}

}
