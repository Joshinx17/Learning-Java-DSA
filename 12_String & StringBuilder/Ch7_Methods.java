//in this chapter we learn to use some inbuilt methods of string. [Checkout methods of string form W3Schools](https://www.w3schools.com/java/java_ref_string.asp)
import java.util.Arrays;    
public class Ch7_Methods {
    public static void main(String[] args) {
         String name = "John Doe";
         System.out.println(Arrays.toString(name.toCharArray()));
         System.out.println(name.toLowerCase());
         System.out.println(name.indexOf('o'));
         System.out.println("    John    ".strip());
         System.out.println(Arrays.toString(name.split( " ")));
    }
}

