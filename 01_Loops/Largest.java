import java.util.Scanner;

public class Largest {
    public static int largestNumber(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        return largest;
    }
    
    public static int maximumNumber(int a, int b, int c) {
        int max = Math.max(c, Math.max(a, b));
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Int: ");
        int a = input.nextInt();
        System.out.print("Enter Second Int: ");
        int b = input.nextInt();
        System.out.print("Enter Third Int: ");
        int c = input.nextInt();

        System.out.print("The largest of three is: " + maximumNumber(a, b, c));

        input.close();
    }
}
