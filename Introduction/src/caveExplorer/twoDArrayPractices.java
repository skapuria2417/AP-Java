package caveExplorer;

import java.util.Random;

public class twoDArrayPractices {

	public static void main(String[] args) {
		
			
		
	}
	public static void printPic(String[][] pic){
		String[][] pic1 = new String [10][8];
		for(int row = 0; row < pic1.length;row++){
			for(int col = 0; col < pic1[row].length;col++){
				pic1[row][col]=" ";
			}
			
		}
		
		pic1[1][2]="O";
		pic1[0][2]="|";
		pic1[2][2]="|";
		pic1[1][1]="-";
		pic1[1][3]="-";
		pic1[0][1]="\\";
		pic1[2][3]="\\";
		pic1[0][3]="/";
		pic1[2][1]="/";
		
		//pic[1][7]="/";
		
		for(int row = 7; row <pic1.length;row++){
			for(int col = 0; col < pic1[row].length;col++){
				pic1[row][col]="M";
			}
			
			for(int col = 0; col<pic1[0].length;col++){
				pic1[0][col] = "_";
				pic1[pic1.length-1][col]="_";
			}
			
			
			
		for(int row1 = 0; row1 < pic1.length;row1++){
			for(int col = 0; col < pic1[row1].length;col++){
				System.out.print(pic1[row1][col]);
			}
			System.out.println();
		}
	}
	
}
	}