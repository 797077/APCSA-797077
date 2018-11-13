import java.util.ArrayList;
/**
 * Lab 1108
 *
 * @author (Grace Jau)
 * @version (1108)
 */
public class Hand{
    ArrayList<Card>hand = new ArrayList<Card>();
    
    /**
     * Constructor for objects of class CardRunner
     * checks if the card has already been added to the hand and continues to add cards until there are five cards in the hand
     */
    public Hand(Deck deck){
        hand.add(deck.getCard());
        for (int i = 0; hand.size() < 5; i++){
            Card c = deck.getCard();
            for (int j = 0; j < hand.size(); j++){
                if (c == hand.get(j)){
                    j = hand.size();
                }else if (j == hand.size()-1){
                    hand.add(c);
                }
            }
        }
    }
    
    /**
     * traverses the hand and prints each card
     */
    public void printHand(){
        for (int i = 0; i < hand.size(); i++){
            hand.get(i).printCard();
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
    
    /**
     * traverses the array and checks if all cards are of the same suit
     */
    public boolean sameSuit(){
        String suit = hand.get(0).getSuit();
        for (int i = 1; i < hand.size(); i++){
            if ((hand.get(i).getSuit()).equals(suit)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * traverses the array and returns true if there is exactly one pair
     */
    public int onePair(){
        int numOfPairs = 0;
        int rankOfPair = 0;
        for (int i = 0; i < hand.size(); i++){
            int rank = hand.get(i).getRank();
            for (int j = i + 1; j < hand.size(); j++){
                if (hand.get(j).getRank() == (rank)){
                    numOfPairs++;
                    rankOfPair = rank;
                }
            }
        }
        if (numOfPairs == 1){
            return rankOfPair;
        }else{
            return -1;
        }
    }
}