
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face[] faces=new Face[5];
		faces[0]=new Face(50,50,10,5);
		faces[1]=new Face(200,100,-10,-5);
		faces[2]=new Face(0,100,5,0);
		faces[3]=new Face(200,100,-5,0);
		faces[4]=new Face(100,0,0,5);
		for (int i=0; i<30; i++) {
			     clear();
			     for (int j=0; j<faces.length; j++) {
			    	 faces[j].draw(this);
			    	 faces[j].move();
			     }
			sleep(0.1);
		}
		
//		Face face3=new Face(350,150);
//		face3.x=50;
//		face3.y=150;
//		face3.draw(this);
		
		
	}

}
