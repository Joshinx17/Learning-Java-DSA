import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter number 1: ");
            int num1 = input.nextInt();
            System.out.println("Enter number 2: ");
            int num2 = input.nextInt();

            System.out.println("Enter an Operator- +, -, *, /, % : ");
            System.out.println("Enter x to Exit.");

            char op = input.next().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

            } else if (op == 'x' || op =='X') {
                break;
            }

            System.out.println(ans);
        }
        
        input.close();
    }
}
