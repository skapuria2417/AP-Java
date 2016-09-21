
import java.util.Random;
public class MathRandom {

	public static void main(String[] args) {
		int[] results = new int[6];
		//same as
		//int[] = [0,0,0,0,0,0]
		int  totalRolls = 10000;

		for (int index = 0; index < 10000; index ++){
			int roll = rollUnfairDie();
			System.out.println("Roll #"+ (index+1) + " Die is " +roll );
			results[roll-1]++;
		}
		for(int i = 0; i < 6; i ++){
			System.out.println((i+1)+" was rolled "+ results[i] + " times"+ ". And the percentage is " +(double) (((double)results[i]/totalRolls *1000)/10.0) + "%."  );
		}
	}
	public static int rollFairDie(){
		//		Random gen = new Random();
		//		return gen.nextInt(6)+1;

		double rand = Math.random();//creates random double (0,1)
		int roll = (int) (6 * rand);//[0,5](this is what above code does)
		return roll+1;
	}
	public static int rollUnfairDie(){
		int[] myList = {6,6,6,6,6,6,6,6,6,6,6,2,2,4,4,3,3,5,5,5,5,1,2};
		int rnd = new Random().nextInt(myList.length);
		return myList[rnd];
	}
}
