package elice;

public class Set2 extends Set1{
	int ham;
	int canola;
	
	Set2(int toothbrush,int ham, int canola){
		//부모 생성자 호출
		super(toothbrush);
		this.ham=ham;
		this.canola=canola;
	}
	// 오버라이딩
	void output(String setName) {
		super.output(setName); // 부모의 output() 호출
		System.out.println(this.ham);
		System.out.println(this.canola);
	}
}
