import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private Deck deck;

    public Dealer() {
        this.deck = new Deck();
        this.deck.shuffle();
    }

    // Method to deal cards to a player
    public void dealCards(Player player, int numCards) {
        for (int i = 0; i < numCards; i++) {
            Card dealtCard = deck.dealCard();
            if (dealtCard != null) {
                player.receiveCard(dealtCard);
            } else {
                System.out.println("Deck is empty!");
            }
        }
    }

    // Example usage in a main method
    public static void main(String[] args) {
        Dealer dealer = new Dealer();

        // Create six players
        Player brothers1 = new Player("brother 1");
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
    }
}
