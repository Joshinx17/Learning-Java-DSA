//in this program, create a function to edit the values inside an existing array

import java.util.Arrays;

public class Ch5_PassingFunctions {
    public static void main(String[] args) {
        int[] arr = { 23, 78, 64, 77, 36, 84 };
        
        System.out.println("Your original array was: " + Arrays.toString(arr));
        
        changeTheElement(arr);
        System.out.println("Your updated array is: " + Arrays.toString(arr));

    }

    public static void changeTheElement(int[] array) {
        array[1] = 00;
    }
}
