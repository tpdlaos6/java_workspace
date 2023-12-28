class Updater {
	//call by value. 파라미터 타입이 8가지 중 하나면 call by value
	void update(int count) {
		count++;
	}			
	//call by reference. 파라미터 타입이 클래스가 오면 call by reference
	void update(Counter counter) {
		counter.count++;
	}
}

class Counter {
	int count = 0;  // 객체변수
}


public class CallByValueReference테스트 {

    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter.count); // call by value
        System.out.println("after update:"+myCounter.count);
        myUpdater.update(myCounter); // call by reference
        System.out.println("after update:"+myCounter.count);
    }

}
