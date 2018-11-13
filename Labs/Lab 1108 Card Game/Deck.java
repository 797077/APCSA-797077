import java.util.ArrayList;
/**
 * Lab 1108
 *
 * @author (Grace Jau)
 * @version (1108)
 */
public class Deck{
    ArrayList<Card>cards = new ArrayList<Card>();
    String[] suits = {"Heart", "Diamond", "Spade", "Club"};
    /**
     * Constructor for objects of class CardRunner
     */
    public Deck(){
        for (int i = 0; i < 13; i++){
            for (int j = 0; j < 4; j++){
                cards.add(new Card(i + 1, suits[j]));
            }
        }
    }
    
    /**
     * traverses cards Array and prints each card
     */
    public void printDeck(){
        for (int i = 0; i < cards.size(); i++){
            cards.get(i).printCard();
            if ((i+1)%13==0){
                System.out.println();
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
    
    /**
     * returns a random card from the deck
     */
    public Card getCard(){
        return cards.get((int)(Math.random()*cards.size()));
    }
}