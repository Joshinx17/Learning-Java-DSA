import java.util.ArrayList; // Don't forget to import ArrayList!

public class Ch11_IntegerArrayListExample {

    public static void main(String[] args) {

        // 1. Declare and initialize an ArrayList to store Integer objects
        // The <Integer> specifies that this list will hold Integer types.
        ArrayList<Integer> scores = new ArrayList<>();

        System.out.println("Initial list: " + scores); // Output: Initial list: []
        System.out.println("Is list empty? " + scores.isEmpty()); // Output: Is list empty? true
        System.out.println("Size of list: " + scores.size()); // Output: Size of list: 0

        // 2. Add Integer elements to the ArrayList
        // Autoboxing: The 'int' values (95, 80, 72, 88) are automatically converted to Integer objects.
        scores.add(95);
        scores.add(80);
        scores.add(72);
        scores.add(88);
        scores.add(95); // ArrayList allows duplicate elements

        System.out.println("\nList after adding elements: " + scores); // Output: [95, 80, 72, 88, 95]
        System.out.println("Size of list: " + scores.size()); // Output: Size of list: 5

        // 3. Access elements by index
        // get(index) returns the Integer object at that position.
        int firstScore = scores.get(0); // Autounboxing: Integer object 95 is converted back to int.
        int thirdScore = scores.get(2);
        System.out.println("\nFirst score: " + firstScore);   // Output: First score: 95
        System.out.println("Third score: " + thirdScore);   // Output: Third score: 72

        // 4. Update an element at a specific index
        scores.set(1, 85); // Change the score at index 1 (originally 80) to 85
        System.out.println("List after updating index 1: " + scores); // Output: [95, 85, 72, 88, 95]

        // 5. Remove an element
        // You can remove by index or by object value.

        // Remove by index (removes the element at index 2, which is 72)
        scores.remove(2);
        System.out.println("List after removing element at index 2: " + scores); // Output: [95, 85, 88, 95]

        // Remove by object value (removes the first occurrence of 95)
        // Note: For primitives, you'd usually use Integer.valueOf(value) for clarity if you need to remove by value.
        // scores.remove(Integer.valueOf(95)); // Explicitly boxing
        scores.remove((Integer)95); // Casting to Integer to ensure remove(Object) is called, not remove(int index)
        System.out.println("List after removing the first 95: " + scores); // Output: [85, 88, 95]

        // 6. Check if an element exists
        boolean hasScore88 = scores.contains(88);
        boolean hasScore100 = scores.contains(100);
        System.out.println("\nDoes list contain 88? " + hasScore88);   // Output: true
        System.out.println("Does list contain 100? " + hasScore100); // Output: false

        // 7. Find the index of an element
        int indexOf85 = scores.indexOf(85);
        int indexOf95 = scores.indexOf(95); // Returns the first occurrence
        int indexOf100 = scores.indexOf(100); // Returns -1 if not found
        System.out.println("Index of 85: " + indexOf85); // Output: Index of 85: 0
        System.out.println("Index of 95: " + indexOf95); // Output: Index of 95: 2
        System.out.println("Index of 100: " + indexOf100); // Output: Index of 100: -1

        // 8. Iterate through the ArrayList using a for-each loop (enhanced for loop)
        System.out.println("\nScores in the list:");
        for (Integer score : scores) {
            System.out.println("Score: " + score);
        }

        // 9. Iterate using a traditional for loop (if you need the index)
        System.out.println("\nScores with index:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score at index " + i + ": " + scores.get(i));
        }

        // 10. Clear all elements from the ArrayList
        scores.clear();
        System.out.println("\nList after clearing: " + scores); // Output: []
        System.out.println("Size of list after clearing: " + scores.size()); // Output: Size of list after clearing: 0
        System.out.println("Is list empty after clearing? " + scores.isEmpty()); // Output: Is list empty after clearing? true
    }
}