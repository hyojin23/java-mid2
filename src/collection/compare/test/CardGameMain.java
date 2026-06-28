package collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {
        Player player1 = new Player("플레이어1", 5);
        Player player2 = new Player("플레이어2", 5);
        Player[] players = new Player[]{player1, player2};
        CardGame cardGame = new CardGame(players);
        cardGame.play();
    }
}
