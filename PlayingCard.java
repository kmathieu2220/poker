
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayingCard implements Comparable<PlayingCard>
{
    private int value;
    private String suit;
    
    public PlayingCard(int n, String type)
    {
          value = n;
          suit = type;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public int compareTo(PlayingCard other)
    {
        return this.getValue()-other.getValue();
    }
    
    public boolean equals(PlayingCard other)
    {
        return(this.getSuit().equals(other.getSuit()));
    }
}