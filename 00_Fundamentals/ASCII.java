import java.util.Scanner;

public class ASCII{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char letter = input.next().charAt(0);
        int asc = (int) letter;
        System.out.println("ASCII value of " + letter + " is " + asc + ".");

        input.close();
    }
}