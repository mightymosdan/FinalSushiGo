package test;
import static org.junit.Assert.*;
import org.junit.Test;
import TEXTpackage.*;

import java.util.Hashtable;

public class DumplingScoreTest {

    FinalScore testDumplingScore;

    @Test
    public void testDumplingScore5orMore(){
        Hashtable<String, Integer> testBoard1 = new Hashtable<String, Integer>();
        Player[] playerArray = new Player[1];
        Player testHuman1 = new Human(0);
        playerArray[0] = testHuman1;
        testBoard1.put("Dumpling", 6);
        testHuman1.setBoard(testBoard1);

        testDumplingScore = new FinalScore(playerArray);
        testDumplingScore.calcScore();

        int expectedScore = 15;

        assertEquals("The returned score should be 15",expectedScore, testHuman1.getScore());

    }

    @Test
    public void testDumplingScore4(){
        Hashtable<String, Integer> testBoard1 = new Hashtable<String, Integer>();
        Player[] playerArray = new Player[1];
        Player testHuman1 = new Human(0);
        playerArray[0] = testHuman1;
        testBoard1.put("Dumpling", 4);
        testHuman1.setBoard(testBoard1);

        testDumplingScore = new FinalScore(playerArray);
        testDumplingScore.calcScore();

        int expectedScore = 10;

        assertEquals("The returned score should be 10",expectedScore, testHuman1.getScore());

    }



    @Test
    public void testDumplingScore0(){
        Hashtable<String, Integer> testBoard1 = new Hashtable<String, Integer>();
        Player[] playerArray = new Player[1];
        Player testHuman1 = new Human(0);
        playerArray[0] = testHuman1;
        //testBoard1.put("Dumpling", 6);
        testHuman1.setBoard(testBoard1);

        testDumplingScore = new FinalScore(playerArray);
        testDumplingScore.calcScore();

        int expectedScore = 0;

        assertEquals("The returned score should be 0",expectedScore, testHuman1.getScore());

    }
}
