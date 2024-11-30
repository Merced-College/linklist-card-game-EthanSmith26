public class Main {
    public static void main(String[] args){
        // Initialize deck
        Deck deck = new Deck(); 

        // Shuffle cards
        deck.shuffle(); 

        // Print shuffled cards
        System.out.println("Shuffled Deck: "); 
        deck.displayDeck(); 

        // Deal player a card
        System.out.println("Your Card: ");
        for(int i = 0; i < 1; i++){
            System.out.println(deck.dealCard());
        }

        // Remaining cards in the deck
        System.out.println("\nRemaining cards in the deck:");
        deck.displayDeck();
    }
}
