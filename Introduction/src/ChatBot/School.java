package ChatBot;

public class School implements Topic {
	private boolean inSchoolLoop;
	private String schoolResponse;
	public void talk(){
		inSchoolLoop=true;
		while (inSchoolLoop){
			//inSchoolLoop = true;
			SammyajitMain.print("tell me about school.");
			schoolResponse = SammyajitMain.getInput();
			//SammyajitMain.print("Thats my favorite "+ "part about school too.");
			if (schoolResponse.indexOf("stop")>=0){
				inSchoolLoop = false;
				SammyajitMain.talkForever();
			}else{
				SammyajitMain.print("Thats my favorite part about school too.");
			}
		}
	}

}
