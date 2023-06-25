import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store strings
        Set<String> names = new TreeSet<>();

        // Add elements to the TreeSet
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Bob"); // Adding a duplicate element

        // Get the size of the TreeSet
        int size = names.size();
        System.out.println("Size of the TreeSet: " + size);

        // Iterate over the elements in the TreeSet
        System.out.println("Elements in the TreeSet:");
        for (String name : names) {
            System.out.println(name);
        }

        // Remove an element from the TreeSet
        boolean removed = names.remove("Bob");
        System.out.println("Is Bob removed? " + removed);
        System.out.println("Updated TreeSet: " + names);

        // Check if the TreeSet contains a specific element
        boolean contains = names.contains("Alice");
        System.out.println("Does the TreeSet contain Alice? " + contains);

        // Clear all elements from the TreeSet
        names.clear();
        System.out.println("Size of the TreeSet after clearing: " + names.size());
    }
}
