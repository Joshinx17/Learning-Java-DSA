import java.util.Scanner;

public class MulCalc {
    public static int Multiply(int a, int b) {
        //int prod = a * b;
        return a * b;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number ");
        int b = sc.nextInt();

        System.out.println("Product is " + Multiply(a, b));

        sc.close();
    }
}
