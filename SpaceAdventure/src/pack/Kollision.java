package pack;

import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;

public class Kollision {
	
	static Rectangle getBoundsBot() {return new Rectangle(Var.rec1x+(Var.rec1width/25),Var.rec1y+(Var.rec1height/2),Var.rec1width/25*23,Var.rec1height/2);}
	static Rectangle getBoundsTop() {return new Rectangle(Var.rec1x+(Var.rec1width/25),Var.rec1y,Var.rec1width/25*23,Var.rec1height/2);}
	static Rectangle getBoundsleft() {return new Rectangle(Var.rec1x,Var.rec1y+2,Var.rec1width/25,Var.rec1height-4);}
	static Rectangle getBoundsright() {return new Rectangle(Var.rec1x+(Var.rec1width/25*24),Var.rec1y+2,Var.rec1width/25,Var.rec1height-4);}
	
	public static void ObjKollision(int rec2x, int rec2y, int rec2width, int rec2height) {
		 
		if(Var.rec1x <= rec2x + rec2width && Var.rec1x + Var.rec1width/25 >= rec2x && Var.rec1y+2 <=rec2y + rec2height && Var.rec1y+2 + Var.rec1height-4 >= rec2y) {
			Var.canleft = false;
			System.out.println("Kollision links!");
		} else {
			Var.canleft = true;
		}
		
		if(Var.rec1x+(Var.rec1width/25*24) <= rec2x + rec2width && Var.rec1x+(Var.rec1width/25*24) + Var.rec1width/25 >= rec2x && Var.rec1y+2 <= rec2y + rec2height && Var.rec1y+2 + Var.rec1height-4 >= rec2y) {
			Var.canright = false;
			System.out.println("Kollision rechts!");
		} else {
			Var.canright = true;
		}
		
		if(Var.rec1x+(Var.rec1width/25) <= rec2x + rec2width && Var.rec1x+(Var.rec1width/25) + Var.rec1width/25*23 >= rec2x && Var.rec1y+(Var.rec1height/2) <= rec2y + rec2height && Var.rec1y+(Var.rec1height/2) + Var.rec1height/2 >= rec2y) {
			Var.candown = false;
			System.out.println("Kollision Unten!");
		} else {
			Var.candown = true;
		}
		
		if(Var.rec1x+(Var.rec1width/25) <= rec2x + rec2width && Var.rec1x+(Var.rec1width/25) + Var.rec1width/25*23 >= rec2x && Var.rec1y <= rec2y + rec2height && Var.rec1y + Var.rec1height/2 >= rec2y) {
			Var.canup = false;
			System.out.println("Kollision Oben!");
		} else {
			Var.canup = true;
		} 
		
	}
	
	
	public Kollision() {
		
		Var.tester = new Timer();
		Var.tester.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				ObjKollision(Var.rec2x, Var.rec2y, Var.rec2width, Var.rec2height);
				
			}
		}, 0, 1);
		
	}


}
