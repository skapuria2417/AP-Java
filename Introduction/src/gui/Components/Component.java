package gui.Components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Component implements Visible {
	//FIELDS
	private int x;
	private int y;
	private int w;
	private int h;
	
	private BufferedImage image;

	public Component(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.image= new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return w;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return h;
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	@Override
	public void update() {
		update(image.createGraphics());
	}
	public abstract void update(Graphics2D g);
	
	public Graphics2D clear(){
		image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		return image.createGraphics();
	}
}
