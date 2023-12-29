import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicTest extends JFrame {
	
	//inner class. JPanel
	class MyPanel extends JPanel{
		@Override
      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         
         g.setColor(Color.RED);//색깔 설정
         
         g.drawLine(10,10,100,100); //직선
//         g.drawOval(10,120,100,100); //원        
//         g.drawRect(10,230,100,100); // 사각형
//         g.drawRoundRect(10,350,100,100,50,50); // 둥근 사각형
//         g.drawArc(10, 470, 100, 100, 0, 270); // 원호
         
         g.fillOval(10,120,100,100); //원        
         g.fillRect(10,230,100,100); // 사각형
         g.fillRoundRect(10,350,100,100,50,50); // 둥근 사각형
         g.fillArc(10, 470, 100, 100, 0, 270)	; // 원호
         
         g.drawString("그래픽", 10, 600); // 텍스트
	}
}
	
	public GraphicTest() {
		this.setTitle("그래픽연습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(new MyPanel());
		
		this.setSize(800,800);	
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GraphicTest();
	}

}
