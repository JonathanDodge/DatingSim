package engine;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	
	private boolean[] keys;
	public boolean up, down, left, right;
	public boolean aUp, aDown, aLeft, aRight;
	public boolean EventKey;
	public boolean Esc;
	public boolean Space;
	public boolean Invkey;
	
	public KeyManager(){
		keys = new boolean[256];
		
	}
	
	public void tick(){
		EventKey = keys[KeyEvent.VK_E];
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		
		aUp = keys[KeyEvent.VK_UP];
		aDown = keys[KeyEvent.VK_DOWN];
		aLeft = keys[KeyEvent.VK_LEFT];
		aRight= keys[KeyEvent.VK_RIGHT];
		
		Esc = keys[KeyEvent.VK_ESCAPE];
		Space = keys[KeyEvent.VK_SPACE];
		Invkey = keys[KeyEvent.VK_I];
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	
}
