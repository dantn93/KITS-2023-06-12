public class ArraysExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {5, 2, 8, 1, 10};

        // Accessing elements in the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modifying elements in the array
        numbers[2] = 15;
        System.out.println("Updated third element: " + numbers[2]);

        // Iterating over the array using a for loop
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Sorting the array in ascending order
        java.util.Arrays.sort(numbers);
        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Searching for an element in the array using binary search
        int searchElement = 8;
        int index = java.util.Arrays.binarySearch(numbers, searchElement);
        System.out.println("Index of " + searchElement + ": " + index);

        // Creating an array of strings
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        System.out.print("Array of names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
