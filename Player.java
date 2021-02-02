package Magic.Game;

public class Player {

    public boolean prefersDraws, onThePlay, wonDieRoll;
    public String name;
    public int dieRoll, cardsInHand, lifeTotal; // cardsInHand can represent cards in selected draft pack
    Library deck = new Library();
    Pack draftPacks;

    public boolean playFirst(boolean wonRoll) {

        return wonRoll;
    }
}