
package blackjack;

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

    @Override
    public void play() {
        checknumber();
        givecards();
        checkAce();
    }

    @Override
    public void declareWinner() {
        play();
    }
}