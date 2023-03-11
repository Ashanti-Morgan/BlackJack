
package com.mycompany.blackjack;

import java.util.ArrayList;
/*
*author: ashanti morgan
*author:
*author:
*date:03/8/2023
*description: class that models the game.
*/
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();
    
     //Check if the total value of the card is greater then 21 or not??
    public boolean checknumber() {
        
        return true;
        
    }
    //give two random card to dealer and the player.
    public void givecards() {
        
    }
    
     
    
    //An Ace will have a value of 11 unless that would give a player or the dealer a score in excess of 21; 
    //in which case, it has a value of 1. 
    //The dealer starts the game. Every player gets 2 cards, face up. 
    //The dealer gets 2 cards, with a Hole Card (1 card face down).
    public int checkAce() {
        return 0;
    }

}//end class
 

