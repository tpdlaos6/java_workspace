
public class Person {
	public Person next;

	public String name;
	public int age;
	
	public Person() {}
		
	public Person(String name, int age) {
		this.next=null;
		this.name=name;
		this.age=age;
	}
	
	public void call() {
		System.out.print(name +":");
		System.out.println(age);
	}
}
