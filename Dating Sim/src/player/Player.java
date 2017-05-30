package player;

import player.job.*;
import player.race.*;

/**
 * Created by Duncan on 3/8/2017.
 */
public class Player
{
    private String name;
    protected Race race;
    protected Job job;
    protected int currentChips;
    protected int currentCeptums;
    //Create array for story progression


    public String getName()
    {
        return this.name;
    }
    public Race getRace()
    {
        return this.race;
    }
    public Job getJob()
    {
        return this.job;
    }
    public int getCurrentChips()
    {
        return this.currentChips;
    }
    public int getCurrentCeptums()
    {
        return this.currentCeptums;
    }
}
