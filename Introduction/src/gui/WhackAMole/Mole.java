package gui.WhackAMole;

import gui.Components.Action;
import gui.Components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	public Mole(int x, int y) {
		super(x,y,.9,"resources/sampleImages/mole.png");
	}
	
	private int appearanceTime;

	@Override
	public int getApperanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setApperanceTime(int screenTime) {
		appearanceTime=screenTime;

	}

	@Override
	public void setAction(Action action) {
		// TODO Auto-generated method stub

	}

}
