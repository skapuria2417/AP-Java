package arrays;

public class TwoDPrintArray {
	private static boolean arr[][];

	public static void main(String[] args) {
		arr = new boolean[5][5];
		print2DArray(arr);
		buttonClick(3,3);

	}
	
	public static void switchRow(boolean[] row, int x){
		
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c){
		if(r>0 && r<arr.length){
			switchRow(arr[r],c);
		
		}
		switchColumn(arr,r,c);
		boolean win = true;
		for(int i= 0; i <arr.length;i++){
			for(int j=0; j< arr[i].length;j++){
				if(arr[i][j]){
					win=false;
					break;
				}
			}
		}
		if(win){
			System.out.println("You solved the puzzle.");
		}
	}
	
	private static void buttonClick(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public static void print2DArray(boolean arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]=true){
					System.out.println("O");
				}else{
					System.out.println("X");
				}
			}
		}
	}

}
