package gui.Components;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {
private BufferedImage image;
private boolean loadedImages;
private int x;
private int y;

	public Graphic(int x, int y, String imageLocation) {
		this.x=x;
		this.y=y;
		loadedImages=false;
		loadImages(imageLocation,0,0);
		
	}
	
	public Graphic(int x, int y,int w, int h, String imageLocation) {
		this.x=x;
		this.y=y;
		loadedImages=false;
		loadImages(imageLocation,w,h);
		
	}
	
	private void loadImages(String imageLocation, int w,int h){
		try{
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w <= 0 && h<=0){
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
			}else{
				//use custom icons
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		loadedImages=true;
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
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
