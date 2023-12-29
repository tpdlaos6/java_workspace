import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChartTest extends JFrame {
	
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLACK); 
			// 막대그래프
			int height=20;
			int vGap=10;
			int x=100;
			int y=10;
			g.fillRect(x, y, 100, 20); // 1/4분기
			g.fillRect(x, y+height+vGap, 150, 20); // 2/4분기
			g.fillRect(x, y+(height+vGap)*2, 200, 20); // 3/4분기
			g.fillRect(x, y+(height+vGap)*3, 300, 20); // 4/4분기
			
			g.drawString("1/4분기", x-50, y+15);
			g.drawString("2/4분기", x-50, y+15+height+vGap);
			g.drawString("3/4분기", x-50, y+15+(height+vGap)*2);
			g.drawString("4/4분기", x-50, y+15+(height+vGap)*3);
			
			
			//꺾은 선 그래프
			int hGap=50;
			g.drawLine(x, 400, x+hGap, 400-100);
			g.drawLine(x+hGap, 400-100, x+hGap+hGap, 400-150);
			g.drawLine(x+hGap+hGap, 400-150, x+hGap+hGap+hGap, 400-220);
			g.drawLine(x+hGap+hGap+hGap, 400-220, x+hGap+hGap+hGap+hGap, 400-50);
			
			//파이차트
			g.setColor(Color.RED);
			g.fillArc(x, 400, 300, 300, 0, 45);
			g.setColor(Color.GREEN);
			g.fillArc(x, 400, 300, 300, 45, 70);
			g.setColor(Color.BLUE);
			g.fillArc(x, 400, 300, 300, 115, 90);
			g.setColor(Color.ORANGE);
			g.fillArc(x, 400, 300, 300, 205, 155);
			
			
		}
		
	}
	
	public ChartTest() {
		this.setTitle("차트연습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(new MyPanel());
		
		this.setSize(800,800);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ChartTest();
	}

}
