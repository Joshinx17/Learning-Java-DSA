import java.util.Scanner;

public class Calculator {
    public static int AddNums(int a, int b) {
        return  a+b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        System.out.print("Enter another Number: ");
        int b = sc.nextInt();

        //int ans = AddNums(a, b);
        System.out.println("Your sum is " + AddNums(a,b));
        sc.close();
    }
}