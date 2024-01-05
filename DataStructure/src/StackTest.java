import java.util.ArrayList;

class Stack{
	public ArrayList<String> arrayStack=new ArrayList<>();
	
	//데이터 넣기
	public void push(String data) {
		arrayStack.add(data);
		
	}
	
	//데이터 꺼내기
	public String pop() {
		if(arrayStack.size()==0) {
			System.out.println("데이터가 존재하지 않습니다.");
			return null;
		}
		//마지막 요소부터 꺼내기
		return arrayStack.remove(arrayStack.size()-1);
	}
}

public class StackTest {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.arrayStack.size());
		for(int i=0;i<stack.arrayStack.size();i++) {
			System.out.println(stack.arrayStack.get(i));
		}
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop(); // 데이터가 비어있어서 꺼낼 데이터 존재하지 않음
		System.out.println(stack.arrayStack.size());
		for(int i=0;i<stack.arrayStack.size();i++) {
			System.out.println(stack.arrayStack.get(i));
		}
	}
}


