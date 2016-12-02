package caveExplorer;

public class GameStartEvent implements Event {

	public static final String[] SEQ1={"A spiky haired guy with orange pants.........."};
	public static final String[] Seq2={"kaaaa maaaaay haaa maaayyy haaaaa!!!!!"};
	
	
	
	
	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}
	
	public void play(){
		readSequence(SEQ1);
		CaveExplorer.print("Will you help us?");
		while(CaveExplorer.in.nextLine().indexOf("yes")<0){
			
		}
	}

	private void readSequence(String[] seq1) {
	for(String s: seq){
		CaveExplorer.print(s);
	}
		
	}

}
