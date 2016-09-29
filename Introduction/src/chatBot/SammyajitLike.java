package chatBot;

public class SammyajitLike implements Topic {

	private boolean inLikeLoop;
	private String likeResponse;

	public void talk() {
		inLikeLoop = true;
		while (inLikeLoop) {
			SammyajitMain.print("What are some things you like?");
			likeResponse = SammyajitMain.getInput();
			int likePsn = SammyajitMain.findKeyword(likeResponse, "like", 0);
			if (likePsn >= 0) {
				String thingsLiked = likeResponse.substring(likePsn + 5);
				SammyajitMain.print("You are such an interesting person because you like " + thingsLiked);
				if (SammyajitMain.findKeyword(thingsLiked, "school", 0) >= 0) {
					inLikeLoop = false;
					SammyajitMain.school.talk();
				} else {
					inLikeLoop = false;
					SammyajitMain.talkForever();
				}
			} else {
				SammyajitMain.print("I don't understand you.");
			}
		}
	}

	public boolean isTriggered(String userInput) {
		if (SammyajitMain.findKeyword(userInput, "like", 0) >= 0) {
			return true;
		}
		return false;
	}

}