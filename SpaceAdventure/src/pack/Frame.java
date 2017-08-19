package pack;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame {

	public Frame() {
		Var.jf = new JFrame();
		Var.jf.setSize(1240, 720);
		Var.jf.setResizable(false);
		Var.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf.addKeyListener(new KeyHandler());
		Var.jf.setLocationRelativeTo(null);
		Var.jf.getContentPane().setBackground(Color.DARK_GRAY);
		Var.jf.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
		Var.jf.setVisible(true);
		
		Var.jf.add(Var.lbl);
		
	}

}
