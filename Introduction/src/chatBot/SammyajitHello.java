package chatBot;

public class SammyajitHello implements Topic {

	private boolean inHelloLoop;
	private String helloResponse;
	
	private int helloCount;
	public SammyajitHello(){
		helloCount = 0;
	}
	
	private static String[] calmResponses = {"We've already said hello, silly. Hello to you too. Let's actaully talk."};
	
	private static String[] angryResponses = {"Okay seriously. This has to stop. You are beginning to annoy me."};
	
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = SammyajitMain.getInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				SammyajitMain.talkForever();
			}
		}
		
	}

	private void printResponse() {
		int responseIndex = 0;
		if (helloCount < 5){
			responseIndex = (int)(Math.random()* calmResponses.length);
			SammyajitMain.print(calmResponses[responseIndex]);
		}
		else{
			responseIndex = (int)(Math.random()* angryResponses.length);
			SammyajitMain.print(angryResponses[responseIndex]);
		}
		
	}

	@Override
	public boolean isTriggered(String userInput) {
		if (SammyajitMain.findKeyword(userInput, "hi", 0)>= 0){
			return true;
		}
		if (SammyajitMain.findKeyword(userInput, "hello", 0)>= 0){
			return true;
		}
		return false;
	}

}
