
public class Shape {
	public Shape next; // 다음 노드를 가리키는 reference
	public String shape;
	
	public Shape() {}
		
	public Shape(String shape) {
		this.next=null;
		this.shape=shape;
	}
	
	public void draw() {
		System.out.println(this.shape);
	}
}
