package engine;
import java.awt.Graphics;

public abstract class State {
	
	
	private static State CurrentState = null;
	public boolean ActiveTrigger = false;
	
	public static void setState(State state){
		CurrentState = state;
	}
	public static State getState(){
		return CurrentState;
	}
	
	//CLASS
	protected Handler handler;
	public State(Handler handler){
		this.handler = handler;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public void setActiveTrigger(boolean b) {
		ActiveTrigger = b;
		
	}
	protected byte VarIndex;
	public byte getVarIndex() {
		return VarIndex;
	}
	
	
}
