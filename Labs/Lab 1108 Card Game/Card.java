
/**
 * Lab 1108
 *
 * @author (Grace Jau)
 * @version (1108)
 */
public class Card{
    int rank;
    String suit;
    /**
     * Constructor for objects of class CardRunner
     */
    public Card(int r, String s){
        rank = r;
        suit = s;
    }
    
    /**
     * 
     */
    public void printCard(){
        System.out.print(rank+" of "+suit+"s, ");
    }
    
    /**
     * 
     */
    public int getRank(){
        return rank;
    }
    
    /**
     * 
     */
    public String getSuit(){
        return suit;
    }
}