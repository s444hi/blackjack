/**
 * @author Saahi Venkatraghavan
 */
public class Deck {
    private Card[] cards;

    public Deck() {
        // empty const
    }

    // calls to create a deck
    public Card[] getDeck() {
        cards = new Card[52];
        createDeck();
        return cards;
    }

    // creates deck
    public void createDeck() {
        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] cardNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
                "King", "Ace"};

        int counter = 0;
        int value;
        String cardName;

        for (String suit : suits) {
            for (int i = 0; i < 13; i++) {
                if (i < 9) {
                    value = i + 2;
                } else {
                    value = 10;
                }
                cardName = cardNames[i];

                cards[counter] = new Card(suit, value, cardName);
                counter++;
            }
        }
    }
}
