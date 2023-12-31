class SharedBoard{
	private int sum=0; // 공유데이터 역할
	// synchronized를 안붙이면 공유데이터 값이 곂치는(충돌) 에러가 발생할 수 있음.
	synchronized public void add() {
		// Thread 동기화
		int n=sum;
		Thread.yield(); // 현재 실행중인 쓰레드를 양보. sleep과 비슷하면서 다름
		n+=10;
		sum=n;
		System.out.println(Thread.currentThread().getName()+" : "+sum);	
	}
	public int getSum() {
		return this.sum;
	}
}
class StudentThread extends Thread{
	private SharedBoard board;
	public StudentThread(String name,SharedBoard board) {
		super(name); // name은 Thread 이름
		this.board=board;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			board.add();
		}
	}
	
}

public class Thread_Synchronized extends Thread{

	public static void main(String[] args) {
		SharedBoard board=new SharedBoard(); // board가 공유데이터
		//공유데이터인 board. 따라서 아래 코드의 두번째 파라미터 board는 같아야함.
		Thread t1=new StudentThread("kitae", board); 
		Thread t2=new StudentThread("hyosoo", board);
		t1.start();
		t2.start();
	}
}
