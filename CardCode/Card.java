   public class Card {
    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final int NUM_JOKERS = 2;

    private String suit;
    private String rank;
    private int value;  // Add a field for the card value

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.value = calculateCardValue();
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    private int calculateCardValue() {
        // Assign specific values for Ace, Jack, King, Queen
        if ("Ace".equals(rank)) {
            return 11;  // For example, ACE has a value of 11
        } else if ("King".equals(rank) || "Queen".equals(rank) || "Jack".equals(rank)) {
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }

    public static void main(String[] args) {
        // Create a deck with all cards including two Jokers
        Card[][] deck = new Card[SUITS.length][RANKS.length * (RANKS.length - 1) + NUM_JOKERS];

        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length - 1; j++) {
                deck[i][j] = new Card(SUITS[i], RANKS[j]);
            }
        }

        // Add two Jokers to the deck
        for (int k = 0; k < NUM_JOKERS; k++) {
            deck[SUITS.length - 1][RANKS.length * (RANKS.length - 1) + k] = new Card("Joker", "Joker");
        }

        // Print the deck
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length * (RANKS.length - 1) + NUM_JOKERS; j++) {
                System.out.println(deck[i][j]);
            }
        }
    }
}
