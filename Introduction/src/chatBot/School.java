package chatBot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolsResponse;

	public void talk() {
		inSchoolLoop = true;
		while (inSchoolLoop) {
			SammyajitMain.print("Tell me about school.");
			schoolsResponse = SammyajitMain.getInput();
			if (schoolsResponse.indexOf("stop") >= 0) {
				inSchoolLoop = false;
				SammyajitMain.talkForever();
			}
			SammyajitMain.print("That's my favorite part about school");
		}
	}

	public boolean isTriggered(String userInput) {
		if (SammyajitMain.findKeyword(userInput, "school", 0) >= 0) {
			return true;
		}
		if (SammyajitMain.findKeyword(userInput, "class", 0) >= 0) {
			return true;
		}
		return false;
	}

}