import java.util.*;

public class SayMyName {
    public static String printMyName(String name) {
        return name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Say my name: ");
        String yourName = sc.nextLine();
        if(yourName.equals("hisenberg")||yourName.equals("Hisenberg")){
            System.out.println("You're goddamn right! ");
        } else {
            System.out.println(printMyName(yourName));
        }
        sc.close();
    }
}
