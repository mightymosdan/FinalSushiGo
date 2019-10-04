package TEXTpackage;
import java.util.*;

public class AIMove {
    private LinkedList<String> moves;

    /* This constructor takes the hand from the AI class and uses the
    setter to set the private variable moves to the hand from AI.
    @param possibleChoices given by the AI class.
     */
    public AIMove( LinkedList<String> possibleChoices){
        setMoves(possibleChoices);

    }

    /* Setter for moves
    @param hand provided from the constructor.
     */
    public void setMoves(LinkedList<String> hand){
        this.moves = hand;
    }




}
