package Magic.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Draft {
    //I'm sure that there is a sweet way to validate input.
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

    //unassign pack from one player to another's "pack pickup zone".
    public void passPack(Player p, Player r, Library x, Library y){
        return;
    }

    public ArrayList<Library> setGrabber(String set) {
        ArrayList<Library> lib = new ArrayList<>();
        return lib;
    }

    public static void main(String[] args) {
        // this will be where the draft is created and done. Drafts 3 times, once
        // per pack
        Scanner scan = new Scanner(System.in);
        Draft table = new Draft();
        int numPlayers = 0;
        int numPack = 1;
        boolean b = true;
        String chosenSet = "";
        String[] possibleSets = { "DOM", "M12", "BFZ", };

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
        for (String set : possibleSets) {
            System.out.print(set + ", ");
        }
        System.out.println();

        //TODO: Fix this set checker
        b = true;
        while (b) {
            String str = "";
            for (int i = 0; i < possibleSets.length; i++) {
                str = scan.nextLine();
                if (possibleSets[i].equalsIgnoreCase(str)) {
                    chosenSet = str;
                    System.out.println("Prepare to draft " + chosenSet + "!");
                    b = false; //escapes the loop, can probably use break instead
                }
            }
            if (chosenSet != str) {
                System.out.println("Please choose from a set listed above.");
            } else{
                System.out.println("Executing else block for chosenSet != str");
                b = false; //escapes loop
            }
        }

        // always close those scanners
        scan.close();
    }

}

/*
 * Draft pod outline: - Instantiate players and 3 packs for each player. - Put a
 * pack in each player's hand at same time. - Have each player denote value for
 * each card in pack. Create an algorithm that defines how bomby a card is.
 */