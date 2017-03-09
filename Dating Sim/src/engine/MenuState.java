package engine;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MenuState extends State{
	
	private UIManager uiManager;
	private AudioManager audioManager;
	private BufferedImage logo;
	private boolean audioLaunched = false;
	
	public MenuState(Handler handler){
		super(handler);
		uiManager = new UIManager(handler);
		
		try{
			audioManager = new AudioManager();
		}catch(Exception e){
			System.out.println("AudioManager launch Fail");
			System.out.println(e);
		}
		
		this.handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(240, 190, 128, 64,Assets.btn_Start, new ClickListener(){
			public void onClick(){
				handler.getMouseManager().setUIManager(null);
				handler.getGame().saveSelectionState.setActiveTrigger(true);
				audioManager.silence();
				State.setState(handler.getGame().saveSelectionState);
			}
			
		}));
		
		uiManager.addObject(new UIImageButton(240, 260, 128, 64,Assets.btn_Credits, new ClickListener(){
			public void onClick(){
				Runtime rt = Runtime.getRuntime();
				String file = "NOTE ON CREDITS.txt";
				try {
					rt.exec("notepad "+file);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}));
		
		uiManager.addObject(new UIImageButton(240, 330, 128, 64,Assets.btn_Quit, new ClickListener(){
			public void onClick(){
				handler.getMouseManager().setUIManager(null);
				audioManager.silence();
				System.exit(0);
			}
			
		}));
		
	}
	
	public void tick() {
		if(!audioLaunched){
			audioLaunched = true;
			try {
				//audioManager.Play("/Audio/Frontier.mid");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		uiManager.tick();
	}

	public void render(Graphics g) {
		g.drawImage(Assets.Logo, 170, 50, 258, 128, null);
		uiManager.render(g);
	}
	
}
