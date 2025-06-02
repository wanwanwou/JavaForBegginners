
public class RectIf  extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=30;
		int i;
		int rgb=0;
		for( i=0 ; i<10 ; i++) {
			
			if (i==4) {
				rgb +=20;
				setColor(rgb,rgb,rgb);
			  //  fillRect(x,100,10,x);
			//} else {
			    fillRect(x,100,10,100);
			}
			x+=15;
		}
	
	}

}
