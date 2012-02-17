
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
   public static void main (String[]args)
   {
       Deck d1 = new Deck();
       d1.shuffle();  
       
       Hand h1 = new Hand(d1);
       Hand h2 = new Hand(d1);
       
       Player p1 = new Player(h1);
       Player p2 = new Player(h2);
       
       p1.printPlayerInfo();
       System.out.println("Hand-score of: " + h1.getHandScore());
       System.out.println("Player one has a pair: " + h1.hasAPair());
       System.out.println("Player one has two pairs: " + h1.hasTwoPair());
       System.out.println("Player one has a flush: " + h1.hasAFlush());
       System.out.println("Player one has a straight: " + h1.hasAStraight());
       System.out.println("Player one has three-of-a-kind: " + h1.hasThreeOfAKind());
       System.out.println("Player one has four-of-a-kind: " + h1.hasFourOfAKind());
       System.out.println("Player one has a straight flush: " + h1.hasAStraightFlush());
       System.out.println("Player one has full house: " + h1.hasAFullHouse());
       
       System.out.println("\n---------------------------------------\n");
       
       p2.printPlayerInfo(); 
       System.out.println("Hand-score of: " + h2.getHandScore());
       System.out.println("Player two has a pair: " + h2.hasAPair());   
       System.out.println("Player two has two pairs: " + h2.hasTwoPair());  
       System.out.println("Player two has a flush: " + h2.hasAFlush());   
       System.out.println("Player two has a straight: " + h2.hasAStraight());   
       System.out.println("Player two has three-of-a-kind: " + h2.hasThreeOfAKind()); 
       System.out.println("Player two has four-of-a-kind: " + h2.hasFourOfAKind());
       System.out.println("Player two has a straight flush: " + h2.hasAStraightFlush());
       System.out.println("Player two has full house: " + h2.hasAFullHouse());
       
       PlayingCard spade2 = new PlayingCard(2,"spade");
       PlayingCard diamond2 = new PlayingCard(2,"diamond");
       PlayingCard heart3 = new PlayingCard(3,"heart");
       PlayingCard diamond3 = new PlayingCard(3,"diamamond");
       PlayingCard spade10 = new PlayingCard(10,"spade");
       PlayingCard club10 = new PlayingCard(10,"club"); 
       PlayingCard heart11 = new PlayingCard(11,"heart");
       PlayingCard diamond11 = new PlayingCard(11,"diamond");
       PlayingCard heart2 = new PlayingCard(2,"heart");
       PlayingCard club2 = new PlayingCard(2,"club");
       
       Hand three = new Hand(spade2,heart2,diamond2,spade10,heart11);
       Hand twop = new Hand(spade2,heart2,heart3,diamond3,heart11);
       Hand four = new Hand(spade2,heart2,diamond2,club2,heart11);
       Hand pair4 = new Hand(spade2,heart2,diamond2,heart11,diamond11);
             
       System.out.println("\n---------------------------------------\n");
       
       System.out.println("Player two has three-of-a-kind: " + three.hasThreeOfAKind());
       System.out.println("Player two has a pair: " + three.hasAPair()); 
       System.out.println("\n---------------------------------------\n");
       System.out.println("Player two has two pairs: " + twop.hasTwoPair()); 
       System.out.println("Player two has a pair: " + twop.hasAPair()); 
       System.out.println("\n---------------------------------------\n");
       System.out.println("Player two has four-of-a-kind: " + four.hasFourOfAKind());
       System.out.println("Player two has a pair: " + four.hasAPair()); 
       System.out.println("\n---------------------------------------\n");
       // System.out.println("Player two has full house: " + pair4.hasAFullHouse());
       

   }
}
