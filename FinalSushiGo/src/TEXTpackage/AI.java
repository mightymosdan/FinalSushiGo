package TEXTpackage;
import java.util.*;

public class AI extends Player {

    private Hashtable<String, Integer> allCards;
    private LinkedList<String>[] hands;
    private int numPlayers;
    private Random randNum;
    public static final String PLAYER_NAME = "Computer ";

    /**
     * constructor AI
     * @param id    initializes playerID with id
     * @param allHands  initializes possibleMoves with allHands
     */
    public AI(int id, LinkedList<String>[] allHands ) {
        super(id + 1);
        this.hands = allHands;
        this.numPlayers = allHands.length;
    }

    /**
     *toString to return the player's name + id
     * @return PLAYER_NAME + player ID  	returns string value to identify the player object
     */
    public String toString() {
        return PLAYER_NAME + super.getID();
    }


    public void move(int turn) {

    }
}
