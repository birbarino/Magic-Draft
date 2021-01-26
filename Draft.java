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

    public int rollDie(Player p) { // rolls D-12 to determine first player
        int roll = (int) (Math.random() * 10);
        if (roll <= 12 && roll >= 1) {
            return roll;
        } else if (roll > 12 || roll <= 0) {
            System.out.println("recursion");
            return rollDie(p);
        } else
            return 0;
    }

    public static void main(String[] args) { //this will be where the draft is created and done. Drafts 3 times, once per pack

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
        System.out.println(p0.name + ": " + roll0);

        System.out.println(p1.name + ": " + roll1);

        while (roll0 == roll1) { // while both rolls are equal, reroll until not equal.
            p0.dieRoll = roll0;
            p1.dieRoll = roll1;
        }

        // sets first player
        if (roll0 > roll1) {
            System.out.println(p0.name + " wins the high roll.");
            p0.wonDieRoll = true;
        } else {
            System.out.println(p1.name + " wins the high roll.");
            p1.wonDieRoll = true;
        }

        // System.out.println((p0.wonDieRoll) && (p1.wonDieRoll));
        // Why is this even here?
    }

    public static void duel(Player[] args) { // what does this do? I have no clue

    }
}