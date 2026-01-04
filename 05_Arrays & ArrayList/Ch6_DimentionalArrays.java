//Creating and taking input in 2D arrays:
import java.util.Scanner;
import java.util.Arrays;

public class Ch6_DimentionalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[][] arr = { {1,2,3},{4,5,6},{7,8,9} };
        int[][] arr = new int[3][3];

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = input.nextInt();
            }   
        }

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        

        input.close();
    }
}
