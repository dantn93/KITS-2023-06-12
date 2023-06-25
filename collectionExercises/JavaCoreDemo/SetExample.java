import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> fruits = new HashSet<>();

        // Add elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate elements are ignored

        // Get the size of the set
        int size = fruits.size();
        System.out.println("Size of the set: " + size);

        // Check if an element exists in the set
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Does the set contain 'Apple'? " + containsApple);

        // Iterate over the elements in the set
        System.out.println("Elements in the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an element from the set
        boolean removed = fruits.remove("Orange");
        System.out.println("Is 'Orange' removed? " + removed);
        System.out.println("Updated set: " + fruits);

        // Clear all elements from the set
        fruits.clear();
        System.out.println("Size of the set after clearing: " + fruits.size());
    }
}
