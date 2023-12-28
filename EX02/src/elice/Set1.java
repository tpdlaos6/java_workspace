package elice;

public class Set1 {
	int toothbrush;
	int toothpaste;
	int soap;
	int shampoo;
	int rinse;

	Set1(){}
	
	Set1(int toothbrush, int toothpaste, int soap, int shampoo, int rinse){
		this.toothbrush=toothbrush;
		this.toothpaste=toothpaste;
		this.soap=soap;
		this.shampoo=shampoo;
		this.rinse=rinse;
	}
	
	//생성자 오버로딩
	Set1(int a){
		toothbrush=a;
		toothpaste=0;
		soap=0;
		shampoo=0;
		rinse=0;
	}
	
	//합계 구하는 매서드
	int add() {
		return this.rinse+this.shampoo+this.soap+this.toothbrush+this.toothpaste;
	}
	
	//출력하는 매서드
	void output(String setName) {
		System.out.println("***"+setName+"내용물***");
		System.out.println("린스 : "+this.rinse);
		System.out.println("샴푸 : "+this.shampoo);
		System.out.println("비누 : "+this.soap);
		System.out.println("치약 : "+this.toothpaste);
		System.out.println("칫솔 : "+this.toothbrush);
	}
}
