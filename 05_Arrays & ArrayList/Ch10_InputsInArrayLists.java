//In this we see a demo on how to enter values into the array list.
import java.util.ArrayList;
import java.util.Scanner;

public class Ch10_InputsInArrayLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        //Lets pre define a small list of a few elements, and rest of the elements will be added using loops and input.
        list.add(14);
        list.add(15);
        list.add(92);
        list.add(65);
        list.add(35);

        System.out.println(list);

        // How to take input for a set number of times and add it into the list.
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // How to print the individual elements in the list or a specific amount of elemets in the list without printing the whole list?
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
        input.close();
    }
}
