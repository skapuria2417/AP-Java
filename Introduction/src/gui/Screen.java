package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.Components.Visible;

public abstract class Screen {

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;


	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}

	public abstract void 
	initObjects(ArrayList<Visible> viewObjects);

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public BufferedImage getImage(){
		return image;
	}

	public int getWidth(){
		return image.getWidth();
	}

	public int getHeight(){
		return image.getHeight();
	}

	public void update() {
		Graphics2D g = image.createGraphics();
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
//		for(int i = 0; i < viewObjects.size(); i++){
//			
//		}
		for(int i =0; i<viewObjects.size();i++){
			Visible v = viewObjects.get(i);
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}

	
	//represents ABILITY to listen to mouse
	//but isn't actually doing something
	public MouseMotionListener getMouseMotionListener(){
		return null;
	}
	
	public MouseListener getMouseListener(){
		return null;
	}
	
	public void remove(Visible v){
		/**
		 * Note: in this implementation we have a very simple command:remove(v)
		 * however, remove is sort of a big deal on the AP exam. Here's why:
		 * 
		 * When an object is removed from a list, every other object AFTER that object 
		 * is moved up in order, Therefore, all of their respective indices
		 * change. You MUST be aware of this.
		 * 
		 * Here is a CLASIC example:
		 * 
		 * The Following is WRONG
		 * Suppose you have a List<Interger> with
		 * {4,8,7,1}
		 * and you want to remove all integers greater than 5. You this:
		 * for(int i =0; i< list.size();i++){
		 * 		if(list.get(1) > 5) list.remove(i);
		 * }
		 * YOU FAIL!
		 * 
		 * Why do you fail?
		 * i=0, nothing changes
		 * i=1, the'0' is removed
		 * now we have:
		 * {4,7,1}
		 * 
		 * THESE TWO WAYS ARE CORRECT:
		 * 
		 * for(int i=0;i<list.size();i++){
		 * 	while(list.get(i) > 5) list remove(i);
		 *  }
		 *  
		 *  for(int i=0;i<list.size();i++){
		 *  	if(list.get(i)>5){
		 *  	list.remove(i);
		 *  	i--;
		 *  	}
		 *  }
		 *  
		 *  For the same reason this doesn't even work
		 *  
		 *  for(integer i: list){
		 *  	if(i<5)list.remove(i);
		 *  }
		 *  
		 *  
		 *  }
		 * 
		 */
		 
		
		viewObjects.remove(v);
	}
	
	public void moveToBack(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			//the "back" is index 0
			viewObjects.add(0,v);
			
			
		}
		
	}
	
	public void moveToFront(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			//the "back" is index 0
			viewObjects.add(v);
			
			
		}
		
	}

	public void addObject(Visible v) {
		viewObjects.add(v);
	}
	
}