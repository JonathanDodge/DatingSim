package engine;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class AudioManager 
{
	protected Sequencer sequencer;
	public AudioManager() throws Exception
	{
		sequencer = MidiSystem.getSequencer();
		sequencer.open();
		
	}
	public void Play(String filename)  throws Exception
	{
		InputStream is = new BufferedInputStream(new FileInputStream(new File(filename)));
		sequencer.setSequence(is);
		sequencer.start();
	}
	public void silence(){
		if(sequencer.isRunning()){
			sequencer.stop();
		}
	}
}	
