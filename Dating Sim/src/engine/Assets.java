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
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/GUI/Sheet.png"));


		//STATIC



		//BUTTONS
		btn_Start = new BufferedImage[2];
		btn_Start[0] = sheet.crop(0, height*7, width*2, height);
		btn_Start[1] = sheet.crop(0, height*8, width*2, height);
		
		btn_Credits = new BufferedImage[2];
		btn_Credits[0] = sheet.crop(width*2, height*7, width*2, height);
		btn_Credits[1] = sheet.crop(width*2, height*8, width*2, height);
		
		btn_Quit = new BufferedImage[2];
		btn_Quit[0] = sheet.crop(0, height*9, width*2, height);
		btn_Quit[1] = sheet.crop(width*2, height*9, width*2, height);
		
		btn_Save = new BufferedImage[2];
		btn_Save[0] = sheet.crop(0, 0, width*2, height);
		btn_Save[1] = sheet.crop(width*2, 0, width*2, height);
		
		btn_Blank = new BufferedImage[2];
		btn_Blank[0] = sheet.crop(width*4, height*11, width*2, height);
		btn_Blank[1] = sheet.crop(width*6, height*11, width*2, height);

	}
	
	
}
