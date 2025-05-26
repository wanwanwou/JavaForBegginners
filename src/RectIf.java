
public class RectIf  extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=30;
		int i;
		
		for( i=0 ; i<9 ; i++) {
			
			if (i==4) {
			    fillRect(x,100,10,100);
			} else {
			    fillRect(x,80,10,100);
			}
			x+=20;
		}
	
	}

}
