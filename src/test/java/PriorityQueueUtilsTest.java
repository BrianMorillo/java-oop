import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Author: Brian Morillo
 * Description: Priority Queues Utility functions test
 */
class PriorityQueueUtilsTest {
    private final PriorityQueue<String> queue1 = new PriorityQueue<>(List.of(
            new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));

    private final PriorityQueue<String> queue2 = new PriorityQueue<>(List.of(
            new String[]{"George", "Katie", "Kevin", "Michelle", "Ryan"}));

    /**
     * Tests priority queues union
     */
    @Test
    void queuesUnionTest(){
        String expected = "[Blake, George, George, Jim, Kevin, Michael, John, Katie, Kevin, Michelle, Ryan]";
        String actual = PriorityQueueUtils.getQueuesUnion(queue1, queue2).toString();
        assertEquals(expected, actual);
    }

    /**
     * Tests priority queues difference
     */
    @Test
    void queuesDifferenceTest(){
        String expected = "[Blake, John, Jim, Michael]";
        String actual = PriorityQueueUtils.getQueuesDifference(queue1, queue2).toString();
        assertEquals(expected, actual);
    }

    /**
     * Tests priority queues intersection
     */
    @Test
    void queuesIntersectionTest(){
        String expected = "[George, Kevin]";
        String actual = PriorityQueueUtils.getQueuesIntersection(queue1, queue2).toString();
        assertEquals(expected, actual);
    }

}