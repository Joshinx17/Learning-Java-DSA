// Q1: write a java program to swap any element with another element on the list
import java.util.Arrays;

public class Q1_Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        swap(arr, 1, 3);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
        System.out.println(Arrays.toString(array)); 
    }
}