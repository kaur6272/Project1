/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Arshdeep Kaur 
 Amandeep Singh 
 Muskan Trikha 
 Ritika Saini 
 */
public abstract class Card 
{

    boolean getCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //default modifier for child classes
        public enum Suit {SPADE,DIAMOND,CLUB,HEARTS}; //enum is added for loose coupling 
        public enum Value{ACE,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,JACK,KING,QUEEN};
        private final Suit suit; 
        private final Value value; 
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
     public Card(Suit s, Value gVal) 
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value; 
	}

	
	public Suit getSuit() {
		return this.suit;
        }
    @Override
    public abstract String toString();
    
}
