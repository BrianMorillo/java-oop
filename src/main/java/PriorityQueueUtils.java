import java.util.PriorityQueue;

/**
 * @author Brian Morillo
 * Date: 2/8/2022
 * Utility functions for Priority Queues
 */
public class PriorityQueueUtils {
    /**
     * Gets the union between two priority queues
     * @param q1 priority queue 1
     * @param q2 priority queue 2
     * @return PriorityQueue representing the union of both params
     */
    public static PriorityQueue<String> getQueuesUnion (
            PriorityQueue<String> q1, PriorityQueue<String> q2) {
        PriorityQueue<String> queue = new PriorityQueue<>(q1);
        queue.addAll(q2);
        return queue;
    }

    /**
     * Gets the difference between two priority queues
     * @param q1 priority queue 1
     * @param q2 priority queue 2
     * @return PriorityQueue representing the difference of both params
     */
    public static PriorityQueue<String> getQueuesDifference(
            PriorityQueue<String> q1, PriorityQueue<String> q2) {
        PriorityQueue<String> queue = new PriorityQueue<>(q1);
        queue.removeAll(q2);
        return queue;
    }
    /**
     * Gets the intersection between two priority queues
     * @param q1 priority queue 1
     * @param q2 priority queue 2
     * @return PriorityQueue representing the intersection of both params
     */
    public static PriorityQueue<String> getQueuesIntersection(
            PriorityQueue<String> q1, PriorityQueue<String> q2) {
        PriorityQueue<String> queue = new PriorityQueue<>(q1);
        queue.retainAll(q2);
        return queue;
    }
}
