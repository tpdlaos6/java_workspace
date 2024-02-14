
public class ElectricCar extends Car{
	public int battery;
	
	public ElectricCar() {}
	public ElectricCar(String name, int battery) {
		super(name);
		this.battery=battery;
	}
}
