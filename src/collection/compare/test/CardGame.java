package collection.compare.test;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CardGame {

    private final Player[] players;
    private final List<Card> deck = new ArrayList<>();

    public CardGame(Player[] players) {
        this.players = players;
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public void play() {
        makeDeck();
        shuffleDeck();
        giveCardToPlayer();
        showCard();
        printGameResult();
    }

    private void makeDeck() {
        for (Suit suit :  Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, suit));
            }
        }
    }

    private void giveCardToPlayer() {
        for (Player player : players) {
            for (int i = 0; i < player.getMaxCardCount(); i++) {
                player.receiveCard(deck.removeFirst());
            }
        }
    }

    private void showCard() {
        for (Player player : players) {
            player.showCards();
        }
    }

    private void printGameResult() {
        int score1 = players[0].getTotalScore();
        int score2 = players[1].getTotalScore();

        if (score1 > score2) {
            System.out.println(players[0].getName() + " 승리");
        }
        else if (score1 < score2) {
            System.out.println(players[1].getName() + " 승리");
        }
        else {
            System.out.println("무승부");
        }
    }
}
