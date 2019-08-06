/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Arshdeep Kaur, Ritika Saini, Muskan Trikha, Amandeep Singh   Date Aug 6,2019 
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Card.LIMIT;
import java.util.ArrayList;
import java.util.Random;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye, 2018
 */
public class Player {

    private String playerID1;
    private String playerID2; //the unique ID for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     */
    public Player() {
        
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID1;
    }

    public String getPlayerID2() {
        return playerID2;
    }

    /**
     * Ensure that the playerID is unique
     *
     */
    public void setPlayerID1(String givenID1) {
        playerID1 = givenID1;
    }

    public void setPlayerID2(String givenID2) {
        playerID2 = givenID2;
    }

    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
    public void play() {

        Random r = new Random();
        Card x =null;

        ArrayList<Card> deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                //System.out.println(Card.SUIT.HEARTS.toString());
                x = new Card(Card.getSuit(Card.SUITS[i]), Card.getValue(Card.VALUES[j]));
                deck.add(x);
            }
        }

        // Set up both players' cards.
        ArrayList<Card> player1 = new ArrayList<Card>();
        ArrayList<Card> player2 = new ArrayList<Card>();

        // Deal the cards randomly to the two players.
        int cnt = 0;
        while (deck.size() > 0) {
            int nextCard = r.nextInt(deck.size());
            if (cnt % 2 == 0) {
                Card c1 = deck.remove(nextCard);
                player1.add(c1);
            } else {
                player2.add(deck.remove(nextCard));
            }
            cnt++;
        }

        int winner = -1, turns = 0;

        // Play war until someone runs out of cards.
        while (player1.size() > 0 && player2.size() > 0 && turns < LIMIT) {

            // Show how many cards each team has,
            System.out.println("Player 1 has " + player1.size() + " cards and Player 2 has " + player2.size() + " cards.");

            Card c1 = player1.remove(0);
            Card c2 = player2.remove(0);

            // Print out the new play.
            System.out.println("Player 1 plays " + c1 + " and player 2 plays " + c2);

            // War!
            if (c1.equalsForWar(c2)) {

                // Notify that we have a war.
                System.out.println("We have a war!!!");

                // Not enough cards for player 1 to carry out the war.
                if (player1.size() < 3) {
                    winner = 2;
                    System.out.println("Player 1 ran out of cards in a war battle.");
                    break;
                } // Same case for player 2.
                else if (player2.size() < 3) {
                    winner = 1;
                    System.out.println("Player 2 ran out of cards in a war battle.");
                    break;
                } // Have a battle. Put two cards in the "bin" and battle with the third card.
                else {

                    // Two cards taken from both players stored in tmp.
                    ArrayList<Card> tmp = new ArrayList<Card>();
                    for (int i = 0; i < 2; i++) {
                        tmp.add(player1.remove(0));
                        tmp.add(player2.remove(0));
                    }

                    // These are the next cards to battle.
                    Card c1extra = player1.remove(0);
                    Card c2extra = player2.remove(0);

                    // Print out cards played in battle.
                    System.out.println("In the card battle player 1 played " + c1extra + " and player 2 played " + c2extra);

                    // I'll use the no tie-breaker rule between these cards to simplify the game.
                    if (c1extra.beats(c2extra)) {

                        // Lots of cards to add! (8 in all)
                        player1.add(c1);
                        player1.add(c2);
                        player1.add(c1extra);
                        player1.add(c2extra);
                        for (Card c : tmp) {
                            player1.add(c);
                        }

                        System.out.println("Player 1 wins the battle and gets all 8 cards!");
                    } else {

                        // Here we do it for player 2 instead.
                        player2.add(c1);
                        player2.add(c2);
                        player2.add(c1extra);
                        player2.add(c2extra);
                        for (Card c : tmp) {
                            player2.add(c);
                        }

                        System.out.println("Player 2 wins the battle and gets all 8 cards!");
                    }
                }
            } // Regular case.
            else {
                if (c1.beats(c2)) {
                    player1.add(c1);
                    player1.add(c2);
                    System.out.println("Player 1 wins the battle and gets 2 cards.");
                } else {
                    player2.add(c1);
                    player2.add(c2);
                    System.out.println("Player 2 wins the battle and gets 2 cards.");
                }

            }

            turns++;
            System.out.println();
        }

        if (turns == LIMIT) {
            System.out.println("Sorry, after 10000 turns no one won, so the game is a tie!");
        } // Assign winner if unassigned.
        else if (winner == -1) {
            if (player2.size() == 0) {
                winner = 1;
            } else {
                winner = 2;
            }
        }

        // Print out final winner.
        if (winner != -1) {
            System.out.println("The winner is player " + winner);
        }

    }
}
