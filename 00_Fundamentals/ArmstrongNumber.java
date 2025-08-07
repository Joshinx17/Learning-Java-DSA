import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int numberOfDigits = 0;

        // Count the number of digits
        int tempNum = num;
        while (tempNum != 0) {
            tempNum /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of digits raised to the power of numberOfDigits
        tempNum = num; // Reset tempNum to the original number
        while (tempNum != 0) {
            int digit = tempNum % 10;
            sum += Math.pow(digit, numberOfDigits);
            tempNum /= 10;
        }

        // Check if the sum equals the original number
        return sum == originalNumber;
    }
}
