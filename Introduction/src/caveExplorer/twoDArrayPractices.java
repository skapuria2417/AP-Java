package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArrayPractices {
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;

	public static void main(String[] args){
		arr2D = new String[4][3];
		pic = new String[][];
		for(int row = 0; row < arr2D.length; row++){
			//in each row, go column by column
			for(int column = 0; column < arr2D[row].length; column++){
				arr2D[row][column] = "("+row+", "+column+")";
			}
		}

		//print each row
		for(String[] row: arr2D){
			System.out.println(Arrays.toString(row));
		}
		i = 2;
		j = 3;
		in = new Scanner(System.in);
		startExploring();
	}

	private static void startExploring() {
		while(true){
			printPic(pic);
			System.out.println("You are in room "+arr2D[i][j]);
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w, a, s, or d.");
				input = in.nextLine();
			}
			interpretInput(input);
		}

	}

	private static void interpretInput(String input) {
		int iOrig = i;
		int jOrig = j;
		if(input.equals("w") && i > 0)i--;
		else if(input.equals("a") && j > 0)j--;
		else if(input.equals("s") && i+1 < arr2D.length)i--;
		else if(input.equals("d") && j+1 < arr2D[0].length)j--;
		
		if(iOrig == i && jOrig ==j){
			System.out.println("You are at the edge of the universe. "
					+ "You can move no farther in that direction.");
		}
		
	}

	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String[] keys = {"w", "a", "s", "d"};
		for(String key:keys){
			if(key.equals(lc)){
				return true;
			}
		}
		return false;
	}
	
	public static void printPic(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}

}
