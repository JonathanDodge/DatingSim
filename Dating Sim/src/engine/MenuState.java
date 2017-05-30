package engine;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MenuState extends State{

	private AudioManager audioManager;
	private BufferedImage logo;
	private boolean audioLaunched = false;
	
	public MenuState(Handler handler){
		super(handler);
		
		try{
			audioManager = new AudioManager();
		}catch(Exception e){
			System.out.println("AudioManager launch Fail");
			System.out.println(e);
		}

		
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
		System.out.println("~~ MAIN MENU ~~");
		System.out.println("1. START");
		System.out.println("2. CREDITS");
		System.out.println("4. OPTIONS");
		System.out.println("3. EXIT");
	}

	public void render(Graphics g) {
		g.drawImage(Assets.Logo, 170, 50, 258, 128, null);
	}
	
}
