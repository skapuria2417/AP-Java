package chatBot;

public class SammyajitLike implements Topic{
	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk(){
		SammyajitMain.print("What are some things you like?");
		inLikeLoop=true;
		while(inLikeLoop){
			likeResponse = SammyajitMain.getInput();
			int likePsn = SammyajitMain.findKeyword(likeResponse,"like", 0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				SammyajitMain.print("you are very interesting beacause you like."+thingsLiked );
				
				
				if(SammyajitMain.findKeyword(thingsLiked, "school", 0)>=0){
					inLikeLoop = false;
					SammyajitMain.school.talk();}
					else{
						inLikeLoop = false;
						SammyajitMain.talkForever();
					}
				}
			else{
				SammyajitMain.print("I dont understand u");
			}
		}
	}
}
