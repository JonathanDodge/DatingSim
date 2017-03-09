package engine;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class SaveState extends State{

	public SaveState(Handler handler){
		super(handler);
	}

	@Override
	public void tick(){
		int dontlookatthis = 0;
		while(dontlookatthis < 9000){
			dontlookatthis++;
		}
		SaveOne();
		//SaveTwo();
	}

	@Override
	public void render(Graphics g){
		Text.printString(g, "SAVING...", 250, 180);
	}
	
	public void SaveOne(){
		String FileName = "/saves/SaveOne.txt";
		PrintWriter saver = createTextWrite(FileName);
		saver.println("0.0.1");
		saver.close();
	}
	public void SaveTwo(){
		String FileName = "/saves/SaveTwo.txt";
		PrintWriter saver = createTextWrite(FileName);
		
	}
	
	public static PrintWriter  createTextWrite(String S)
	{
		PrintWriter TStream = null;
		try
		{
			TStream = new PrintWriter(new FileOutputStream(S));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file in createTextWrite");
		  	System.exit(0);
		}
		return TStream;
	 	}
}
