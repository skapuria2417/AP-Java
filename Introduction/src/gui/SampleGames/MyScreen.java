package gui.SampleGames;

import java.util.ArrayList;

import gui.Screen;
import gui.Components.TextArea;
import gui.Components.Visible;

public class MyScreen extends Screen {

	private TextArea textStuff;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		textStuff = new TextArea (50,50,50,50,"Hell yeah.");
		
	}

}
