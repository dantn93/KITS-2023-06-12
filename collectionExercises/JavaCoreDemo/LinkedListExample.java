import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> names = new LinkedList<>();

        // Add elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get the size of the LinkedList
        int size = names.size();
        System.out.println("Size of the LinkedList: " + size);

        // Access elements in the LinkedList
        String first = names.getFirst();
        String last = names.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Modify elements in the LinkedList
        names.set(1, "Eve");
        System.out.println("Modified LinkedList: " + names);

        // Iterate over the elements in the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (String name : names) {
            System.out.println(name);
        }

        // Remove an element from the LinkedList
        boolean removed = names.remove("Charlie");
        System.out.println("Is Charlie removed? " + removed);
        System.out.println("Updated LinkedList: " + names);

        // Check if the LinkedList contains a specific element
        boolean contains = names.contains("Bob");
        System.out.println("Does the LinkedList contain Bob? " + contains);

        // Clear all elements from the LinkedList
        names.clear();
        System.out.println("Size of the LinkedList after clearing: " + names.size());
    }
}
