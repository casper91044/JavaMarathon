package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(95);
        Player player3 = new Player(91);

        Player.info();

        Player player4 = new Player(99);
        Player player5 = new Player(93);
        Player player6 = new Player(5);

        Player.info();
        player6.run();
        player6.run();
        player6.run();
        player6.run();
        player6.run();
        Player.info();
    }
}
