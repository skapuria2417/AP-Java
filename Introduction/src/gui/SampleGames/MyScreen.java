package gui.SampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.Components.Action;
import gui.Components.Button;
import gui.Components.TextArea;
import gui.Components.Visible;

public class MyScreen extends Screen implements MouseMotionListener, MouseListener {

	private TextArea textStuff;
	private Button anotherButton;
	public static MyScreen game;

	// public static MouseFollower secondScreen;

	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		textStuff = new TextArea(500, 500, 500, 500, "Hell yeah.");
		viewObjects.add(textStuff);

		anotherButton = new Button(20, 100, 80, 40, "back", new Color(100, 100, 250), new Action() {

			public void act() {
				MouseFollower.game.setScreen(MouseFollower.cs);

			}
		});
		viewObjects.add(anotherButton);
	}

	// public static void main(String[] args) {
	// game = new MyScreen(800,600);
	// Thread app = new Thread(game);
	// app.start();
	// }

	@Override
	public void mouseClicked(MouseEvent e) {
		if (anotherButton.isHovered(e.getX(), e.getY())) {
			anotherButton.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	public MouseListener getMouseListener(){
		return this;
	}

}
