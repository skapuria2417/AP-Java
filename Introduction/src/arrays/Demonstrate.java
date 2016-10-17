package arrays;

public class Demonstrate {
	public static void main(String[] args) {
		fifty();
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
			
		}
	}
