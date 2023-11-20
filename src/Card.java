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
        cardName = "Ace";
    }

    // getters
    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getCardName() {
        return cardName;
    }

    // setters
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String toString() {
        return cardName + " of " + suit;
    }

    // card array
    private Card[] cards;
}
