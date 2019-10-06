package test;
import static org.junit.Assert.*;
import org.junit.Test;
import TEXTpackage.*;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;


public class AIMoveTest {

    AIMove testAIMove;


    @Test
    public void testPuddingAIMove(){
        Hashtable<String, Integer> testAllCards = new Hashtable<>();
        LinkedList<String> testHand =  new LinkedList<>();
        Hashtable<String, Integer> testBoard = new Hashtable<>();
        int numPlayers = 2;

        testAllCards.put("Pudding",2);
        testAllCards.put("Dumpling",2);
        testHand.add("Pudding");
        testHand.add("Dumpling");

        AIMove testAIMove =  new AIMove(testAllCards,testHand,testBoard,2);
        String testCard = "Pudding";
        String testAIMoveCard = testAIMove.chooseCard();

        assertEquals("The testAIMoveCard should be Pudding", testCard, testAIMoveCard);


    }

    @Test
    public void testWasabiAIMove(){
        Hashtable<String, Integer> testAllCards = new Hashtable<>();
        LinkedList<String> testHand =  new LinkedList<>();
        Hashtable<String, Integer> testBoard = new Hashtable<>();
        int numPlayers = 2;

        testAllCards.put("Wasabi",2);
        testAllCards.put("SquidNigiri",2);
        testHand.add("Wasabi");
        testHand.add("SquidNigiri");

        AIMove testAIMove =  new AIMove(testAllCards,testHand,testBoard,2);
        String testCard = "Wasabi";
        String testAIMoveCard = testAIMove.chooseCard();

        assertEquals("The testAIMoveCard should be Pudding", testCard, testAIMoveCard);


    }

    @Test
    public void testDumplingAIMove(){
        Hashtable<String, Integer> testAllCards = new Hashtable<>();
        LinkedList<String> testHand =  new LinkedList<>();
        Hashtable<String, Integer> testBoard = new Hashtable<>();
        int numPlayers = 2;

        testAllCards.put("Tempura",1);
        testAllCards.put("Sashimi",1);
        testAllCards.put("Dumpling",2);
        testHand.add("Sashimi");
        testHand.add("Dumpling");

        AIMove testAIMove =  new AIMove(testAllCards,testHand,testBoard,2);
        String testCard = "Dumpling";
        String testAIMoveCard = testAIMove.chooseCard();

        assertEquals("The testAIMoveCard should be Pudding", testCard, testAIMoveCard);


    }
}
