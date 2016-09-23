package ChatBot;

public class School implements Topic {
	private boolean inSchoolLoop;
	private String schoolResponse;
	public void talk(){
		while (inSchoolLoop){
			SammyajitMain.print("tell me about school.");
			schoolResponse = SammyajitMain.getInput();
			SammyajitMain.print("Thats my favorite "+ "part about school too.");
		}
	}

}
