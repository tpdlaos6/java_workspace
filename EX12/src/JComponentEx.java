import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JComponentEx extends JFrame {

	public JComponentEx() {
		this.setTitle("학사관리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x 버튼 눌렀을 때 프로그램 종료
		//만약 이걸 안할 시, 화면에서 사라지지만 실제로 종료되진 않음
		
		//버튼은 setSize와 setVisible 뒤로 가면 오동작함. 반드시 이 자리에 작성할 것
		Container c=this.getContentPane(); 
		// container 생성. 버튼을 만들기 위해선 컨테이너 생성 필수
		c.setLayout(new FlowLayout());
		JButton btn1=new JButton("button1");
		c.add(btn1);
		JButton btn2=new JButton("button2");
		btn2.setBackground(Color.RED); // 자바에서 전체 대문자는 상수를 뜻함
		btn2.setForeground(Color.GREEN); // 글자색
		btn2.setFont(new Font("Arial",Font.ITALIC,20));
		c.add(btn2);
		
		ImageIcon icon1=new ImageIcon("images/icon1.png");
		ImageIcon icon2=new ImageIcon("images/icon2.png");
		JLabel imageLabel=new JLabel("자바",icon1,SwingConstants.CENTER);
		c.add(btn2);
		
		JButton btn=new JButton("자바",icon1);
		btn.setRolloverIcon(icon2);// 마우스 커서가 올라갔을 때 이미지변경
		c.add(btn);
		
		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
		
	}

}
// 본래 인터페이스는 인스턴스 생성이 불가.
// 본래는 자식클래스를 만들어 상속을 한 뒤, 자식 클래스를 오버라이딩해서,
// 그걸로 인스턴스 생성을 해야하는 게 정석
