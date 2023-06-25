import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);

        // Use Collections utility methods
        System.out.println("Original list: " + numbers);

        // Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted list (ascending): " + numbers);

        // Reverse the order of the list
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // Shuffle the elements in the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // Find the minimum and maximum elements in the list
        Integer min = Collections.min(numbers);
        Integer max = Collections.max(numbers);
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        // Replace all occurrences of a specific element in the list
        Collections.replaceAll(numbers, 5, 9);
        System.out.println("List after replacing 5 with 9: " + numbers);
    }
}
