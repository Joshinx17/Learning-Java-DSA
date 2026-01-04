//in this program we will learn to work with 2D arrays
import java.util.Scanner;
import java.util.Arrays;

public class Ch7_TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr2D = {
            {1,2,3},
            {2,4},
            {6,7,8,9}
        };

        for (int[] rows : arr2D) {
            System.out.println(Arrays.toString(rows));

        }

        int[][] arr = new int[3][3];
        System.out.println("Length of this 2D 3x3 array is: " + arr.length); //printing the length of 2D array will give you the number of rows
        
        //taking inputs in 2D array
        System.out.println("Enter 9 elements to your 3x3 array:- ");
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = input.nextInt();
            }
        }

        //printing output of 2D array with enhanced for loop
        for (int[] rows : arr) {
            System.out.println(Arrays.toString(rows));

        }

        input.close();

    }
}
