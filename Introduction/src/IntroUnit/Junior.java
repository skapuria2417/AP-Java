package IntroUnit;

public class Junior extends Student {
	private String majors;

	public Junior(String name, String majors) {
		super(name);
		this.majors = majors;
	}
	
	public void talk(){
		super.talk();
		System.out.println(".. and I am a junior" + ".");
		System.out.println("I am in the " + majors + ".");
	}

}
