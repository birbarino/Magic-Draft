package Magic.Game;

public class Draft {

    static Player p0 = new Player();
    static Player p1 = new Player();
    static Player p2 = new Player();
    static Player p3 = new Player();
    static Player p4 = new Player();
    static Player p5 = new Player();
    static Player p6 = new Player();
    static Player p7 = new Player();
    private static boolean onPlay;

    public int rollDie(Player p) { // rolls D-12 to determine first playerk
        int roll = (int) (Math.random() * 10);
        if (roll <= 12 && roll >= 1) {
            return roll;
        } else if (roll > 12 || roll <= 0) {
            System.out.println("recursion");
            return rollDie(p);
        } else
            return 0;
    }

    // Getter
    public static boolean isOnPlay() {
        return onPlay;
    }

    // Setter
    public static void setOnPlay(boolean onPlay) {
        Draft.onPlay = onPlay;
    }

    public static void main(String[] args) { // this will be where the draft is created and done. Drafts 3 times, once
                                             // per pack

        Draft pod = new Draft();
        p0.name = "Bill";
        p1.name = "Finley";

        // TODO: Replicate a draft pod with 8 players. Give each player 3 packs, make a
        // pack maker, and make a drafting protocol.
        int roll0 = pod.rollDie(p0);
        int roll1 = pod.rollDie(p1);
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
            p0.onThePlay = Draft.isOnPlay(); // sets onThePlay bool to result for player
        } else {
            System.out.println(p1.name + " wins the high roll.");
            p1.wonDieRoll = true;
            setOnPlay(p1.playFirst(p1.wonDieRoll));
            p1.onThePlay = Draft.isOnPlay(); // sets onThePlay bool to result for player
        }

        System.out.println(p0.onThePlay);
        System.out.println(p1.onThePlay);

        // System.out.println((p0.wonDieRoll) && (p1.wonDieRoll));
        // Why is this even here?
    }

    public static void duel(Player[] args) { // what does this do? I have no clue

    }
}

/*
 * Draft pod outline: - Instantiate players and 3 packs for each player. - Put a
 * pack in each player's hand at same time. - Have each player denote value for
 * each card in pack. Create an algorithm that defines how bomby a card is. - -
 * 
 * 
 */