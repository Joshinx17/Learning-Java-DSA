import java.util.Scanner;
import java.util.Arrays;

public class Ch4_PrintingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Method 1: Using classic java for-loops
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //Method 2: Using enhanced for loop
        for (int nums : arr) {
            System.out.print(nums + " ");
        }

        System.out.println();

        //Method 3: Using .toString() Method
        System.out.print(Arrays.toString(arr));

        input.close();
    }
}
