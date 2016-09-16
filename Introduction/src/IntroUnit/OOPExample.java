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
		Student jillian = new Student("Jillian");
		Student jordan = new Student("Jordan");
		Student jason = new Student("Jason");
		jillian.talk();
		jordan.talk();
		jason.talk();

	}

}
