/**
 * 
 */
package IntroUnit;

/**
 * @author Student6
 *This class is designed to contrast with the ProceduralExample. It embodies 
 *an Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// construct a student
		Student jillian = new Senior("Jillian", "Programmer");
		Student jordan = new Junior("Jordan", "Software Major");
		Student jason = new Student("Jason");
		jillian.talk();
		//jillian.name = "BoogerNose";
		//jillian.talk();
		
		jordan.talk();
		jason.talk();

	}

}
