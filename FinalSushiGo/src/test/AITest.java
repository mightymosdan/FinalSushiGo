package test;
import static org.junit.Assert.*;
import org.junit.Test;
import TEXTpackage.*;

import java.util.Hashtable;
import java.util.LinkedList;


public class AITest {

    @Test
    public void testCreateAI(){
        LinkedList<String>[] testHands = new LinkedList[0];
        LinkedList<String>[] hands = new LinkedList[0];

        AI _AI = new AI(0, hands);
        AI testAI = new AI(0,testHands);

        assertEquals("These are not the same objects, but they should be.",testAI.getClass(),_AI.getClass());

    }

    @Test
    public void testAIisNotHuman(){
        LinkedList<String>[] hands = new LinkedList[0];

        AI _AI = new AI(0, hands);
        Human testHuman = new Human(1);

        assertNotSame("These should not be the same object.", testHuman, _AI);

    }

    @Test
    public void testAccessAllCards(){
        LinkedList<String>[] testHands = new LinkedList[2];
        LinkedList<String>[] hands = new LinkedList[1];

        LinkedList<String> testHand1 = new LinkedList<String>();
        LinkedList<String> testHand2 = new LinkedList<String>();

        testHand1.add("Pudding");
        testHand1.add("Dumpling");
        testHand1.add("Wasabi");

        testHand2.add("MakiRoll");
        testHand2.add("MakiRoll");
        testHand2.add("MakiRoll");

        testHands[0] = testHand1;
        testHands[1] = testHand2;

        AI _AI = new AI(0, testHands);
        _AI.setPossibleMoves(testHand1);
        _AI.move(1);
        Hashtable<String, Integer> testAllCards;
        testAllCards = _AI.getAllCards();

        Hashtable<String, Integer> expectedAllCards = new Hashtable<>();
        expectedAllCards.put("MakiRoll",3);
        expectedAllCards.put("Dumpling",1);
        expectedAllCards.put("Pudding",1);
        expectedAllCards.put("Wasabi",1);



        assertEquals("These should be the same board", expectedAllCards,testAllCards);
    }
}
