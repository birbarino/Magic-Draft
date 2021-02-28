package Magic.Game;

public class Card {

    // TODO: Parse json for stuff below. Likely already a program for this but hey
    // it'll be fun doing it for yourself.

    // TODO: Create an algorithm that defines how bomby a card is.

    /*
     * "Bomby-ness" is defined on a numerical scale based on the quality of the card
     * for a player's deck relative to other cards in a pack. Maybe something like
     * where X/Y, where X is a card with a,b,c... traits and Y is the number of
     * cards left in pack array.
     */

    public String name, rulestext, set;
    // public int power, toughness; // this will be stored in inherited class
    // Creature
    public int cmc, cardVal; // cardVal var denotes the "bomby-ness" of it. Scale will be based on
                             // ChannelFireball draft guides
                             // set pick orders.

}

class Instant extends Card { // is inheritance the best way to do this or would interfaces be better?

}

class Creature extends Card {

}

class Sorcery extends Card {
    public int power, toughness;
}

class Artifact extends Card {

}

class Enchantment extends Card {
    public boolean isAura;
}

class Land extends Card {

}

class Planeswalker extends Card {

}

class Owner extends Card {
    
}