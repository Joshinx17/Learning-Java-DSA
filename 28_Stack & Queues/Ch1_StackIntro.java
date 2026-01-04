// understanding basic push and pop operations
import java.util.Stack;
public class Ch1_StackIntro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // initialised as integer with generics
        stack.push(42);
        stack.push(39);
        stack.push(18);
        stack.push(4);
        stack.push(27);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
