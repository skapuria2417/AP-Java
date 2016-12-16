package gui.Screens;

import java.util.ArrayList;

import gui.Screen;
import gui.Components.Button;
import gui.Components.TextLabel;
import gui.Components.Visible;



public class CoordinateScreen extends Screen {
	private Button myButton;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = 
				new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
	}
}
