/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Arshdeep Kaur, Ritika Saini, Muskan Trikha, Amandeep Singh   Date Aug 6,2019 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public class Game 
{
   
    private final String gameName;//the title of the game
    public ArrayList <Player> players;// the players of the game
    
    public static void main(String[] args){
        Game myGame = new Game("Sheridan");
        Player x = new Player();
        x.play();
        
    }
    
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public void play(){
        
    }
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
 
    public void declareWinner(){
        
    }
    
}//end class