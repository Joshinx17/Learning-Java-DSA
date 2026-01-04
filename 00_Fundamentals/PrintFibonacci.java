import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        fibonacciSeries(num);

        sc.close();
    }

    static void fibonacciSeries(int number){
        int first = 0;
        int second = 1;
        for (int i = 1; i <= number; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
