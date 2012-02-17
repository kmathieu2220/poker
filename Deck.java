import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck
{
    private ArrayList<PlayingCard> deck;
    
    public Deck()
    {
        deck = new ArrayList<PlayingCard>();
        for(int i = 0; i < 15; i++)
        {
            if(deck.size()<14)
            {
                deck.add(new PlayingCard(i+2, "Hearts"));
            }
            if(deck.size() == 13)
            {
                i = 0;
            }
            if(deck.size()<26 && deck.size()>=13)
            {
                deck.add(new PlayingCard(i+2, "Diamonds"));
            }
            if(deck.size() == 26)
            {
                i = 0;
            }
            if(deck.size()<39 && deck.size()>=26)
            {
                deck.add(new PlayingCard(i+2, "Clubs"));
            }
            if(deck.size() == 39)
            {
                i = 0;
            }
            if(deck.size()<52 && deck.size()>=39)
            {
                deck.add(new PlayingCard(i+2, "Spades"));
            }
        }
    }
    
    public void getDeck()
    {
        for(PlayingCard i : deck)
        {
            System.out.println(i.getValue() + " " + i.getSuit());
        }
    }
    
    public void shuffle()
    {
        int totalShuffles = 0;
        for(int i = 0; i < 52; i++)
        {
            PlayingCard removedCard = deck.remove(i);
            deck.add((int)(Math.random()*52),removedCard);
            if(i == 51)
            {
                i=0;
                totalShuffles++;
                if(totalShuffles == 100)
                {
                    break;
                }
            }
        }
    }
    
     public PlayingCard draw()
    {
        PlayingCard drawnCard = deck.remove(0);
        return drawnCard;
    }
}
