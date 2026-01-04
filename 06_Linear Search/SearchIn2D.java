// Java program to return the index value of a target number in 2D array. 
import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        int target = 99;

        int[] ans = findIn2D(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] findIn2D(int[][] array, int target) { // return-type of this function is array, not int.
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[] { row, col }; // therefore we return a new array
                }
            }
        }
        return new int[]{-1, -1}; //array return type
    }  
}
