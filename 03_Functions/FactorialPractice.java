import java.util.*;

public class FactorialPractice {
    
    public static int findFactorial(int num) {
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find Factorial for: ");
        int num = sc.nextInt();
        System.out.println(findFactorial(num));
        
        sc.close();
    }
}
