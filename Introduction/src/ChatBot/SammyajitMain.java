package ChatBot;

import java.util.Scanner;

public class SammyajitMain {

	static Scanner input;
	static String user;
	//static int lineCount;
	static boolean inLoop;
	static String response;
	static Topic school;


	public static void main(String[] args) {
		createTopics();
		//lineCount = 0;
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
			if (findKeyword(response, "good",0) ){
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
	public static boolean findKeyword(String searchString, String key, int startIndex) {
		String phrase = searchString.trim();
		//set all the letters to lowercase
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		int psn = phrase.indexOf(key);
		//keep looking for the word until you find the right context.
		while(psn >= 0){
			String before = " ";
			String after = " ";
			if(psn + key.length()< phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
			}
			if (before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return true;
			}
			psn = phrase.indexOf(key,psn + 1);
		}
		return false;
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
		school =new school();
	}
}