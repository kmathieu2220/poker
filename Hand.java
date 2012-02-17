import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand
{
   private Deck deck;
   private double handScore;
   private int startOfRun;
   private ArrayList<PlayingCard> hand;
   
   public Hand(Deck theDeck)
   {
       deck = theDeck;
       hand = new ArrayList<PlayingCard>();
       hand.add(deck.draw());
       hand.add(deck.draw());
       hand.add(deck.draw());
       hand.add(deck.draw());
       hand.add(deck.draw());
       
       Collections.sort(hand);
   }
   
   public Hand(PlayingCard c1, PlayingCard c2, PlayingCard c3, PlayingCard c4, PlayingCard c5)
   {
       hand = new ArrayList<PlayingCard>();
       hand.add(c1);
       hand.add(c2);
       hand.add(c3);
       hand.add(c4);
       hand.add(c5);
       
       Collections.sort(hand);
   }  

   public void printHand()
   {    
        for(PlayingCard i : hand)
        {
            System.out.println(i.getValue() + " " + i.getSuit());
        }    
   }    
   
   public boolean hasAStraightFlush()
   {
       boolean straightFlush = false; 
       
       if(this.hasAFlush() && this.hasAStraight())
       {
           straightFlush = true;
           return straightFlush;
       }      
       
       return straightFlush;
   }
   
   public boolean hasTwoPair()
   {
       boolean twoPair = false;
       int numPairs = 0;
       
        for(int i = 0; i < 4; i++)
       {
           if(hand.get(i).compareTo(hand.get(i+1)) == 0)
           {
               numPairs += 1;
               if(numPairs == 2)
               {
                   startOfRun = i;
                   twoPair = true;
               }
           }        
       }
       
      
       
       return twoPair;
   }
   
   public boolean hasAFlush()
   {
       boolean flush = false;
       
       for(int i = 0; i < 4; i++)
       {
           if(hand.get(4).equals(hand.get(i)) == false)
           {
               flush = false;
               return flush;          
           }
           else
           {
               flush = true;
           }
       }
       
       
       
       return flush;
   }
   
   public boolean hasAStraight()
   {
       boolean straight = false;
       int numStraight = 0;
       
       for(int i = 0; i < 4; i++)
       {
           if(hand.get(i).compareTo(hand.get(i+1)) == -1)
           {
               numStraight++;
               if(numStraight == 4)
               {
                    straight = true;
                    return straight;
               }
           }
       }
       
       
       
       return straight;               
   }
   
   public boolean hasThreeOfAKind()
   {
       boolean three = false;
       int numAttempt = 0;
       
       for(int i = 0; i < 3; i++)
       {
           if(hand.get(i).compareTo(hand.get(i+1)) == 0 && hand.get(i+1).compareTo(hand.get(i+2)) == 0)
           {
               three = true;
               return three;
           }
           else
           {
               numAttempt++;
                if(numAttempt == 3)
               {
                    three = false;
                    return three;               
               }
           }
       }
       
      
       
       return three;
   }
   
   public boolean hasAFullHouse()
   {
       boolean full = false;
       
       if(this.hasThreeOfAKind())
       {
           for(int i = 0; i < 4; i++)
           {
               if(hand.get(i).compareTo(hand.get(i+1)) == 0)
               {
                   full = true; 
               }  
           }
       }
       
       
       
       return full;
   }
   
    public boolean hasFourOfAKind()
   {
       boolean four = false;
       int numAttempt = 0;
       
       for(int i = 0; i < 2; i++)
       {
           if(hand.get(i).compareTo(hand.get(i+1)) == 0 && hand.get(i+1).compareTo(hand.get(i+2)) == 0 && hand.get(i+2).compareTo(hand.get(i+3)) == 0)
           {
               four = true;
               return four;
           }
           else
           {
               numAttempt++;
                if(numAttempt == 2)
               {
                    four = false;
                    return four;               
               }
           }
       }
       
       return four;
   }
   
   public boolean hasAPair()
   {
       boolean pair = false;
       
        if(this.hasThreeOfAKind() || this.hasTwoPair())
        {
            return pair;
        }
        else
       {
           for(int i = 0; i < 4; i++)
           {
               if(hand.get(i).compareTo(hand.get(i+1)) == 0)
               {
                   pair = true;
               }      
           }
        } 
       
      
       return pair;
   }
   
   public double getHandScore()
   {
       if(hand.get(4).getValue() == 2)
       {
           handScore = .02;
       }
       if(hand.get(4).getValue() == 3)
       {
           handScore = .03;
       }
       if(hand.get(4).getValue() == 4)
       {
           handScore = .04;
       }
       if(hand.get(4).getValue() == 5)
       {
           handScore = .05;
       }
       if(hand.get(4).getValue() == 6)
       {
           handScore = .06;
       }
       if(hand.get(4).getValue() == 7)
       {
           handScore = .07;
       }
       if(hand.get(4).getValue() == 8)
       {
           handScore = .08;
       }
       if(hand.get(4).getValue() == 9)
       {
           handScore = .09;
       }
       if(hand.get(4).getValue() == 10)
       {
           handScore = .10;
       }
       if(hand.get(4).getValue() == 11)
       {
           handScore = .11;
       }
       if(hand.get(4).getValue() == 12)
       {
           handScore = .12;
       }
       if(hand.get(4).getValue() == 13)
       {
           handScore = .13;
       }
       if(hand.get(4).getValue() == 14)
       {
           handScore = .14;
       }
       if(hasAPair())
       {
           handScore = 1.00;
       }
       if(hasTwoPair())
       {
           handScore = 2.00;
       }
       if(hasThreeOfAKind())
       {
           handScore = 3.00;
       }
       if(hasAStraight())
       {
           handScore = 4.00;
       }
       if(hasAFlush())
       {
           handScore = 5.00;
       }
       if(hasAFullHouse())
       {
           handScore = 6.00;
       }
       if(hasFourOfAKind())
       {
           handScore = 7.00;
       }
       if(hasAStraightFlush())
       {
           handScore = 8.00;
       }
       return handScore;
   }
}
   
   
   

