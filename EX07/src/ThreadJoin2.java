import java.util.ArrayList;
// Thread가 사용되는 예
// 파일다운로드 시, Thread에서 다운로드. 메인쓰레드에서는 다운로드 하는 동안 다른 작업 가능
// 슈팅게임에서 총알 발사와 상관없이 캐릭터는 동작

// Thread를 상속하는 방식보다 Runnable 인터페이스를 상속하는 게 더 많이 사용됨. 
public class ThreadJoin2 implements Runnable {
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
        for(int i=0; i<100; i++) {
            Thread t = new Thread(new ThreadJoin2());
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
