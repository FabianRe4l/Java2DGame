package pack;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Movement {
	
	public Movement() {
		
		Var.move = new Timer();
		Var.move.scheduleAtFixedRate(new TimerTask() {
			
			
			@Override
			public void run() {
			
				if(Var.moveright && Var.canright){
					if(Var.movedown && Var.candown) {
						Var.rec1y++;
					} else if(Var.moveup && Var.canup){
						Var.rec1y--;
					}
					Var.rec1x++;	
				} else if(Var.moveleft && Var.canleft){
					if(Var.movedown && Var.candown) {
						Var.rec1y++;
					} else if(Var.moveup && Var.canup){
						Var.rec1y--;
					}
					Var.rec1x--;
				} else if(Var.movedown && Var.candown) {
					Var.rec1y++;
				} else if(Var.moveup && Var.canup) {
					Var.rec1y--;
				}
			}
			
		}, 0, 1);
	}

}
