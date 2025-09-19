// write a java program using searching algorithms to find the shortest element in the array.
public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28, 5 };
        System.out.println(smallestElement(arr));

    }

    static int smallestElement(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}