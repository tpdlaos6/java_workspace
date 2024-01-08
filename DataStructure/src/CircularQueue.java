
public class CircularQueue {

		int rear=0; // 뒤. 데이터 입력 위치
		int front=0; // 앞. 데이터 출력 위치
		int maxsize=0; // 배열의 크기
		int[] circularQueue;
		
		public CircularQueue(int maxsize) {
			this.maxsize=maxsize;
			circularQueue=new int[this.maxsize]; //배열의 크기대로 배열생성
		}
		
		public boolean isEmpty() {
			if(rear==front) { //rear==front 이면 비어있음
				return true;
			}
			return false;
		}
		public boolean isFull() {
			if((rear+1)%maxsize==front) { //rear 다음이 front 이면 가득 참
				return true;
			}
			return false;
		}
		public void enQueue(int num) {
			if(isFull()) { // 가득 찬 상태이면
				System.out.println("큐가 가득 찼습니다.");
			}
			else { // 가득차지 않았으면
				rear = (rear+1)%maxsize; // rear를 하나 증가. 마지막에서는 0으로
				circularQueue[rear]=num; //배열에 입력

			}
		}
		public int deQueue() {
			if(isEmpty()) { //큐가 비어 있으면
				System.out.println("큐가 비어 있습니다.");
				return -1; // EOF(End Of File)의 상징적인 값 -1리턴
				//EOf..파일의 끝. 그냥 개발자들 사이에서 자주 쓰는 관용적 표현

			}
			else {
				front=(front+1)%maxsize; // front 하나 증가.마지막에서는 0으로
				return circularQueue[front]; // 배열의 값 리턴
			}
		}
		
}
