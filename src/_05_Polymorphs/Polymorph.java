package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int width;
	private int height;
    private  int x;
    private int y;
    
    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width=width;
   	 this.height=height;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
