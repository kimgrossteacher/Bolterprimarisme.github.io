import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    // Constructor to initialize the deck with a standard set of cards
    public Deck() {
        this.cards = generateStandardDeck();
    }

    // Method to generate a standard deck of 52 cards
    private List<Card> generateStandardDeck() {
        List<Card> deck = new ArrayList<>();

        for (String suit : Card.SUITS) {
            for (String rank : Card.RANKS) {
                deck.add(new Card(suit, rank));
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public void shuffle() {
        // Implement your shuffle algorithm here
        // For simplicity, we'll just use Collections.shuffle
        java.util.Collections.shuffle(cards);
    }

    // Method to deal a card from the deck
    public Card dealCard() {
        if (cards.isEmpty()) {
            return null; // Deck is empty
        }
        return cards.remove(0);
    }

    // Example usage in a main method
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.shuffle();

        // Deal and print a few cards
        for (int i = 0; i < 5; i++) {
            Card dealtCard = myDeck.dealCard();
            if (dealtCard != null) {
                System.out.println("Dealt card: " + dealtCard);
            } else {
                System.out.println("Deck is empty!");
            }
        }
    }
}
