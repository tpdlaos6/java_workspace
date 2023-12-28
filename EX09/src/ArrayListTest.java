import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); // Wrapper Class 사용
		list.add("홍길동");
		list.add("이순신");
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		
		
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(100);
		list2.add(300);
		
//		System.out.println(list2.get(0)+list2.get(1));
		
		for(int i=0;i<100;i++) {
			list2.add(i);			
		}
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		list2.sort(Comparator.naturalOrder()); // 오름차순. 임포트 해줘야 함
		System.out.println(list2);
		list2.sort(Comparator.reverseOrder()); // 내림차순. 임포트 해줘야 함
		System.out.println(list2);
		
		
		ArrayList<Book> list3=new ArrayList<>(); 
		list3.add(new Book());
		list3.add(new Book());
		list3.add(new Book());
		list3.get(0).title="자바";
		list3.get(0).price=10000;
		System.out.println(list3.get(0).title);
		System.out.println(list3.get(0).price);
		
	}

}

