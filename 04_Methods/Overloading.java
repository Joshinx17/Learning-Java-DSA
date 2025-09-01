// Method Overloading is when 2 functions have the same name but different arguements.
public class Overloading {
    public static void main(String[] args) {
        fun(21);
        fun("John Doe");
    }

    static void fun(int a) {
        System.out.println(a);
    }
    
    static void fun(String a) {
        System.out.println(a);
    }
}
// Function/Method overloading happens at compile time. There it decides which fucntion to run according to the most appropriate arguments. 