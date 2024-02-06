
public class LinkedListExam {

	public static void main(String[] args) {
		Person head=null;
		Person tail=null;
		Person tmp=null;
		
		head=new Person("홍길동", 10);
		tail=head;
		
		tmp=new Person("이순신",20);
		tail.next=tmp;
		tail=tmp;
		
		tmp=new Person("왕건",30);
		tail.next=tmp;
		tail=tmp;
		
		
		
		Person p=head;
		while(p!=null) {
			p.call();
			p=p.next;
		}
	}

}
