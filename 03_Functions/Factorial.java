import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int n, int factorial) {
       
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number to find factorial of ");
        int n = sc.nextInt();

        System.out.println("Your Factorial is " + findFactorial(n,1));
        sc.close();
    }
}

