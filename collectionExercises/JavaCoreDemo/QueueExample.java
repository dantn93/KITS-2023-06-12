import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Access the element at the front of the queue without removing it
        String frontElement = queue.peek();
        System.out.println("Front element of the queue: " + frontElement);

        // Process elements in the queue (remove them)
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println("Processing element: " + element);
        }

        // Check the size of the queue after processing
        System.out.println("Size of the queue after processing: " + queue.size());
    }
}
