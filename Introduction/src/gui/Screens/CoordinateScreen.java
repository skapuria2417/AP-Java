package gui.Screens;

import java.util.ArrayList;

import gui.Screen;
import gui.Components.Action;
import gui.Components.Button;
import gui.Components.Graphic;
import gui.Components.TextArea;
import gui.Components.TextLabel;
import gui.Components.Visible;



import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;



public class CoordinateScreen extends Screen 
implements MouseMotionListener,MouseListener{


	//FIELD
	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic dog;
	

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(20,100,80,40,
				"The Button with a long name",new Color(100,100,250),
				new Action() {

			public void act() {
				// TODO Auto-generated method stub

			}
		});
		viewObjects.add(button);
		text = 
				new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		
		dog = new Graphic(30,30,"resources/sampleImages/dog.png");
		viewObjects.add(dog);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinate
		int my = e. getY();//get Y coord
		text.setText("Mouse at: "+mx +", "+my);
	}

	public MouseMotionListener getMouseMotionListener(){ 
		return this;
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
	
	@Override
	public MouseListener getMouseListener(){
		return this;
	}











}
