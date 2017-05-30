package engine;
/**
 * Created by dodge on 5/20/2017.
 */
import java.util.Scanner;

public class PlayerInput {
    protected Scanner scan;
    protected Handler handler;
    public PlayerInput (Handler handler){
        this.handler = handler;
        scan = new Scanner(System.in);
    }
    public int getPlayerChoice(){
        System.out.print("Input Your Choice:");
        int choice = 0;
        boolean GetIn = true;
        while(GetIn){
            String inputTry = scan.next();
            try{
                choice = (Integer.parseInt(inputTry));
            }catch(Exception e){
                e.printStackTrace();
            }
            if(choice > 0){
                GetIn = false;
            }
        }
        return choice;
    }

}
