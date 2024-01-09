
public class SelectionSort_선택정렬 {
 
	public static void selection_sort(int[] a) {
		selection_sort(a, a.length);
	}
	
	private static void selection_sort(int[] a, int size) {
		
		for(int i = 0; i < size - 1; i++) {
			int min_index = i;	
			
			// 최솟값을 갖고있는 인덱스 찾기 
			for(int j = i + 1; j < size; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}
			
			// i번째 값과 찾은 최솟값을 서로 교환 
			swap(a, min_index, i);
			System.out.println((i+1)+"회차======");
			for(int v : a) {
				System.out.print(v+" ");
				
			}
			System.out.println(); // 줄 바꾸기
		}
	}
	
	private static void swap(int[] a, int min_index, int i) {
		int temp = a[min_index];
		a[min_index] = a[i];
		a[i] = temp;
	}

	public static void main(String[] args) {
		int[] arr= {5,3,1,2,4};
		selection_sort(arr);
	}
}