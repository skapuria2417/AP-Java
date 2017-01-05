package gui.WhackAMole;

import gui.Components.Action;
import gui.Components.Clickable;


/*
 * This is for my partner, the Enemy Designer to implement.
 * 
 */
public interface MoleInterface extends Clickable {
	int setApperanceTime = 0;

	int getApperanceTime();

	void setApperanceTime(int screenTime);

	void setAction(Action action);
}
