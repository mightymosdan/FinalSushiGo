package TEXTpackage;
import java.util.*;

public class AIMove {
    private LinkedList<String> moves;
    private Hashtable<String, Integer> allCards;
    private Hashtable<String, Integer> board;
    private int numPlayers;
    private Random randNum;

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
        randNum = new Random();
        int cardNum = 0;
        if(moves.contains("Pudding")){
            selectedCard = "Pudding";
        }

        else if((allCards.getOrDefault("SquidNigiri", 0) / numPlayers >= 1) && moves.contains("Wasabi"))
            selectedCard = "Wasabi";

        else if(moves.contains("Sashimi") && board.getOrDefault("Sashimi", 0) >= 1)
            selectedCard = "Sashimi";

        else if((allCards.getOrDefault("SquidNigiri", 0) / numPlayers >= 1) && moves.contains("Wasabi"))
            selectedCard = "Wasabi";

        else if(moves.contains("SquidNigiri"))
            selectedCard = "SquidNigiri";

        else if((allCards.getOrDefault("Sashimi", 0) / numPlayers >= 2) && moves.contains("Sashimi"))
            selectedCard = "Sashimi";

        else if((allCards.getOrDefault("Tempura", 0) / numPlayers >= 1))
            selectedCard = "Tempura";

        else if(moves.contains("Tempura") && board.getOrDefault("Tempura", 0) >= 1 && board.getOrDefault("Tempura", 0) < 2)
            selectedCard = "Tempura";

        else if(moves.contains("SalmonNigiri"))
            selectedCard = "SalmonNigiri";

        else if(moves.contains("Dumpling"))
            selectedCard = "Dumpling";

        else {
            cardNum = randNum.nextInt(moves.size());
            selectedCard = moves.get(cardNum);
        }


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
