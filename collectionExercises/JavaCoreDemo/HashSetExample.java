import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store integers
        Set<Integer> numbers = new HashSet<>();

        // Add elements to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Adding a duplicate element
        numbers.add(40);
        numbers.add(20);

        

        // Get the size of the HashSet
        int size = numbers.size();
        System.out.println("Size of the HashSet: " + size);

        // Iterate over the elements in the HashSet
        System.out.println("Elements in the HashSet:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Remove an element from the HashSet
        boolean removed = numbers.remove(20);
        System.out.println("Is 20 removed? " + removed);
        System.out.println("Updated HashSet: " + numbers);

        // Check if the HashSet contains a specific element
        boolean contains = numbers.contains(10);
        System.out.println("Does the HashSet contain 10? " + contains);

        // Clear all elements from the HashSet
        numbers.clear();
        System.out.println("Size of the HashSet after clearing: " + numbers.size());
    }
}
