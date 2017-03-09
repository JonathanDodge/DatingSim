package player.race;

/**
 * Created by Duncan on 3/8/2017.
 */
public class Race
{
    protected int strength;
    protected int inteligence;
    protected int corruption;
    protected int cleverness;
    protected int sensibility;
    protected int speed;
    protected int range;
    protected int closeRange;
    protected int magic;


    public Race(int strength, int inteligence, int corruption, int cleverness, int sensibility, int speed, int range, int closeRange, int magic) {
        this.strength = strength;
        this.inteligence = inteligence;
        this.corruption = corruption;
        this.cleverness = cleverness;
        this.sensibility = sensibility;
        this.speed = speed;
        this.range = range;
        this.closeRange = closeRange;
        this.magic = magic;
    }
}