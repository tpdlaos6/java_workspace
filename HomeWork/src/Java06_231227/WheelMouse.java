package Java06_231227;

public class WheelMouse extends Mouse{
	public String line;
	void line() {
		System.out.println("유선입니다");
	}
	@Override
	public void move() {
		System.out.println("조금 부드러워요");
	}
	
	public WheelMouse() {}
	public WheelMouse(String name, String line) {
		super(name);
		this.line=line;
	}
	

}
