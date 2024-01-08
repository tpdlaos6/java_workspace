package DataStructure;

public class LinkedListTest {

	public static void main(String[] args) {
		Shape head=null; // 시작
		Shape tail=null; // 끝
		Shape tmp=null;
		Shape tmp2=null;
		
//		head=new Shape("원"); // 첫번째 객체
//		tail=head; // 처음에는 첫번째 객체가 곧 마지막 객체임.
//		
//		tmp=new Shape("삼각형"); // 두번째 객체생성
//		tail.previous=tmp;
////		tail.next=tmp; // 두번째 객체 참조값을 마지막(이전)의 next 에 저장
//		tail=tmp; // 마지막 객체
//		
//		tmp=new Shape("사각형"); // 세번째 객체생성
//		tail.previous=tmp;
////		tail.next=tmp; // 세번째 객체 참조값을 마지막(이전)의 next 에 저장
//		tail=tmp; // 마지막 객체 참조값을 방금 만든 객체의 참조값으로 변경
		
		for(int i=0;i<5;i++) {
			tmp=new Shape();
			tmp.shape=i+"번째 도형";
			if(head==null) {
				head=tmp;
				tail=head;
				continue;
			}
			
			
			tmp.previous=tail;
			tail=tmp;			
						
		}
		
		//출력
		Shape p=tail; 
		while(p!=null) {
			p.draw();
			p=p.previous;
		}
	}

}
