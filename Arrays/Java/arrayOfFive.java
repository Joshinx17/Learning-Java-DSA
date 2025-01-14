import java.util.Scanner;   

public class arrayOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[5];

        System.out.println("Enter 5 Numbers: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        
        sc.close();

        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}



// If the elements of the arrayb was already given.

// public class arrayOfFive {
//     public static void main(String[] args) {
        
//         int[] array = {25, 42, 66, 18, 83, 27, 45};

//         System.out.println("The elements of the array are:");
//         for (int num : array) {
//             System.out.println(num);
//         }
//     }
// }
