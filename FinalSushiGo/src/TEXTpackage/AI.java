package TEXTpackage;
import java.util.*;

public class AI extends Player {

    private Hashtable<String, Integer> allCards;
    private LinkedList<String>[] hands;
    private int numPlayers;
    private Random randNum;
    private LinkedList<String> myHand;
    private Hashtable<String, Integer> myBoard;
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
        accessAllCards();
        setMyHand();
        setBoard();
        AIMove smartMove = new AIMove(allCards, myHand, myBoard,numPlayers);
        String AIchoice = smartMove.chooseCard();
        super.setCardPlayed(AIchoice);
        super.updateBoard();
        System.out.println(this.toString() + " chooses: " + AIchoice);
    }

    /**
     * This method takes all the hands that are currently in play and
     * stores all the possible cards into a hashtable that the AI can
     * access and view.
     */
    private void accessAllCards() {
        setAllCards();

        for(int handNum = 0; handNum < hands.length; handNum++) {
            for(int card = 0; card < hands[handNum].size(); card++) {

                if(allCards.containsKey(hands[handNum].get(card))) {
                    allCards.replace(hands[handNum].get(card),
                            (allCards.get(hands[handNum].get(card)) + 1));
                }
                else {
                    allCards.put(hands[handNum].get(card), 1);
                }
            }
        }
    }

    /**
     * Setter to change private variable into an empty Hashtable to hold all cards
     * and their quantity during the game
     */
    private void setAllCards(){
        this.allCards = new Hashtable<String, Integer>();
    }

    public Hashtable<String, Integer> getAllCards(){
        return this.allCards;
    }

    private void setMyHand(){
        this.myHand = super.getPossibleMoves();
    }

    private void setBoard(){
        this.myBoard = super.getBoard();
    }

}
