import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Java07_231229 extends JFrame {
	
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);			

			int height=20;
			int vGap=10;
			int x=200;
			int y=10;
			
			//꺾은 선 그래프
			int hGap=50;
			g.drawLine(x, 200, x+hGap, 200-100);
			g.drawLine(x+hGap, 200-100, x+hGap+hGap, 200-150);
			g.drawLine(x+hGap+hGap, 200-150, x+hGap+hGap+hGap, 200-70);
			g.drawLine(x+hGap+hGap+hGap, 200-70, x+hGap+hGap+hGap+hGap, 200-120);
			g.drawLine(150, 200+hGap, 150, 20);
			g.drawLine(150, 200+hGap, x+hGap+hGap+hGap+hGap+50, 250);
			
			g.drawString("1/4분기", x-50, y+15);
			g.drawString("2/4분기", x-50, y+15+height+vGap);
			g.drawString("3/4분기", x-50, y+15+(height+vGap)*2);
			g.drawString("4/4분기", x-50, y+15+(height+vGap)*3);
			
			
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
	
	public Java07_231229() {
		this.setTitle("차트연습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(new MyPanel());
		
		this.setSize(800,800);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Java07_231229();
	}

}
