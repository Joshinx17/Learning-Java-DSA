import java.util.Scanner;

public class FruitsAdvanced {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a fruit name: ");
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("The most popular one");
            case "Grapes" -> System.out.println("The legend");
            case "Orange" -> System.out.println("The kids favourite");
            default -> System.out.println("Fruit Data Unavailable");
        }

        input.close();
    }
}
