import java.util.LinkedList;
import java.util.Collections;

public class Deck {
    private LinkedList<Card> deck;

    public Deck() {
        deck = new LinkedList<>();

        // Add cards to the deck
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                deck.add(new Card(suit, ranks[i], values[i], ranks[i] + suit.charAt(0) + ".gif"));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck); // Shuffle the linked list
    }

    public Card dealCard() {
        return deck.isEmpty() ? null : deck.removeFirst(); // Deal one card from the top
    }

    public void displayDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public int remainingCards() {
        return deck.size();
    }

}
