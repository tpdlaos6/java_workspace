import java.util.ArrayList;

public class QueueTest {

	public ArrayList<String> arrayQueue=new ArrayList<>();
	public void enqueue(String data) {
		arrayQueue.add(data);		
	}
	
	public String dequeue() {
		if(arrayQueue.size()==0) {
			System.out.println("데이터가 존재하지 않습니다.");
			return null;
		}
		return arrayQueue.remove(0); // 먼저 들어간 게 먼저 나오기 때문에 값이 항상 0
	}

	public static void main(String[] args) {
		QueueTest queue=new QueueTest();
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		System.out.println("size: "+queue.arrayQueue.size());
		for(int i=0;i<queue.arrayQueue.size();i++) {
			System.out.println(queue.arrayQueue.get(i));
		}
		queue.dequeue();
//		queue.dequeue();
		System.out.println("size: "+queue.arrayQueue.size());
		for(int i=0;i<queue.arrayQueue.size();i++) {
			System.out.println(queue.arrayQueue.get(i));
		}
		
	}

}
