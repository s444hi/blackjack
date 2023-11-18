/**
 * @author Saahi Venkatraghavan
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("WELCOME TO BLACKJACK");
        Deck deck1 = new Deck();
        Card[] deckCards = deck1.getDeck();
        for (Card c : deckCards) {
            System.out.println(c.toString());
        }
    }
}