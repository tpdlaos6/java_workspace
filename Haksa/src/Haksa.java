import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Haksa extends JFrame {
	JLabel lblID=null;
	JTextField tfID=null;
	
	public Haksa() {
		this.setTitle("학사관리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout());
		
		lblID=new JLabel("학번");
		c.add(lblID);
		tfID=new JTextField();
		c.add(tfID);		
		
		this.setSize(300,500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa();
	}

}
