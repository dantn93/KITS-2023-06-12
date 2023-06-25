import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their corresponding IDs
        Map<String, Integer> studentMap = new HashMap<>();

        // Add elements to the HashMap
        studentMap.put("Alice", 1001);
        studentMap.put("Bob", 1002);
        studentMap.put("Charlie", 1003);

        // Get the size of the HashMap
        int size = studentMap.size();
        System.out.println("Size of the HashMap: " + size);

        // Access elements in the HashMap
        int aliceId = studentMap.get("Alice");
        System.out.println("Alice's ID: " + aliceId);

        // Check if the HashMap contains a specific key
        boolean containsKey = studentMap.containsKey("Bob");
        System.out.println("Does the HashMap contain key 'Bob'? " + containsKey);

        // Check if the HashMap contains a specific value
        boolean containsValue = studentMap.containsValue(1004);
        System.out.println("Does the HashMap contain value 1004? " + containsValue);

        // Iterate over the entries in the HashMap
        System.out.println("Entries in the HashMap:");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            String name = entry.getKey();
            int id = entry.getValue();
            System.out.println("Name: " + name + ", ID: " + id);
        }

        // Remove an entry from the HashMap
        Integer removedId = studentMap.remove("Bob");
        System.out.println("Removed ID for 'Bob': " + removedId);
        System.out.println("Updated HashMap: " + studentMap);

        // Clear all entries from the HashMap
        studentMap.clear();
        System.out.println("Size of the HashMap after clearing: " + studentMap.size());
    }
}
