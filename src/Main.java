/**
 * @author Saahi Venkatraghavan
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO BLACKJACK");
        int[] cards = new int[52];
        int cardsInp = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= 10; j++) {
                    cards[cardsInp] = j;
                    cardsInp++;
                }
            }

        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 0) {
                cards[i] = 10;
            }

            if (cards[i] == 1) {
                cards[i] = 11;
            }
        }

            for (int i = 0; i < cards.length; i++) {
                System.out.print(cards[i] + " ");
            }


    }
}