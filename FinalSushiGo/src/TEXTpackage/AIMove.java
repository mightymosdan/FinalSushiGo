package TEXTpackage;
import java.util.*;

public class AIMove {
    private LinkedList<String> moves;
    private Hashtable<String, Integer> allCards;
    private Hashtable<String, Integer> board;
    private int numPlayers;

    /* This constructor takes the hand from the AI class and uses the
    setter to set the private variable moves to the hand from AI.
    @param possibleChoices given by the AI class.
     */
    public AIMove( Hashtable<String, Integer> cardsInPlay, LinkedList<String> AIsHand, Hashtable<String, Integer> AIBoard, int playerCount){
        setMoves(AIsHand);
        setAllCards(cardsInPlay);
        setBoard(AIBoard);
        setNumPlayers(playerCount);

    }

    public String chooseCard(){
        String selectedCard = "";
        if(moves.contains("Pudding")){
            selectedCard = "Pudding";
        }

        else if((allCards.getOrDefault("SquidNigiri", 0) / numPlayers >= 1) && moves.contains("Wasabi"))
            selectedCard = "Wasabi";


        return selectedCard;

    }

    /* Setter for moves
    @param hand provided from the constructor.
     */
    public void setMoves(LinkedList<String> hand){
        this.moves = hand;
    }

    public void setAllCards(Hashtable<String, Integer> cardsInPlay){
        this.allCards = cardsInPlay;
    }

    public void setBoard(Hashtable<String, Integer> playerBoard){
        this.board = playerBoard;
    }

    public void setNumPlayers(int playerNum){
        this.numPlayers = playerNum;
    }




}
