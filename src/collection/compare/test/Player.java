package collection.compare.test;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int maxCardCount;
    private int cardCount;
    private final Card[] cards;

    public Player(String name, int maxCardCount) {
        cards = new Card[maxCardCount];
        this.name = name;
        this.maxCardCount = maxCardCount;
    }

    public String getName() {
        return name;
    }

    public int getMaxCardCount() {
        return maxCardCount;
    }

    public void receiveCard(Card card) {
        cards[cardCount++] = card;
    }

    public void showCards() {
        Arrays.sort(cards);
        System.out.println(name + "의 카드: " + Arrays.toString(cards) + ", 합계: " + getTotalScore());
    }

    public int getTotalScore() {
        int totalScore = 0;
        for (Card card : cards) {
            totalScore += card.getNumber();
        }
        return totalScore;
    }
}
