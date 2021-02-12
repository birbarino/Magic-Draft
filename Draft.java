package Magic.Game;

import java.util.ArrayList;

public class Draft {
    public ArrayList<Player> tableMaker(int numPlayers) {
        ArrayList<Player> table = new ArrayList<Player>();
        if (numPlayers == 8) { // 8 player draft
            Player p0 = new Player();
            Player p1 = new Player();
            Player p2 = new Player();
            Player p3 = new Player();
            Player p4 = new Player();
            Player p5 = new Player();
            Player p6 = new Player();
            Player p7 = new Player();

        } else if (numPlayers == 6) { // 6 player draft
            Player p0 = new Player();
            Player p1 = new Player();
            Player p2 = new Player();
            Player p3 = new Player();
            Player p4 = new Player();
            Player p5 = new Player();

        } else {
            System.out.println("Please gather 6 or 8 players");
        }

        System.out.println("Created table of " + numPlayers + " players.");
        return table;
    }

    public static void main(String[] args) { // this will be where the draft is created and done. Drafts 3 times, once
                                             // per pack

        // System.out.println((p0.wonDieRoll) && (p1.wonDieRoll));
        // Why is this even here?
    }

    public static void duel(Player[] args) { // what does this do? I have no clue

    }
}

/*
 * Draft pod outline: - Instantiate players and 3 packs for each player. - Put a
 * pack in each player's hand at same time. - Have each player denote value for
 * each card in pack. Create an algorithm that defines how bomby a card is.
 */