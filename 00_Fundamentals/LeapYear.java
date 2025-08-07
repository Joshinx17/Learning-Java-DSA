
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Year: ");
        int year = sc.nextInt();
        sc.close();
        leapYear(year);
    }

    static void leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("Not leap");
                }
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("Not leap");
        }
    
    }
    
}
