import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyListener1 implements ActionListener{
	private JLabel label=null;
	// label의 참조값을 저장하기위한 변수. 단 private으로 코딩했기에 직접 접근하기 힘들어서 세터 만들어야함
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭됨");
		this.label.setText("버튼1이 클릭됨");
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	
}

public class EventEx extends JFrame implements ActionListener{
	JLabel label=null;	
	
	//inner class. 바깥에 만들었던 첫번째 방법보다 이너클래스 형식이 코드가 더 간편함
	class MyListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("버튼3이 클릭됨");
			
		}
		
	}

//1. 바깥에 클래스를 만드는 방법
//2. 직접 자신이 ActionListener를 상속받아서 처리
//3. 클래스 내부에 이너클래스를 만드는 방법
//4. 앞선 3가지 방법과 달리 클래스 이름이 없음(anonymous class)
//   즉, 클래스를 안만들고 만드는 방법. 코드가 안으로 들어가기에 간단.
//   대신, 버튼이 많아질수록 코드가 지저분보일 수 있다.
//5. 람다식...

	public EventEx() {
		this.setTitle("이벤트처리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=this.getContentPane(); 
		this.setLayout(new FlowLayout()); 
		// FlowLayout 은 마치 float left 같은 효과. 창 크기 줄이면 반응형처럼 변동됨
		label=new JLabel("이벤트처리연습");
		c.add(label);
		
		JButton btn1=new JButton("버튼1");
		MyListener1 myListener1=new MyListener1(); // EventListener객체생성
		myListener1.setLabel(label);
		btn1.addActionListener(myListener1); // btn1에 myListener1 설정
		//addActionListener. 버튼을 클릭했을 때 어떤 처리를 할 건지
		c.add(btn1);
		
		JButton btn2=new JButton("버튼2");
		btn2.addActionListener(this);
		c.add(btn2);
		
		JButton btn3=new JButton("버튼3");
		MyListener2 myListener2=new MyListener2();
		btn3.addActionListener(myListener2);
		c.add(btn3);
		
		JButton btn4=new JButton("버튼4");
		//Anonymous Class를 사용하는 방식
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("버튼4가 클리됨");
			}});
		c.add(btn4);
		
		JButton btn5=new JButton("버튼5");
		btn5.addActionListener((ActionEvent e) -> {label.setText("버튼5가 클릭됨");});
		c.add(btn5);
		
		this.setSize(500,500); // 사이즈
		this.setVisible(true); // 보이게 하기
	}

	public static void main(String[] args) {
		new EventEx();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.label.setText("버튼2가 클릭됨");
	}
}
