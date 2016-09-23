package ChatBot;

import java.util.Scanner;

public class SammyajitMain {
	
	static Scanner input;
	static String user;
	static int lineCount;
	static boolean inLoop;
	static String response;
	static Topic school;
	
	
	public static void main(String[] args) {
		createTopics();
		lineCount = 0;
		//demonstrateStringMethod();
		promptName();
		talkForever();
	}


	private static void promptName() {
		print("Hello human! I am a board covered with semi conductors and other such electronic components. What is your name?");
		user=input.nextLine();
		print("Awesome I will call you "+ user + ". Until you terminate me.");
	}
	
	public static String getInput(){
		return input.nextLine();
	}


	public static void promptInput() {
		print(user + " try inputing a String!");
		String userInput = input.nextLine();
		print("You typed " + userInput);
	}
	
	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings, "+ user +". How are you?");
			response = getInput();
			if (response.indexOf("good") >= 0){
				print("I am so happy to here that.");
			}
			else{
				if(response.indexOf("school")>= 0){
					inLoop = false;//exit this loop
					school.talk();
					
				}else{
					print("I'm sorry I do not understand.");
				}
						
			}
			
			
			
		}
		
	}
	public static void print(String s) {
		String printString = "";
		int cutoff = 35;
		while (s.length()>0){
			String currentLine = "";
			String nextWord = "";
				//while the currentLine and nextWord are less 
				//than the cutoff. AND there are still words to add do the following loop
			while (currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				//add the next word to the line
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord = s.indexOf(" ");
				//check to see if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() -1;
				}
				//get the next word and space
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
		}
		
		System.out.println(printString);
	}

	public static void createTopics() {
		input = new Scanner(System.in);
	}
}