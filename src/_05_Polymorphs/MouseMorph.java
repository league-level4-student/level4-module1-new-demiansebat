package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseMorph extends Polymorph implements MouseListener{
int xSpeed=7;
	public MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	
	//// Delete stuff from this copy pasted code below..
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		setX(getX()+xSpeed);
		if(getX()+getWidth()>=PolymorphWindow.WIDTH || getX()<=0){
			xSpeed=-xSpeed;
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
