package simon;

import java.util.ArrayList;

import gui.ClickableScreen;
import gui.Components.TextLabel;
import gui.Components.Visible;

public class SimonScreenSammy extends ClickableScreen implements Runnable {
	
	private TextLabel textLabel;
	private ButtonInterfaceSammy button;
	private ProgressInterfaceSammy progress;
	private ArrayList<MoveInterfaceSammy> move;
	
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;

	

	public SimonScreenSammy(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}
