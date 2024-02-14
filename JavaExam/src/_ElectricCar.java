import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class _ElectricCar {

	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar("현대차",1);
		System.out.println(ec.name + " : " + ec.battery);
		
		
		ArrayList<ElectricCar> list=new ArrayList<ElectricCar>();
		list.add(new ElectricCar());
		list.add(new ElectricCar());
		list.get(0).name="기아차";
		list.get(0).battery=2;
		list.get(1).name="테슬라";
		list.get(1).battery=3;
		System.out.println(list.get(0).name + " : " + list.get(0).battery);
		System.out.println(list.get(1).name + " + " + list.get(1).battery);

		
		
		Map<String,ElectricCar> map=new HashMap<>();
		map.put("벤츠", new ElectricCar());
		map.get("벤츠").name="EQS";
		map.get("벤츠").battery=4;
		map.put("BMW", new ElectricCar());
		map.get("BMW").name="i7";
		map.get("BMW").battery=5;
		System.out.println(map.get("벤츠").name+" : "+map.get("벤츠").battery);
		System.out.println(map.get("BMW").name+" : "+map.get("BMW").battery);
	}

}
