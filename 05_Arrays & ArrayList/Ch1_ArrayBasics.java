import java.util.Scanner;
public class Ch1_ArrayBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        for (int num : arr) {   //using for - each loop
            System.out.print(num + " ");
        }

        input.close();
    }
}
