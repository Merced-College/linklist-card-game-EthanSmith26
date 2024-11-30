public class Card implements Comparable<Card> {
    private String suit;
    private String rank;
    private int value;
    private String image;

    // Constructor
    public Card(String suit, String rank, int value, String image) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
        this.image = image;
    }

    // Getters
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    // compareTo method to compare cards by value
    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.value, other.value);
    }
}
