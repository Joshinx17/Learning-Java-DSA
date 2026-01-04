import java.util.Scanner;

public class Holidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number for weekdays: ");
            int dayNum = sc.nextInt();
            switch (dayNum) {
                case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
                case 6, 7 -> System.out.println("weekend");
                default -> System.out.println("Invalid Number");

            }
            if (dayNum == -1 || dayNum == 0) {
                break;
            }
        }
        sc.close();
    }
}
