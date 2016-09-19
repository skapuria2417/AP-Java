package IntroUnit;

public class Student {
	//fields
	private String name;
	
	//constructor 
	public Student(String name){
		// initialize fields
		this.name = name;
	}
	
	public void talk(){
		System.out.println("Hi my name is " + name + ".");
	}
}
