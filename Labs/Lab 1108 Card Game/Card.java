
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
     * prints the rank and suit of the card
     */
    public void printCard(){
        System.out.print(rank+" of "+suit+"s, ");
    }
    
    /**
     * returns card rank
     */
    public int getRank(){
        return rank;
    }
    
    /**
     * returns card suit
     */
    public String getSuit(){
        return suit;
    }
}