package engine;
import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32; //THESE NEED TO BE CHANGED

	//OTHER
	public static BufferedImage Logo;
	
	//Buttons
	public static BufferedImage[] btn_Start;
	public static BufferedImage[] btn_Credits;
	public static BufferedImage[] btn_Quit;
	public static BufferedImage[] btn_Save;
	public static BufferedImage[] btn_Blank;

	public static void init(){
		//SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/GUI/Sheet.png"));
	}
	
	
}
