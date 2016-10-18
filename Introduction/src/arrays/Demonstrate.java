package arrays;

public class Demonstrate {
	public static void main(String[] args) {
		//fifty();
		randomFifty();
	}


	
		private static void populateArray(String[] str) {
			for (int index = 0; index < str.length; index++){
				str[index]="Value " + (index+1);
				System.out.println(str[index]);
			}
		}
		private static void fifty(){
			String[]firstAr = new String[50];
			populateArray(firstAr);
		}
		
		private static void randomFifty(){
			int[]randArray = new int [50];
			for (int i = 0; i < randArray.length; i ++){
				randArray[i] = (int)(Math.random()*10+1);
				System.out.println(randArray[i]);
			}
		}
//		
//		private static void populateDieRollArray(int [] array){
//			
//		}
		
		private static void printResults(int[] arr){
			for(int i =0; i<arr.length;i++){
				System.out.println(x);
			}
		}
	}
