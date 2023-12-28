
public class ThreadTest {

	public static void main(String[] args) {
		Numbering n1=new Numbering("첫번째");
		Numbering n2=new Numbering("두번째");
		Numbering n3=new Numbering("세번째");
		Numbering n4=new Numbering("네번째");
		Numbering n5=new Numbering("다섯번째");
		Numbering n6=new Numbering("여섯번째");
		//JVM에게 thread 관리를 부탁. JVM이 thread scheduler에 등록 실행
		
		n1.start();
		n2.start();
		n3.start();
		n4.start();
		n5.start();
		n6.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
