import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store student names and their corresponding scores
        Map<String, Integer> studentScores = new TreeMap<>();

        // Add elements to the TreeMap
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 90);

        // Get the size of the TreeMap
        int size = studentScores.size();
        System.out.println("Size of the TreeMap: " + size);

        // Access elements in the TreeMap
        int bobScore = studentScores.get("Bob");
        System.out.println("Bob's score: " + bobScore);

        // Check if the TreeMap contains a specific key
        boolean containsKey = studentScores.containsKey("Alice");
        System.out.println("Does the TreeMap contain key 'Alice'? " + containsKey);

        // Check if the TreeMap contains a specific value
        boolean containsValue = studentScores.containsValue(80);
        System.out.println("Does the TreeMap contain value 80? " + containsValue);

        // Iterate over the entries in the TreeMap
        System.out.println("Entries in the TreeMap:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println("Name: " + name + ", Score: " + score);
        }

        // Remove an entry from the TreeMap
        Integer removedScore = studentScores.remove("Charlie");
        System.out.println("Removed score for 'Charlie': " + removedScore);
        System.out.println("Updated TreeMap: " + studentScores);

        // Clear all entries from the TreeMap
        studentScores.clear();
        System.out.println("Size of the TreeMap after clearing: " + studentScores.size());
    }
}
