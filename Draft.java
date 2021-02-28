package Magic.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Draft {
    // I'm sure that there is a sweet way to validate input.
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

        System.out.println("Created table of " + numPlayers + " player(s).");
        return table;
    }

    // unassign pack from one player to another's "pack pickup zone".
    public void passPack(Player p, Player r, Library x, Library y) {
        return;
    }

    public ArrayList<Card> getExpansion(String chosenSet, String[] availableSets) {
        ArrayList<Card> lib = new ArrayList<>();
        if (chosenSet instanceof String) {
            System.out.println("Prepare to draft " + chosenSet + "!");
        } else {
            System.out.println("Please input a string matching your desired set.");
        }
        Card testCard = new Card();
        lib.add(testCard);
        return lib;
    }

    public static void main(String[] args) {
        // this will be where the draft is created and done. Drafts total of 3 times
        // (once per pack)
        Scanner scan = new Scanner(System.in);
        Draft table = new Draft();
        int numPlayers = 0;
        int numPack = 1;
        boolean b = true;
        String chosenSet = "";
        String[] availableSets = { "DOM", "M12", "BFZ", };
        ArrayList<Card> draftedExpansion = new ArrayList<>();

        try {
            do {
                System.out.println("Are there 6 or 8 players drafting today?");
                numPlayers = scan.nextInt();
                switch (numPlayers) {
                    case 8:
                        b = false;
                        break;

                    case 6:
                        b = false;
                        break;

                    default:
                        numPlayers = 8;
                        System.out.println("8 players chosen by default");
                        break;
                }

            } while (b);

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        table.tableMaker(numPlayers);
        System.out.println("What set would you like to draft today?");
        for (String set : availableSets) {
            System.out.print(set + ", ");
        }
        System.out.println();

        // can probably be a do-while
        
        while (draftedExpansion.isEmpty()) { // while the draftedExpansion arraylist is empty, try to fill it using a set given via Scanner input
            //System.out.println("Current emptiness state of draftedExpansion: " + draftedExpansion.isEmpty());
            try {
                chosenSet = scan.next();
                for (int i = 0; i <= availableSets.length - 1; i++) { // check to see if set chosen is in array
                    while (!(chosenSet.length() == 3)) {
                        System.out.println("Please input the three character set ID for the set you want to draft");
                        chosenSet = scan.next();
                    }

                    if (availableSets[i].equals(chosenSet.toUpperCase())) {
                        draftedExpansion = table.getExpansion(chosenSet, availableSets);
                        break;
                    }

                }

            } catch (Exception e) {
                if (chosenSet.isEmpty()) {
                    System.out.println("Please define a desired set.");
                } else if (availableSets.length == 0) {
                    System.out.println("There are no sets to choose from.");
                } else {
                    System.out.println("Something went horribly wrong.");
                }
            }
        }

        // always close those scanners
        System.out.println("Closing scanner.");
        scan.close();
    }

}

/*
 * Draft pod outline: - Instantiate players and 3 packs for each player. - Put a
 * pack in each player's hand at same time. - Have each player denote value for
 * each card in pack. Create an algorithm that defines how bomby a card is.
 */