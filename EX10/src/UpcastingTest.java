class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle");
	}	
}

public class UpcastingTest {
	// paint 메서드에서 draw 메서드 호출. upcasting 활용
	// parameter 의 타입이 Shape 이므로 upcasting을 활용해서 모든 자식 객체의
	// draw() 호출 가능
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Shape line=new Line(); // 상속받았기에 타입이 달라도 에러가 안뜸
		paint(line); // upcasting. Line to Shape
		paint(new Rect()); // upcasting. Rect to Shape
		paint(new Shape());
	}

}
