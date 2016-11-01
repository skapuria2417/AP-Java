package arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = {2,3,4,6,9,11,12,15};
		checkHalfway(arr,12,0, arr.length-1);
		swap(arr,0,arr.length-1);
		shuffle(arr);
		
		
		if(checkHalfway(arr,12,0,arr.length-1)){
			System.out.println("The number you are saerching for is less than the value in the middle of the array");
		}
		else{
			System.out.println("The number you are saerching for is greater than or equal to the value in the middle of the array");
		}
	}

	private static void shuffle(int[] arr) {
		for(int i =0; i < arr.length; i++){
			int random = (int)(Math.random()*6);
			swap(arr,i,random);
		}
		
	}
	
	private static void print(int[] arr) {
		for(int i =0; i < arr.length-1; i++){
			System.out.println(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}
	
	private static int countUnderBound(double[] arr , double d ){
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<d){
				count++;
			}
		}
		return count;
		
		
	}
	
	
	
	
	public static int[] getSubArray(int [] arr )
	
	
	
	
	
	
	
	
	public static boolean contains(int[] arr, int [] subArrays){
		for(int i =0; i < arr.length;i++){
			if(arr[i] == subArrays .length[0]){
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static void swap(int[] arr, int i,int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
		
	}

	/**
	 * returns true if searchValue is less than element
	 * halfway between beginning and end
	 * @param arr the int[] to be searched
	 * @param i
	 * @param j
	 * @param length
	 */
	public static void cycleThrough(int[] array){
		// [1 2 3 4 5 0]
	}
	
	
	
	
	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		return searchValue < arr[(begin+end+1/2)];
		                               
		
	}

}
