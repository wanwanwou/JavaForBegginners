import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class car extends Vehicle implements KeyListener{
	public car(int x,int y,int vx,int vy) {
		super (x,y,vx,vy);
		
		
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+20, y, 40, 20);
		frame.fillRect(x, y+20, 80, 20);
		frame.fillOval(x+10, y+40, 20, 20);
		frame.fillOval(x+50, y+40, 20, 20);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		    vx=-5;
	    }
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		    vx=0;
	    }
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;
	    }
    }
}