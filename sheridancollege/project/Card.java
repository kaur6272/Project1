/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Arshdeep Kaur, Ritika Saini, Muskan Trikha, Amandeep Singh   Date Aug 6,2019 
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card 
{
        
    boolean getCard() {
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean beats(Card c2extra) {
        return true;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean equalsForWar(Card c2) {
        if(this.value.compareTo(c2.value)==0)
            return true;
        return false; 
      // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //default modifier for child classes
        public static enum SUIT {SPADE,DIAMOND,CLUB,HEARTS}; //enum is added for loose coupling 
        public static enum VALUE{ACE,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KING, QUEEN};
        private final SUIT suit; 
        private final VALUE value; 
        final public static String[] SUITS = {"SPADE","DIAMOND","CLUB","HEARTS"};
        final public static String[] VALUES = {"ACE", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN","JACK","KING","QUEEN"};
	final public static int LIMIT = 10000;
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
     
     public Card(SUIT s, VALUE gVal) 
        {
           suit =s;
           value= gVal;
        }
   
     
 public VALUE getValue() {
  return this.value; 
 }
 
 public SUIT getSuit() {
  return this.suit;
        }
 public static SUIT getSuit(String x) {
     
     if(SUIT.CLUB.toString().compareTo(x)==0)
        return SUIT.CLUB;
     if(SUIT.SPADE.toString().compareTo(x)==0)
        return SUIT.SPADE;
     if(SUIT.HEARTS.toString().compareTo(x)==0)
        return SUIT.HEARTS;
     if(SUIT.DIAMOND.toString().compareTo(x)==0)
        return SUIT.DIAMOND;
     
     return null;
 }
 
  public static VALUE getValue(String x) {
     
     if(VALUE.ACE.toString().compareTo(x)==0)
        return VALUE.ACE;
     if(VALUE.ONE.toString().compareTo(x)==0)
        return VALUE.ONE;
     if(VALUE.TWO.toString().compareTo(x)==0)
        return VALUE.TWO;
     if(VALUE.THREE.toString().compareTo(x)==0)
        return VALUE.THREE;
     if(VALUE.FOUR.toString().compareTo(x)==0)
        return VALUE.FOUR;
     if(VALUE.FIVE.toString().compareTo(x)==0)
        return VALUE.FIVE;
     if(VALUE.SIX.toString().compareTo(x)==0)
        return VALUE.SIX;
     if(VALUE.SEVEN.toString().compareTo(x)==0)
        return VALUE.SEVEN;
     if(VALUE.EIGHT.toString().compareTo(x)==0)
        return VALUE.EIGHT;
     if(VALUE.NINE.toString().compareTo(x)==0)
        return VALUE.NINE;
     if(VALUE.TEN.toString().compareTo(x)==0)
        return VALUE.TEN;
     if(VALUE.JACK.toString().compareTo(x)==0)
        return VALUE.JACK;
     if(VALUE.QUEEN.toString().compareTo(x)==0)
        return VALUE.QUEEN;
     if(VALUE.KING.toString().compareTo(x)==0)
        return VALUE.KING;
     
     return null;
 }
 
 public static String getStringSuit(SUIT x){
     return x.name();
 }
 
 public String toString(){
     return this.suit.toString();
 }
}