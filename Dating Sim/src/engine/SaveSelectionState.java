package engine;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SaveSelectionState extends State {

	public SaveSelectionState(Handler handler) {
		super(handler);
		
	}

	@Override
	public void tick() {
		if(ActiveTrigger){
			ActiveTrigger = false;
		}
	}

	@Override
	public void render(Graphics g) {

	}
	
}
