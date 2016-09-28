package chatBot;

public interface Topic {
	public void talk();
	public boolean isTriggered(String userInput);
		
}
/*
if (SammyajitMain.findKeyword(userInput, "school", 0)>= 0){
			return true;
		}
	if (SammyajitMain.findKeyword(userInput, "class", 0)>= 0){
		return true;
	}
	return false;
	}
*/