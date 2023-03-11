
package com.mycompany.blackjack;
/*
*author: ashanti morgan
*author:
*author:
*date:03/8/2023
*description: base of the card class.
*/
public abstract class Card extends Game {

    public Card(String name) {
        super(name);
    }
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();
    
    public enum Value{ACE,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};
    
    
    @Override
    public abstract String toString();

    public void gameCheck (){
        //this method will check the conditions of the game//
        //this method will check who has the winning hand (player or dealer//   
    }
    
    
    public void play() {
        checknumber();
        givecards();
        checkAce();
        //we will add some rules for gameplay in future edits// 
        //we will add a method to display the rules to the user when they begin the game//
    }

    public void declareWinner() {
        play();
    }
}