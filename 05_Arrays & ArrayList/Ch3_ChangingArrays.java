import java.util.Scanner;
import java.util.Arrays;

public class Ch3_ChangingArrays {
    public static void main(String[] args) {
        int[] originalArray = { 1, 5, 2, 7, 2, 7, 8 };
        System.out.println("Your current array is: ");
        System.out.println(Arrays.toString(originalArray));

        Scanner input = new Scanner(System.in);
        System.out.println("Which element do you want to chnage?: ");
        int index = input.nextInt();
        System.out.println("What is the new value of that element?: ");
        int value = input.nextInt();

        change(originalArray, index, value);
        System.out.println("Updated array:");
        System.out.println(Arrays.toString(originalArray)); 

        input.close();

    }
    
    public static void change(int[] arr, int i, int v) {
        arr[i] = v;
    }
}
