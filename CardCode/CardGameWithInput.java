import java.util.Scanner;

public class CardGameWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Create an array to store player names
        String[] playerNames = new String[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            playerNames[i] = scanner.nextLine();
        }

        // Create a dealer and shuffle the deck
        Dealer dealer = new Dealer();

        // Create players
        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player(playerNames[i]);
        }

        // Deal cards to each player
        for (Player player : players) {
            dealer.dealCards(player, 5);
        }

        // Print the cards in each player's hand
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand: " + player.getHand());
        }

        // Determine the winner based on the total value of cards in hand
        Player winner = determineWinner(players);

        // Print the winner
        System.out.println("The winner is: " + winner.getName());

        // Close the scanner
        scanner.close();
    }

    private static Player determineWinner(Player... players) {
        Player winner = players[0];
        int maxTotalValue = calculateTotalValue(players[0]);

        for (int i = 1; i < players.length; i++) {
            int totalValue = calculateTotalValue(players[i]);
            if (totalValue > maxTotalValue) {
                maxTotalValue = totalValue;
                winner = players[i];
            }
        }

        return winner;
    }

    private static int calculateTotalValue(Player player) {
        int totalValue = 0;
        for (Card card : player.getHand()) {
            totalValue += card.getValue();
        }
        return totalValue;
    }
}
