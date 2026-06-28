package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int number;
    private final Suit suit;

    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return number + "(" + suit.getSymbol() + ")";
    }

    @Override
    public int compareTo(Card onotherCard) {
        if (this.number == onotherCard.number) {
            return this.suit.getOrder() - onotherCard.suit.getOrder();
        }
        return this.number - onotherCard.number;
    }
}
