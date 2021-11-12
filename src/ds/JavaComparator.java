package ds;

import java.util.Arrays;
import java.util.Comparator;

public class JavaComparator {

    public static void main(String[] args) {

        Player[] players = new Player[4];
        players[0] = new Player("Saurabh",100);
        players[1] = new Player("John",50);
        players[2] = new Player("Deo",150);
        players[3] = new Player("Abraham",50);

        Checker checker = new Checker();
        Arrays.sort(players,checker);

        for (Player p:players) {
            System.out.println(p.name+" "+p.score);
        }
    }

    static class  Checker implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            if (o1.score == o2.score) {
                return o1.name.compareTo(o2.name);
            }
            return  o2.score - o1.score;
        }
    }

    static class Player {
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
