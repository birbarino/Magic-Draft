package Magic.Game;

import java.util.ArrayList;

public class Game {

    public int rollDie(Player p) { // rolls D-12 to determine first player
        int roll = (int) (Math.random() * 10);
        if (roll <= 12 && roll >= 1) {
            return roll;
        } else if (roll > 12 || roll <= 0) {
            System.out.println("Using some recursion");
            return rollDie(p);
        } else
            return 0;
    }

    static boolean onPlay;

    // Getter
    public static boolean isOnPlay() {
        return onPlay;
    }

    // Setter
    public static void setOnPlay(boolean onPlay) {
        Game.onPlay = onPlay;
    }

    // public Player createPlayer(String name) {
    //     Player p = new Player();
    //     p.name = name;
    //     //p.deck = deck;
    //     p.lifeTotal = 20;
    //     return p;
    // }

    ArrayList<Player> players = new ArrayList<Player>();

    public static void main(String[] args) {
        Player newPlayer = new Player();
        Game gameplay = new Game();
        Player p0 = newPlayer.createPlayer("Bill");
        Player p1 = newPlayer.createPlayer("Finnigan");

        int roll0 = gameplay.rollDie(p0);
        int roll1 = gameplay.rollDie(p1);
        p0.dieRoll = roll0;
        p1.dieRoll = roll1;

        System.out.println("Roll!\n");
        System.out.println(p0.name + " rolled a " + roll0);

        System.out.println(p1.name + " rolled a " + roll1);

        while (roll0 == roll1) { // while both rolls are equal, reroll until not equal.
            p0.dieRoll = roll0;
            p1.dieRoll = roll1;
        }

        // sets first player
        if (roll0 > roll1) {
            System.out.println(p0.name + " wins the high roll.");
            p0.wonDieRoll = true;
            setOnPlay(p0.playFirst(p0.wonDieRoll));
            p0.onThePlay = Game.isOnPlay(); // sets onThePlay bool to result for player
        } else {
            System.out.println(p1.name + " wins the high roll.");
            p1.wonDieRoll = true;
            setOnPlay(p1.playFirst(p1.wonDieRoll));
            p1.onThePlay = Game.isOnPlay(); // sets onThePlay bool to result for player
        }

        System.out.println(p0.onThePlay);
        System.out.println(p1.onThePlay);
    }
}
