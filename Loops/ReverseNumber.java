import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int OriginalNumber = input.nextInt();
        int ReverseNumber = 0;
        //int temp = 0;

        while (OriginalNumber > 0) {
            int digit = OriginalNumber % 10;
            ReverseNumber = ReverseNumber * 10 + digit;
            OriginalNumber = OriginalNumber / 10;
        }
        System.out.println("Reverse Number is: " + ReverseNumber);
        input.close();
    }
}
