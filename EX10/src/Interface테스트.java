interface Predator{
	String getFood();
	void eat();
}
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class Tiger extends Animal implements Predator {

	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "apple";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
		
	}
}

public class Interface테스트 {

	public static void main(String[] args) {
		//Interface로 직접 instance 생성 불가. 따라서 아래 문구 에러남
//		Predator p=new Predator();		
		
		Tiger t=new Tiger();
		t.eat();

		System.out.println(t instanceof Tiger); 
		// 위에껀 이상할 게 없음.34라인에서 t를 tiger로 선언했기에
		System.out.println(t instanceof Animal);
		// 얘는 12라인에서 tiger가 animal을 상속받았기에 true로 출력 됨
		
		Animal t2=new Tiger(); // upcasting. 자동변환됨
		Tiger t3=(Tiger) new Animal(); // downcasting. 형변환 방식으로 강제변환 해야함
	

	}
}
