package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		System.out.println("Using a for loop....");
		for(int i=0;i<5;i++){
			System.out.println("Hello Everyone.");
		}
		System.out.println("\nUsing a recursion.");
		int numberOfTimes = 5;
		forLoop(numberOfTimes, new Action() {


			public void act() {
				System.out.println("Hello Everyone.");

			}
		});
	}

	private static void forLoop(int numberOfTimes, Action action) {
		if(numberOfTimes<2){
			action.act();
		}else{
			action.act();
			forLoop(numberOfTimes-1,action);
		}
	}
}

