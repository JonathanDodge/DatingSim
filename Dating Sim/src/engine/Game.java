package engine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;


public class Game implements Runnable{
	
	public String title;
	private int width, height;
	public boolean running;
	
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	private KeyManager keyManager;
	private Handler handler;
	
	//States
	public State gameState;
	public State menuState;
	public State saveSelectionState;
	public State OpeningAnimation;
	public State devState;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	private void init(){
		handler = new Handler(this);

		devState = new DevState(handler);
		//gameState = new GameState(handler);
		menuState = new MenuState(handler);
		//saveSelectionState = new SaveSelectionState(handler);
		OpeningAnimation = new OpeningAnimationState(handler);
		State.setState(OpeningAnimation);
	}
	
	
	
	private void tick(){
		keyManager.tick();
		
		if(State.getState() != null){
			State.getState().tick();
		}
	}
	
	private void render(){

	}
	
	public void run(){
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime)/timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				//render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000){
				System.out.println(ticks);
				ticks = 0;
				timer = 0;
			}
			
		}
		
		stop();
	}
	
	public KeyManager getKeyManager(){
		return keyManager;
	}

	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Graphics getG() {
		return g;
	}

}