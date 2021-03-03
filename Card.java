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

    public String name, oracleText, set, typeLine;
    // in scryfall_card_data.json, the field "type_line" defines cards as Snow,
    // Legendary, Tribal.
    // in scryfall_card_data.json, the field "oracle_text" defines cards with Flash.
    // Can flash inherit casting speed denoted in Instant class?
    public boolean isSnow, isTribal, hasFlash, isLegendary;
    public int cmc, cardVal; // cardVal var denotes the "bomby-ness" of it. Scale will be based on
                             // ChannelFireball draft guides
                             // set pick orders.

}

// in scryfall_card_data.json, the field "type_line" defines cards as Instant,
// etc.
class Instant extends Card { // is inheritance the best way to do this or would interfaces be better?

}

class Creature extends Card {
    public int power, toughness;
    public boolean isArtifact, isEnchantment;
}

class Sorcery extends Card {

}

class Artifact extends Card {
    public boolean isVehicle;
}

class Enchantment extends Card {
    public boolean isAura;
}

class Land extends Card {
    // in scryfall_card_data.json, the field "type_line" defines Basic Land trait,
    // so do !(exampleCard.typeLine.contains("Basic"))
    public boolean isNonBasic;
}

class Planeswalker extends Card {

}

class Owner extends Card {
    public Player ownerName;
    public Library ownerDeck; // have this change ownership from a pack to a player when drafted in case cards
                              // somehow get mismatched. Have all cards go to owner's Libraries after every pick.
}
