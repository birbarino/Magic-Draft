package Magic.Game;

import java.util.ArrayList;

public class Player {
    /*====================
     * Explaining Vars 
     * ===================
     * Booleans:
     * - prefersDraw: based on deck construction (colors, avg mana curve, etc.)
     * - onThePlay: returns true if being on the play is preferred and if wonDieRoll.
     * - wonDieRoll: returns true if they rolled the highest number             //DO NOT AUTO-INDENT, IT BREAKS THIS FORMATTING
     * Strings: 
     * - name: Player's identifier
     * Ints: 
     * - wins: # of games a player has won
     * - losses: # of games a player has lost
     * - dieRoll: Result of players die roll for play or draw choice initiative
     * - lifeTotal: Player's life total. When 0, they lose the game (losses++)
     * Players:
     * - leftPlayer: Player obj to the arbitrary left. Used for passing around packs 1 & 3
     * - rightPlayer: Player obj to the arbirary right. Used for passing around pack 2
     * ArrayLists of Card objects: 
     * - hand: list of cards in the player's hand. Only accessible by player themselves.
     * - revealedCards: cards that are viewable by all players at the table/game
     * - packPickupZone: Booster packs are assigned to this zone when a player is done drafting it 
     *   (p0 assigns pack0 to p1's ppZone, p1 gets pack0 from their ppZone) p1.packPickupZone = p0.hand; p0.hand = p0.packPickupZone; p1.hand = p0.packPickupZone;
     * - sideboard: cards that were drafted but not included in the "deck" ArrayList.
     * - draftPool: All Cards that were drafted by a single player. Likely redundant and unnecessary since all of the Cards can just be added to the deck arrlist once picked.
     *   TODO: Create helper method to perform the above actions, passing in players.
     */
    public boolean prefersDraw, onThePlay, wonDieRoll;
    public String name;
    public int dieRoll, lifeTotal, wins, losses;

    public Player leftPlayer, rightPlayer;
    ArrayList<Card> hand = new ArrayList<>(); // get hand.length to get number of cards in hand. Useful
                                                             // for determining pick order based on how many cards player
                                                             // is looking at
    ArrayList<Card> deck = new ArrayList<>();   // does this do anything or will it create complexity/conflictions?
    ArrayList<Card> packPickupZone = new ArrayList<>();
    ArrayList<Card> revealedCards = new ArrayList<>();
    ArrayList<Card> sideboard = new ArrayList<Card>(); 
    ArrayList<Card> draftPool = new ArrayList<Card>();   // likely redundant as a player can just store picks in the deck and just remove sideboard cards.

    public boolean playFirst(boolean wonRoll) {

        return wonRoll;
    }

    public Player createPlayer(String name) {
        Player p = new Player();
        p.name = name;
        // p.deck = deck;   // deck variable is no longer an arg for this. Player is created, then assigned a deck before a "Game."
        p.lifeTotal = 20;
        return p;
    }

    public Card pickupPack(Card pack, Player p){

        return pack; 
    }
}