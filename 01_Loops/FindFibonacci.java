import java.util.Scanner;

public class FindFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of fibonacci number to find: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);

/*          Using For Loop: 
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = b + a;
            a = temp;
            i++;
        }
        System.out.println(b); */
    
        input.close();
    }
}
