
public class CircularQueueTest {

	public static void main(String[] args) {
		CircularQueue queue=new CircularQueue(4);
		System.out.println("처음상태=======");
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("첫번째 enQueue======");
		queue.enQueue(10);
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("두번째 enQueue======");
		queue.enQueue(20);
		System.out.println("front : "+queue.front);
		System.out.println("front : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("세번째 enQueue======");
		queue.enQueue(30);
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("배열전체데이터======");
		for(int a : queue.circularQueue) {
			System.out.println(a);
		}
		
		System.out.println("네번째 enQueue======");
		queue.enQueue(40);
		
		System.out.println("첫번째 deQueue======");
		System.out.println("꺼낸 데이터 "+queue.deQueue());
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("두번째 deQueue======");
		System.out.println("꺼낸 데이터 "+queue.deQueue());
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("세번째 deQueue======");
		System.out.println("꺼낸 데이터 "+queue.deQueue());
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("네번째 deQueue======");
		System.out.println("꺼낸 데이터 "+queue.deQueue());
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("배열전체데이터======");
		for(int a : queue.circularQueue) {
			System.out.println(a);
		}
		// 값을 다 꺼냈는데도 배열전체데이터로 했을 때 그대로 검색 되는 이유
		// --> 배열 자체 값은 그대로 있고, 가리키는 rear과 front만 이동됨
		
		System.out.println("다시 enQueue======");
		queue.enQueue(40);
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("배열전체데이터======");
		for(int a : queue.circularQueue) {
			System.out.println(a);
		}
	
	
		System.out.println("다시 enQueue======");
		queue.enQueue(10);
		System.out.println("front : "+queue.front);
		System.out.println("rear : "+queue.rear);
		System.out.println("isEmpty : "+queue.isEmpty());
		System.out.println("isFull : "+queue.isFull());
		
		System.out.println("배열전체데이터======");
		for(int a : queue.circularQueue) {
			System.out.println(a);
		}
	}

}
