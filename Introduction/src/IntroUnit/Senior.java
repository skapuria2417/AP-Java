package IntroUnit;

public class Senior extends Student {
	
	private String internship;
	
	public Senior(String name, String internship){
			super(name);
			this.internship = internship;
	}
	
	public void talk(){
		super.talk();
		System.out.println( ".... and I am a senior.");
		System.out.println("I intern as a " + internship);
	}
}
