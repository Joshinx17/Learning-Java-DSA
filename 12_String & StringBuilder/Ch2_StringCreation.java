// How to create different objects of same value
public class Ch2_StringCreation {
    public static void main(String[] args) {
        String a = new String("John");
        String b = new String("John");
        System.out.println(a == b); // Unlike the previous example, this time it will give false because both the objects are created seperately OUTSIDE the string pool. I.e now both the reference variables are not pointing to the same object. So here both a and b are pointing to their own versions of kunal in the heap memory(outside a common string pool).

        // Q. So now how do you check only the vlaues? Since in this case, despite both being "John" you still got a false.
        // Solution is: .equal() method.

        System.out.println(a.equals(b)); //this gives true.




    }
}
