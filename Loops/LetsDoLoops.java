//Printing n Numbers:
import java.util.Scanner;

public class LetsDoLoops{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Till where do you want to print natual Numbers: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        input.close();
    }
}

