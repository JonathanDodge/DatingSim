package engine;

import java.util.ArrayList;

/**
 * Created by Jonathan on 2/17/2017.
 */
public class Story {

    protected ArrayList<Word> Text;
    protected int WordCount;
    protected Handler handler;

    public Story(String location, Handler handler){
        //Load in story using txtLoader class
        //connect handler
        //store loaded story in ArrayList Text

    }

    public void insertWord(String w){
        Word x = new Word(w);
        Text.add(x);
    }



    private class Word {
        private char[] word;
        public Word(String s){
            word = s.toCharArray();
            length = word.length;
        }
        private int length;
        public int getLength(){
            return length;
        }
        public void setWord(String s){
            word = s.toCharArray();
            length = word.length;
        }
        public String getWord(){
            return word.toString();
        }
    }
}

