import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {

	public JComponentEx() {
		this.setTitle("학사관리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x 버튼 눌렀을 때 프로그램 종료
		//만약 이걸 안할 시, 화면에서 사라지지만 실제로 종료되진 않음
		
		//버튼은 setSize와 setVisible 뒤로 가면 오동작함. 반드시 이 자리에 작성할 것
		Container c=this.getContentPane(); // container 생성. 버튼을 만들기 위해선 컨테이너 생성 필수
		c.setLayout(new FlowLayout());
		JButton btn1=new JButton("버튼1");
		c.add(btn1);
		
		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
		
	}

}