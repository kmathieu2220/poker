
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player 
{
    private Hand theHand;
    private String name;
    private String age;
    private boolean isMale;
    
    public Player(Hand handOne)
    {
        name = "Billy";
        age = "47";
        isMale = true;
        theHand = handOne;
    }
    
    public void printPlayerInfo()
    {
        System.out.println("Name: " + name + "\nAge: " + age + "\nIs it a man!?: " + isMale + "\nThis is your hand: ");
        theHand.printHand();
    }
}
