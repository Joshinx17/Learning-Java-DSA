import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while (true) {
            System.out.print("Enter number for weekdays: ");
            int dayNum = sc.nextInt();
            switch (dayNum) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid Number");

            }
            if (dayNum == -1 || dayNum == 0) {
                break;
            }
        }

        sc.close();
    }
}
