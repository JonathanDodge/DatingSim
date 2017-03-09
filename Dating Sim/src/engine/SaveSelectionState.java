package engine;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SaveSelectionState extends State {
	
	private UIManager uiManager;

	public SaveSelectionState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		
		uiManager.addObject(new UIImageButton(172, 64, 256, 128,Assets.btn_Blank, new ClickListener(){
			public void onClick(){
				handler.getMouseManager().setUIManager(null);
				handler.getGame().gameState.setActiveTrigger(true);
				State.setState(handler.getGame().gameState);
			}
			
		}));
		
	}

	@Override
	public void tick() {
		if(ActiveTrigger){
			this.handler.getMouseManager().setUIManager(uiManager);
			ActiveTrigger = false;
		}
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {

		uiManager.render(g);
		
	}
	
}
