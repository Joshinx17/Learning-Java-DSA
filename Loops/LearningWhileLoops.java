import java.util.Scanner;

public class LearningWhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        while (i<10) {
            System.out.print(i + " ");
            i++;
        }

        input.close();
    }
}