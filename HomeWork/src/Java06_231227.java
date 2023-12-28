import java.util.ArrayList;

import Java06_231227.Mouse;
import Java06_231227.Mouse2;
import Java06_231227.WheelMouse;
import Java06_231227.WheelMouse2;

public class Java06_231227 {

	public static void main(String[] args) {
		Mouse m=new Mouse();
		m.name="로지텍";
		m.move();
		System.out.println(m.name);

		Mouse2 m2=new Mouse2();
		m2.setName("아이리버");
		m2.move();
		System.out.println(m2.getName());
		
		WheelMouse w=new WheelMouse();
		w.name="로지텍휠";
		w.line="유선";
		w.move();
		
		Mouse m3=new Mouse("삼성");
		System.out.println(m3.name);
		
		WheelMouse w2=new WheelMouse("LG","유선");
		System.out.println(w2.name);
		System.out.println(w2.line);
		
		WheelMouse2 w3=new WheelMouse2();
		w3.name="쿠팡";
		w3.line="무선";
		System.out.println(w3.name);
		System.out.println(w3.line);
		
		ArrayList<Mouse> list=new ArrayList<>();
		list.add(new Mouse());
		list.add(new Mouse());
		list.add(new Mouse());
		list.get(1).name="삼성2";
		list.get(1).price=10000;
		System.out.println(list.get(0).name);
		System.out.println(list.get(1).price);
		
	}

}
