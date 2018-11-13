
/**
 * Lab 1108 Card Game
 *
 * @author (Grace Jau)
 * @version (1108)
 */
public class CardRunner{
    public static void main(){
        Game game = new Game();//creates new game
        game.deck.printDeck();//runs print methods
        game.hand.printHand();
    }
}
