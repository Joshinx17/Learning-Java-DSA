//A function based program to find an element in the array
import java.util.Scanner;
public class FindTheElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 2, 4, 6, 8, 1, 3, 5, 7, };

        System.out.print("Enter the element that you want to find: ");
        int target = input.nextInt();
        findElement(arr, target);

        input.close();
    }

    public static void findElement(int[] array, int target) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.print("Element is at position: " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Not found");
        }
    }
    
}












