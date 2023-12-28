abstract class Predator2{
	String food;
	abstract String getFood();
	abstract void eat();
	void bark() {
		System.out.println("bark");
	}
}
class Cat extends Predator2{

	@Override
	String getFood() {
		return this.food;
	}

	@Override
	void eat() {
		System.out.println("생선을 잘 먹어요");
	}
	
}

public class AbstractClassTest {

	public static void main(String[] args) {
//		Predator2 p=new Predator2(); 
		// 스스로 인스턴스 생성이 불가하기에 에러표시가 뜸. 
		// 즉, 상속을 받아서 사용해야함
		Cat c=new Cat();
		c.eat();
		c.bark();

	}

}
