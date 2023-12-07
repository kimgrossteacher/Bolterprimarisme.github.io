public class CardGame {
    public static void main(String[] args) {
        // Create a dealer and shuffle the deck
        Dealer dealer = new Dealer();

        // Create six players
        Player brothers1 = new Player("3 Brothers");
        Player myself = new Player("Myself");
        Player dad = new Player("Dad");
        Player mom = new Player("Mom");

        // Deal 5 cards to each player
        dealer.dealCards(brothers1, 5);
        dealer.dealCards(myself, 5);
        dealer.dealCards(dad, 5);
        dealer.dealCards(mom, 5);

        // Print the cards in each player's hand
        System.out.println(brothers1.getName() + "'s hand: " + brothers1.getHand());
        System.out.println(myself.getName() + "'s hand: " + myself.getHand());
        System.out.println(dad.getName() + "'s hand: " + dad.getHand());
        System.out.println(mom.getName() + "'s hand: " + mom.getHand());

        // Determine the winner based on the total value of cards in hand
        Player winner = determineWinner(brothers1, myself, dad, mom);

        // Print the winner
        System.out.println("The winner is: " + winner.getName());
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
