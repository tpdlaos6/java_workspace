
class Counter2{
	private int[] count= {1,2,3};
	//call by reference
	void updateCount(int[] arr) { 
	//(int arr[])로 쓸 경우, 자칫 int 타입으로 착각해서 call by value 인 줄 
	//착각하는 일이 발생할 수 있음. 표기법 주의!!!	
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
	}
	int[] getCount() {
		return this.count; 
		// 위에서 가리키는 리턴값은 1,2,3 세 가지 값이 전부 넘어가는 게 아님
		// 배열이 가리키는 reference 값(여기선 count) 하나만 넘어가는 것!
	}	
}
public class CallByReference테스트 {

	public static void main(String[] args) {
		int[] arr= {10,20,30}; // 크기가 3인 배열 생성, 초기화
		Counter2 c=new Counter2();
		c.updateCount(arr);
		
		// for each문이 배열과 함께 쓰기 편함
		// 배열의 범위를 벗어나는 에러가 날 일이 없음.
		for(int a : arr) {
			System.out.println(a);
		}
		for(int b : c.getCount()) {
			System.out.println(b);
		}
	}

}
