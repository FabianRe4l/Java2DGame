package pack;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_D)
		{
			Var.moveright = true;	
		} else if(e.getKeyCode() == KeyEvent.VK_A)
		{
			Var.moveleft = true;
		} else if(e.getKeyCode() == KeyEvent.VK_S)
		{
			Var.movedown = true;
		} else if(e.getKeyCode() == KeyEvent.VK_W)
		{
			Var.moveup = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_D)
		{
			Var.moveright = false;	
		} else if(e.getKeyCode() == KeyEvent.VK_A)
		{
			Var.moveleft = false;
		} else if(e.getKeyCode() == KeyEvent.VK_S)
		{
			Var.movedown = false;
		} else if(e.getKeyCode() == KeyEvent.VK_W)
		{
			Var.moveup = false;
		}
		
			
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}

}
