package engine;
import java.awt.Graphics;


public class PauseState extends State{
	
	private UIManager uiManager;
	private long InputDelay;
	
	private UIImageButton quitButton = new UIImageButton(240, 200, 128, 64,Assets.btn_Quit, new ClickListener(){
		public void onClick(){
			handler.getMouseManager().setUIManager(null);
			System.exit(0);
		}
	});
	
	private UIImageButton ResumeButton = new UIImageButton(240, 130, 128, 64,Assets.btn_Save, new ClickListener(){
		public void onClick(){
			handler.getMouseManager().setUIManager(null);
			State.setState(handler.getGame().gameState);
		}
	});
	
	

	public PauseState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		uiManager.addObject(quitButton);
		uiManager.addObject(ResumeButton);
	}

	@Override
	public void tick() {
		if(ActiveTrigger){
			this.handler.getMouseManager().setUIManager(uiManager);
			ActiveTrigger = false;
			InputDelay = System.currentTimeMillis();
		}
		if(handler.getKeyManager().Esc && InputDelay+100 < System.currentTimeMillis()){
			handler.getMouseManager().setUIManager(null);
			State.setState(handler.getGame().gameState);
		}
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		handler.getGame().gameState.render(g);
		//g.drawImage(Assets.pauseMenu, 0, 0, null);
		uiManager.render(g);
		
	}
	
	
	
}
