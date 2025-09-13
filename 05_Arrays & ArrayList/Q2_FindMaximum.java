// Q2: Write a java program to find the largest element in the array.
public class Q2_FindMaximum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 8, 2, 9, 1 };

        System.out.println("Maximum value in this array is: " + findMax(arr));
        System.out.println("Maximum value in this range is: " + maxRange(arr, 0, 3));
    }

    public static int findMax(int[] array) { //this function gives you the maximum number in the array.
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    
    // Now create a function to give the maximum number in a particular range:
    public static int maxRange(int[] array, int start, int end) { 
        int maxValue = array[start];
        for (int i = start; i < end; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}
