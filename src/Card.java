/**
 * @author Saahi Venkatraghavan
 */
public class Card {
    private String suit;
    private int value;
    private String cardName;

    // custom
public Card(String a, int b, String c) {
    suit = a;
    value = b;
    cardName = c;
}

    // default
    public Card() {
        value = 11;
        cardName = "ace";
    }

    @Override
    public String toString() {
        return cardName;
    }
}
