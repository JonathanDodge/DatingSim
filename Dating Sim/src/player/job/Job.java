package player.job;

/**
 * Created by Duncan on 3/8/2017.
 */
public class Job
{
    protected int strength;
    protected int inteligence;
    protected int corruption;
    protected int cleverness;
    protected int sensibility;
    protected int speed;
    protected int range;
    protected int closeRange;
    protected int defence;
    protected int magic;
    protected int startingChips;
    protected int startingCentums;

    public Job(int strength, int inteligence, int corruption, int cleverness, int sensibility, int speed, int range, int closeRange, int defence, int magic, int startingChips, int startingCentums)
    {
        this.strength = strength;
        this.inteligence = inteligence;
        this.corruption = corruption;
        this.cleverness = cleverness;
        this.sensibility = sensibility;
        this.speed = speed;
        this.range = range;
        this.closeRange = closeRange;
        this.defence = defence;
        this.magic = magic;
        this.startingChips = startingChips;
        this.startingCentums = startingCentums;
    }
}
