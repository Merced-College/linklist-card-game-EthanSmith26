import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to Higher or Lower!");
        System.out.println("Guess whether the next card will be higher or lower.");
        System.out.println("Type 'h' for Higher or 'l' for Lower.");
        System.out.println("Let's begin!\n");

        // Deal the first card
        Card currentCard = deck.dealCard();
        System.out.println("Starting card: " + currentCard);

        // Game loop
        while (deck.remainingCards() > 0) {
            System.out.print("\nYour guess (h/l): ");
            String guess = scanner.nextLine().toLowerCase();

            // Validate input
            while (!guess.equals("h") && !guess.equals("l")) {
                System.out.print("Invalid input. Please type 'h' or 'l': ");
                guess = scanner.nextLine().toLowerCase();
            }

            // Deal the next card
            Card nextCard = deck.dealCard();
            System.out.println("Next card: " + nextCard);

            // Compare the cards
            int comparison = currentCard.compareTo(nextCard);
            boolean correctGuess = (comparison < 0 && guess.equals("h")) || (comparison > 0 && guess.equals("l"));

            if (correctGuess) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Game over.");
                break;
            }

            // Update the current card
            currentCard = nextCard;
        }

        System.out.println("\nGame over! Your final score: " + score);
        scanner.close();
    }
}
