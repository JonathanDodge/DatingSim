package engine;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Text {
	public static SpriteSheet Font = new SpriteSheet(ImageLoader.loadImage("/textures/Font_15x15.png"));
	
	private static BufferedImage[] Letters;
	private static BufferedImage[] Numbers;
	private static BufferedImage[] Symbols;
	
	public static void SetText(){
		int wid = 15, hght = 15;
		//LETTERS
		Letters = new BufferedImage[26];
		Letters[0] = Font.crop(0, 0, 15, 15);
		Letters[1] = Font.crop(wid, 0, 15, 15);
		Letters[2] = Font.crop(wid*2, 0, 15, 15);
		Letters[3] = Font.crop(wid*3, 0, 15, 15);
		Letters[4] = Font.crop(wid*4, 0, 15, 15);
		Letters[5] = Font.crop(0, hght, 15, 15);
		Letters[6] = Font.crop(wid, hght, 15, 15);
		Letters[7] = Font.crop(wid*2, hght, 15, 15);
		Letters[8] = Font.crop(wid*3, hght, 15, 15);
		Letters[9] = Font.crop(wid*4, hght, 15, 15);
		Letters[10] = Font.crop(0, hght*2, 15, 15);
		Letters[11] = Font.crop(wid, hght*2, 15, 15);
		Letters[12] = Font.crop(wid*2, hght*2, 15, 15);
		Letters[13] = Font.crop(wid*3, hght*2, 15, 15);
		Letters[14] = Font.crop(wid*4, hght*2, 15, 15);
		Letters[15] = Font.crop(0, hght*3, 15, 15);
		Letters[16] = Font.crop(wid, hght*3, 15, 15);
		Letters[17] = Font.crop(wid*2, hght*3, 15, 15);
		Letters[18] = Font.crop(wid*3, hght*3, 15, 15);
		Letters[19] = Font.crop(wid*4, hght*3, 15, 15);
		Letters[20] = Font.crop(0, hght*4, 15, 15);
		Letters[21] = Font.crop(wid, hght*4, 15, 15);
		Letters[22] = Font.crop(wid*2, hght*4, 15, 15);
		Letters[23] = Font.crop(wid*3, hght*4, 15, 15);
		Letters[24] = Font.crop(wid*4, hght*4, 15, 15);
		Letters[25] = Font.crop(0, hght*5, 15, 15);
		
		
		//NUMBERS
		Numbers = new BufferedImage[10];
		Numbers[0] = Font.crop(0, hght*7, 15, 15);
		Numbers[1] = Font.crop(wid, hght*5, 15, 15);
		Numbers[2] = Font.crop(wid*2, hght*5, 15, 15);
		Numbers[3] = Font.crop(wid*3, hght*5, 15, 15);
		Numbers[4] = Font.crop(wid*4, hght*5, 15, 15);
		Numbers[5] = Font.crop(0, hght*6, 15, 15);
		Numbers[6] = Font.crop(wid, hght*6, 15, 15);
		Numbers[7] = Font.crop(wid*2, hght*6, 15, 15);
		Numbers[8] = Font.crop(wid*3, hght*6, 15, 15);
		Numbers[9] = Font.crop(wid*4, hght*6, 15, 15);
		
		//SYMBOLS
		Symbols = new BufferedImage[21];
		Symbols[0] = Font.crop(wid, hght*7, 15, 15);
		Symbols[1] = Font.crop(wid*2, hght*7, 15, 15);
		Symbols[2] = Font.crop(wid*3, hght*7, 15, 15);
		Symbols[3] = Font.crop(wid*4, hght*7, 15, 15);
		Symbols[4] = Font.crop(0, hght*8, 15, 15);
		Symbols[5] = Font.crop(wid, hght*8, 15, 15);
		Symbols[6] = Font.crop(wid*2, hght*8, 15, 15);
		Symbols[7] = Font.crop(wid*3, hght*8, 15, 15);
		Symbols[8] = Font.crop(wid*4, hght*8, 15, 15);
		Symbols[9] = Font.crop(0, hght*9, 15, 15);
		Symbols[10] = Font.crop(wid, hght*9, 15, 15);
		Symbols[11] = Font.crop(wid*2, hght*9, 15, 15);
		Symbols[12] = Font.crop(wid*3, hght*9, 15, 15);
		Symbols[13] = Font.crop(wid*4, hght*9, 15, 15);
		Symbols[14] = Font.crop(0, hght*10, 15, 15);
		Symbols[15] = Font.crop(wid, hght*10, 15, 15);
		Symbols[16] = Font.crop(wid*2, hght*10, 15, 15);
		Symbols[17] = Font.crop(wid*3, hght*10, 15, 15);
		Symbols[18] = Font.crop(wid*4, hght*10, 15, 15);
		Symbols[19] = Font.crop(0, hght*11, 15, 15);
		Symbols[20] = Font.crop(wid, hght*11, 15, 15);
	}
	
	public static void printString(Graphics g, String CharSet, int x, int y){
		int TextSpacing = 15, SpaceMod = 1;
		for(int c = 0; c < CharSet.length(); c++){
			char z = CharSet.charAt(c);
			switch(z){
			case (' '):
				SpaceMod++;
				break;
			case ('A'):
			case ('a'):
				g.drawImage(Letters[0], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('B'):
			case ('b'):
				g.drawImage(Letters[1], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('C'):
			case ('c'):
				g.drawImage(Letters[2], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('D'):
			case ('d'):
				g.drawImage(Letters[3], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('E'):
			case ('e'):
				g.drawImage(Letters[4], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('F'):
			case ('f'):
				g.drawImage(Letters[5], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('G'):
			case ('g'):
				g.drawImage(Letters[6], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('H'):
			case ('h'):
				g.drawImage(Letters[7], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('I'):
			case ('i'):
				g.drawImage(Letters[8], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('J'):
			case ('j'):
				g.drawImage(Letters[9], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('K'):
			case ('k'):
				g.drawImage(Letters[10], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('L'):
			case ('l'):
				g.drawImage(Letters[11], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('M'):
			case ('m'):
				g.drawImage(Letters[12], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('N'):
			case ('n'):
				g.drawImage(Letters[13], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('O'):
			case ('o'):
				g.drawImage(Letters[14], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('P'):
			case ('p'):
				g.drawImage(Letters[15], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('Q'):
			case ('q'):
				g.drawImage(Letters[16], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('R'):
			case ('r'):
				g.drawImage(Letters[17], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('S'):
			case ('s'):
				g.drawImage(Letters[18], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('T'):
			case ('t'):
				g.drawImage(Letters[19], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('U'):
			case ('u'):
				g.drawImage(Letters[20], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('V'):
			case ('v'):
				g.drawImage(Letters[21], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('W'):
			case ('w'):
				g.drawImage(Letters[22], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('X'):
			case ('x'):
				g.drawImage(Letters[23], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('Y'):
			case ('y'):
				g.drawImage(Letters[24], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('Z'):
			case ('z'):
				g.drawImage(Letters[25], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('0'):
				g.drawImage(Numbers[0], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('1'):
				g.drawImage(Numbers[1], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('2'):
				g.drawImage(Numbers[2], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('3'):
				g.drawImage(Numbers[3], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('4'):
				g.drawImage(Numbers[4], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('5'):
				g.drawImage(Numbers[5], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('6'):
				g.drawImage(Numbers[6], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('7'):
				g.drawImage(Numbers[7], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('8'):
				g.drawImage(Numbers[8], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('9'):
				g.drawImage(Numbers[9], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('!'):
				g.drawImage(Symbols[0], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('@'):
				g.drawImage(Symbols[1], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('#'):
				g.drawImage(Symbols[2], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('$'):
				g.drawImage(Symbols[3], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('%'):
				g.drawImage(Symbols[4], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('^'):
				g.drawImage(Symbols[5], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('&'):
				g.drawImage(Symbols[6], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('('):
				g.drawImage(Symbols[7], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case (')'):
				g.drawImage(Symbols[8], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case (','):
				g.drawImage(Symbols[9], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('.'):
				g.drawImage(Symbols[10], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('/'):
				g.drawImage(Symbols[12], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('-'):
				g.drawImage(Symbols[13], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('_'):
				g.drawImage(Symbols[14], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('+'):
				g.drawImage(Symbols[15], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('='):
				g.drawImage(Symbols[16], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('~'):
				g.drawImage(Symbols[17], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case ('`'):
				g.drawImage(Symbols[18], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case (':'):
				g.drawImage(Symbols[19], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			case (';'):
				g.drawImage(Symbols[20], x+(TextSpacing*SpaceMod), y, null);
				SpaceMod++;
				break;
			default:
				g.drawImage(Symbols[11], x+(TextSpacing*SpaceMod), y, null);
				break;
			
			}
		}
	}
	
}
