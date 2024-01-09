
public class BubbleSort_거품정렬 {
	public static int count=0;
	public static void bubblesort(int[] a) {
		bubblesort(a,a.length);
	}

	private static void bubblesort(int[] a, int size) {
			
			// round는 배열 크기 - 1 만큼 진행됨 
			for(int i = 1; i < size; i++) {
				
				// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
				for(int j = 0; j < size - i; j++) {
					
					/*
					 *  현재 원소가 다음 원소보다 클 경우
					 *  서로 원소의 위치를 교환한다. 
					 */
					if(a[j] > a [j + 1]) {
						swap(a, j, j + 1);
					}
				}
				System.out.println(i+"회차======");
				for(int v:a) {
					System.out.print(v+" ");
				}
				System.out.println(); // 줄 바꾸기
			}
		}
		
	
		private static void swap(int[] a, int i, int j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;

		// 결과값만이 아닌, 두개씩 바뀌는 걸 모두 보고 싶다면, 
		// 위 프린트문 주석처리 후, 아래 프린트문 활성화.
			
//			count++;
//			System.out.println(count+"회차======");
//			for(int v:a) {
//				System.out.print(v+" ");
//			}
//			System.out.println(); // 줄 바꾸기
		}
	
	
	public static void main(String[] args) {
		int[] arr= {8,3,7,5,4,2};
		bubblesort(arr);
	}

}
