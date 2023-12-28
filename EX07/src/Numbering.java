
public class Numbering extends Thread{
	String myName;
	
	Numbering(String myName){
		this.myName=myName;
	}
	
	//run() 오버라이딩
	public void run() {
		for (int n=0; n<10; n++) {
		System.out.println(myName+n);
		}
	}
}
