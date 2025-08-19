import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a fruit name: ");
        String fruit = input.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("The most popular one");
                break;
            case "Grapes":
                System.out.println("The legend");
                break;
            case "Orange":
                System.out.println("The kids favourite");
                break;
            default:
                System.out.println("Fruit Data Unavailable");
        }   

        input.close();
    }
}
