import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character to check its case: ");
        char ch = input.next().charAt(0);
        
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("UPPERCASE");
        }
        input.close();
    }
}
