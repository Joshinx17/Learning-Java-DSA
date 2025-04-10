//program to print how many times a digit repeats in a longer number
import java.util.Scanner;

public class HowManyTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a longer series of digits: ");
        int k = input.nextInt();
        System.out.print("Enter a digit to find: ");
        int n = input.nextInt();
        int count = 0;

        while (k > 0) {
            int digit = k % 10;
            if (digit == n) {
                count++;
            }
            k=k/10;
        }
        System.out.println(count);

        input.close();
    }
}
