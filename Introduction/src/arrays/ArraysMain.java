package arrays;
public class ArraysMain {

	public static void main(String[] args) {
		//This is how you time how quickly a computer processes information;
		long startTime = System.currentTimeMillis();
		String[] someStrings = new String[100];
		populateArray(someStrings);
		
		System.out.print("Before "+ someStrings[99]);
		changeString(someStrings[99]);
		System.out.print("After "+ someStrings[99]);
		
		
		System.out.print("Before "+ someStrings[99]);
		changeArray(someStrings);
		System.out.print("After "+ someStrings[99]);
		
		
		System.out.print("Before "+ someStrings[99]);
		changeArrayElement(someStrings,99);
		System.out.print("After "+ someStrings[99]);
	}
	
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item "+ (i+1);
		
	}

	private static void changeArray(String[] someStrings){
		someStrings = new String[110];
		for (int i = 0; i < someStrings.length;i++){
			someStrings[i] = "New Item " + (i+1);
		}
	}

	private static void changeString(String s){
		s = "This string has been changed";
	}
	
	private static void printArray(String[] str) {
		for(String a: str){
			System.out.println(a);
		}
	}


	private static void populateArray(String[] str) {
		for (int index = 0; index < str.length; index++){
			str[index]="value" + (index+1);
		}
	}


	public static void arrayIntroMethod(){
		//construct 2 integer arrays
		//those two methods do the same thing
		//primitive type arrays fill with ZEROES: 0,0.0,false;
		int[] zeros1= {0,0,0};
		int[] zeros2 = new int[3];
		//example
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		// FIRST METHOD : FOR LOOP
		//	the index of the data is important to reference
		//	you need to customize how you iterate
		//		increase by 2, go backwards etc	
		for(int index = 0; index< booleans.length;index++){
			System.out.println(index+" )" + booleans[index]);
		}
		for(boolean b: booleans){
			System.out.println(""+b);
		}

		//these two constructors are different
		String[] strings1={"","",""};
		String[] strings2=new String[3];

		

		//SECOND METHOD : FOR EACH
		//always goes in order, does not keep track of index
		//easier to type
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}
}