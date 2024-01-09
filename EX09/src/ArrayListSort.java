import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(10);
		for(int a:list) {
			System.out.print(a+" ");
		}
		System.out.println(); // 줄 바꾸기
		
		list.sort(null);
		for(int a:list) {
			System.out.print(a+" ");
			
		}
		System.out.println(); // 줄 바꾸기
		
		
		list.sort(Comparator.reverseOrder()); // 내림차순
		
		print(list);

	}
	
	public static void print(ArrayList<Integer> list) {
		for(int a:list) {
			System.out.print(a+" ");
			
		}
		System.out.println(); // 줄 바꾸기
		
	}

}
