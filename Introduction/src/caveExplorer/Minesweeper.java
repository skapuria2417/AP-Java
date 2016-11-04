package caveExplorer;

public class Minesweeper {

	public static void main(String[] args) {
		boolean[][] mines = new boolean [6][6];
		createMines(mines,10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field, mines);
		//twoDArrayPractices.printPic(field);
		makeMap(5,3);
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length;row++){
			for(int col=0;col < field[0].length; col++){
				if(mines[row][col]){
					field[row][col]="X";
				}else{
					field[row][col] = countAdjacent(mines,row,col);
				}
			}
		}
		
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		int count = 0;
		
//		for(int row = r-1; row <= r+1;row++){
//			for(int col=c-1;col <= c+1; col++){
//				if (row!=r&&col != c){
//					if(row>=0 && r<mines.length && col >= 0 && col < mines[row].length){
//						if(Math.abs(row-r)+Math.abs(col-c)==1 && mines[row][col]){
//							count++;
//						}
//					}
//				}
//			}
//		
//		}
		//this method only checks elements in the [][]
		//so it is not necessary to verify they are valid
		for(int row = 0; row < mines.length; row++){
			for(int col = 0; col < mines[0].length;col++){
				count++;
			}
		}
		
		//this method is very specific
		
		//above
		count+=validAndTrue(mines,r-1,c);
		//below
		count+=validAndTrue(mines,r+1,c);
		//right
		count+=validAndTrue(mines,r,c+1);
		//left
		count+=validAndTrue(mines,r,c-1);
		return count+"";
	}

	private static int validAndTrue(boolean[][] mines, int i, int j) {
		if(i>=0 && i<mines.length && j>=0 && j<mines[i].length && mines[i][j]){
			return 1;
		}
		else return 0;
	}

	private static void createMines(boolean[][] mines,int numberOfMines) {
		while(numberOfMines>0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			
			if(!mines[row][col]){
				mines[row][col]=true;
				numberOfMines--;
			}
		}
		
	}
	
	public static void makeMap(int l,int w){
		String[][] map=new String [l][w];
		for(int q =0; q<w;q++){
		System.out.println("\n");
			for(int i = 0; i<map.length;i++){
			System.out.print("|");
				for(int j=0;j<map[i].length;j++){
				System.out.print("_");
				}
			}
		}
	}
}
