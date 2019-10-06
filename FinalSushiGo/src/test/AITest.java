package test;
import static org.junit.Assert.*;
import org.junit.Test;
import TEXTpackage.*;
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
}
