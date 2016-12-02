package caveExplorer;

public class EventRoom extends CaveExplorer {
	private Event event;
	private boolean eventOccured;

	public EventRoom(String description, Event event) {
		super(description);
		eventOccured=false;
		this.event=event;
	}
public void enter(){
	super.enter();
	if(!eventOccured){
		eventOccured = true;
		((Object) event).play();
	}
}
}
