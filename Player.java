package Magic.Game;

public class Player {

    public boolean prefersDraws, onThePlay, wonDieRoll;
    public String name;
    public int dieRoll, lifeTotal; // cardsInHand can represent cards in selected draft pack
    Library unknownCards, knownCards, hand;
    Library deck = new Library();
    Pack draftPacks;

    public boolean playFirst(boolean wonRoll) {

        return wonRoll;
    }

    public Player createPlayer(String name) {
        Player p = new Player();
        p.name = name;
        //p.deck = deck;
        p.lifeTotal = 20;
        return p;
    }
}