package TestingPackage;

public class SortingAlgorithms {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		isPrimeB(5000);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime+" ms (B).");
		
//		long startTime2 = System.currentTimeMillis();
//		isPrimeC(5000);
//		long endTime2   = System.currentTimeMillis();
//		long totalTime2 = endTime2 - startTime2;
//		System.out.println(totalTime2+" ms (C).");
	}
	public static boolean isPrimeB(int n){
		boolean prime = true;
		for(int i = 2; i<n; i++){
			if(n%i==0) prime = false;   
		}
		return prime;
	}

	public static boolean isPrimeC(int n){
		boolean prime = true;
		for(int i = 2; i<Math.sqrt(n); i++){
			if(n%i==0) prime = false;   
		}
		return prime;
	}
}
