import java.util.ArrayList;

public class ThreadJoin extends Thread {

	private String seq;

	@Override
	 public void run() {
        System.out.println(this.seq+" thread start.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {
        }
        System.out.println(this.seq+" thread end.");
    }

	// main메서드가 실행되면 main thread가 자동 생성됨
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=0; i<10000; i++) {
            Thread t = new ThreadJoin();
            t.start();
            threads.add(t);
//            System.out.println("main end."); // 포문안에 묶어두면 join된 쓰레드들이 작업중에도 실행됨
        }

        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다림. join된 쓰레드들이 모두 작업완료된 후 34번 라인 실행
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");
    }

}
