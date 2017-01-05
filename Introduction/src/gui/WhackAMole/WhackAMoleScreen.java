package gui.WhackAMole;

import java.util.ArrayList;

import gui.ClickableScreen;
import gui.Components.Action;
import gui.Components.TextLabel;
import gui.Components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable {
	
	private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;


	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft=30.0;
		Thread play = new Thread(this);
		play.start();
	}

	public void initAllObjects(ArrayList<Visible> viewObjects){
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350,220,100,40, "");
		timeLabel = new TextLabel(360,40,80,40,"30.0");
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}

	public PlayerInterface getAPlayer(){
		return null;
		
	}

	@Override
	public void run() {
		changeText("Ready....");
		changeText("Set....");
		changeText("Go....");
		label.setText("");
		//since this is a time game we will use a while loop. This is not necessary for
		//games that aren't timed.
		while(timeLeft>0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
		
	}

	private void appearNewMole() {
		double chance = .2*(60-timeLeft)/60;
		if(Math.random()<chance){
			MoleInterface mole = getAMole();
			mole.setApperanceTime((int)(500+Math.random()*2000));
			mole.setAction(new Action(){
					public void act(){
						player.increaseScore(1);
						remove(mole);
						moles.remove(mole);
			}
				
			});
			addObject(mole);
			moles.add(mole);
		}
	
	}

	private MoleInterface getAMole() {
		// TODO Auto-generated method stub
		return new Mole((int)(Math.random()*getWidth()),(int)(Math.random()));
	}

	private void updateAllMoles() {
		 for (int i= 0; i< moles.size();i++){
			 MoleInterface m = moles.get(i);
			 int screenTime = m.getApperanceTime()-100;
			 m.setApperanceTime(screenTime);
			 if(m.getApperanceTime()<=0){
				 remove(m);//remove from screen
				 moles.remove(m);
				 i--;//compensate for removal.
			 }
		 }
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft-=.1;
		timeLabel.setText(""+(int)(timeLeft*10/10.0));
	}

	private void changeText(String string) {
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
