import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Calculator{
	int sum(int a, int b);
}
//class MyCalculator implements LambdaTest{
//	public int sum(int a,int b) {
//		return a+b;
//	}
//}

public class LambdaTest {

	public static void main(String[] args) {
//		Calculator mc=new MyCalculator(); // upcasting
		Calculator mc=(int a, int b)->a+b;
		System.out.println(mc.sum(10, 20));
		
		
		// 람다식. 스트림
		List<Integer> strList=Arrays.asList(10,15,20);
		List<Integer> result=strList.stream().filter(s->s%2==0).collect(Collectors.toList());
		for(int i : result) {
			System.out.println(i);
		}
	}

}
