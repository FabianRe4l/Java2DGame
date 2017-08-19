package pack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw {
	
	public Draw() {
		
		Var.lbl = new malen();
		Var.lbl.setBounds(0,0,1240,720);
		Var.lbl.setVisible(true);
		
	}

}

class malen extends JLabel{
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		super.paintComponent(g);
		
		
		g.setColor(Color.CYAN);
		g.fillRect(Var.rec2x, Var.rec2x, Var.rec2width, Var.rec2height);
		g.setColor(Color.GREEN);
		g.fillRoundRect(Var.rec1x, Var.rec1y, Var.rec1width, Var.rec1height, 50, 50);
		g.setColor(Color.GRAY);
		g.drawString("X: "+Var.rec1x, 1, 10);
		g.drawString("Y: "+Var.rec1y, 1, 22);
		g.setColor(Color.RED);
		g2d.draw(Kollision.getBoundsBot());
		g2d.draw(Kollision.getBoundsTop());
		g2d.draw(Kollision.getBoundsleft());
		g2d.draw(Kollision.getBoundsright());
		
		
		repaint();
	}
}