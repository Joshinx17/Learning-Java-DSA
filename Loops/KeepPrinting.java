import java.util.Scanner;

public class KeepPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 0 to exit): ");
            int k = input.nextInt();


            if (k == 0) {
                System.out.println("Exiting the program.");
                break; 
            }

            System.out.println("Your number is " + k);    

        }

        // Close the Scanner
        input.close();
    }
}