
public class Truck extends Vehicle{
	public Truck(int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
	
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x, y+30, 100, 20);
		frame.fillRect(x+100, y, 30, 50);
		frame.fillOval(x+15, y+50, 10, 10);
		frame.fillOval(x+75, y+50, 10, 10);
		frame.fillOval(x+85, y+50, 10, 10);
	}

}
