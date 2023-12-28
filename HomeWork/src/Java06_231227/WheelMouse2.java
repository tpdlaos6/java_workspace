package Java06_231227;

public class WheelMouse2 implements Mouse3{

	public String name;
	public String line;
	
	@Override
	public void move() {
		System.out.println("휠만큼 부드럽습니다.");
	}

}
