package Magic.Game;

public class Player{

    public boolean prefersDraws, onThePlay, wonDieRoll;
    public String name;
    public int dieRoll, cardsInHand, lifeTotal;
    Library deck = new Library();
    Pack draftPacks;

    public boolean onPlay(boolean wonRoll){
        
        return false;
    }
}