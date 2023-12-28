
public class EnumTest {

	enum CoffeeType {
		AMERICANO,
		ICE_AMERICANO,
		CAFE_LATTE
	};
	public static void main(String[] args) {
		for(CoffeeType type : CoffeeType.CAFE_LATTE);		
	}

}
