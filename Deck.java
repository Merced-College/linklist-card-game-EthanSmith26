import java.util.Random;

public class Deck {
    public static void main(String[] args) {
        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        LinkList cardDeck = new LinkList();

        // Create cards and add to the deck
        for (String suit : SUITS) {
            for (int i = 0; i < RANKS.length; i++) {
                int value = (i < 9) ? i + 2 : 10; // Assign card values (Ace can be handled differently if needed)
                cardDeck.add(new Card(suit, RANKS[i], value, ""));
            }
        }

        // Shuffle the deck
        shuffle(cardDeck);

        // Print shuffled deck
        System.out.println("Shuffled deck:");
        cardDeck.displayList();
    }

    // Shuffle method for LinkList (example logic)
    private static void shuffle(LinkList list) {
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = rand.nextInt(list.size());
            list.swap(i, randomIndex); // Assume swap is implemented in LinkList
        }
    }
}
