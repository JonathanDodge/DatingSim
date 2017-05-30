package engine;

public class Handler {
	private Game game;
	private Story story;
	
	public Handler(Game game){
		this.game = game;
	}
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}

	public int getWidth(){
		return game.getWidth();
	}
	public int getHeight(){
		return game.getHeight();
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}
	
}
