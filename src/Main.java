import java.util.Scanner;

/**
 * @author Saahi Venkatraghavan
 */
public class Main {
    public static int updateScore(int currentScore, Card drawnCard) {
        int cardValue = drawnCard.getValue();
        if (cardValue == 11 && currentScore + cardValue >= 21) {
            cardValue = 1;
        }
        return currentScore + cardValue;
    }

    public static int dealCard(Card[] deckCards, int currentScore) {
        int cardIndex = (int) (Math.random() * deckCards.length);
        String card = deckCards[cardIndex].toString();
        System.out.println("Your card: " + card);
        return updateScore(currentScore, deckCards[cardIndex]);
    }

    private static void determineWinner(int playerScore, int computerScore, int bet, int playerMoney) {
        System.out.println("Your final score: " + playerScore);
        System.out.println("Dealer's final score: " + computerScore);

        if (playerScore > 21 || (computerScore <= 21 && computerScore > playerScore)) {
            System.out.println("THE DEALER WINS!");
            playerMoney -= bet;
        } else if (playerScore == computerScore) {
            System.out.println("TIE GAME!");
        } else {
            System.out.println("YOU WIN!");
            playerMoney += bet;
        }

        System.out.println("Your current balance: $" + playerMoney);
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO BLACKJACK");

        Deck deck1 = new Deck();
        Card[] deckCards = deck1.getDeck();

        Scanner scanner = new Scanner(System.in);

        int playerMoney = 1000;
        int bet = 0;

        int computerScore = 0;
        int playerScore = 0;
        while (playerMoney > 0) {
            System.out.println("Current balance: $" + playerMoney);
            System.out.print("Place your bet (0 to quit): ");
            System.out.println();
            bet = scanner.nextInt();

            if (bet == 0) {
                System.out.println("GAME OVER");
                break;
            }

            if (bet > playerMoney) {
                System.out.println("You don't have enough money. Please place a lower bet.");
            }

            playerScore = 0;
            computerScore = 0;

            playerScore = dealCard(deckCards, playerScore);
            playerScore = dealCard(deckCards, playerScore);
            System.out.println("YOUR CURRENT SCORE: " + playerScore);

            System.out.println("-------------------------------------");


            computerScore = dealCard(deckCards, computerScore);
            System.out.println("THE DEALER'S SCORE: " + computerScore);


            System.out.println("-------------------------------------");
            System.out.print("Do you want to (1) HIT or (2) STAND? ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                playerScore = dealCard(deckCards, playerScore);

                if (playerScore > 21) {
                    System.out.println("BUSTED! YOUR SCORE WAS " + playerScore);
                    break;
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println();
                System.out.println("Invalid choice.");
            }
        }
        while (computerScore < 17) {
            computerScore += dealCard(deckCards, computerScore);
        }

        determineWinner(playerScore, computerScore, bet, playerMoney);
        if (playerMoney <= 0) {
            System.out.println("Game over. You're out of money.");
        }
    }

}