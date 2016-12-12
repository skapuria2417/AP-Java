package gui.SampleGames;

import gui.GUIApplication;
import gui.Screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {
	//FIELDS
	private CoordinateScreen cs;
	

	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		cs=new CoordinateScreen(getWidth(),getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		new MouseFollower(800,600);
	}

}
