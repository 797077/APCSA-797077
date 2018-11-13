
/**
 * Lab 1108
 *
 * @author (Grace Jau)
 * @version (1108)
 */
public class Game{
    Deck deck;//declares and initializes hand and deck objects
    Hand hand;
    /**
     * Constructor for objects of class CardRunner
     */
    public Game(){
        deck = new Deck();
        hand = new Hand(deck);
    }
}