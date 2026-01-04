import java.util.ArrayList;

public class Ch4_Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // char + char = ASCII number
        System.out.println("a" + "b"); // string + string = Concatination
        System.out.println('a' + "b"); // If of them is string then the whole thing becomes string + string = Concatination
        System.out.println('a'+ 3); // char + 3 = ASCII number of (a + 3 = d here)
        System.out.println((char) ('a' + 3)); // char + 3 = new char [TYPE CASTING]
        
        System.out.println("a" + 1); //Concatination But NOTE: Here the integer is converted to Integer and calls the .toString() method.
        //This will make the 1 to "1". Finally it becomes "a"+"1" = "a1", after concatination.

        System.out.println("John" + new ArrayList<>()); //here ArrayList's toString() method is called, which returns "[]".
        System.out.println("John" + new Integer(5)); //here Integer's toString() method is called, which returns "5".

        // System.out.println(new ArrayList<>() + new Integer(5)); //This will give error and says that "+" operator is not defined for ArrayList and Integer. 

        // *In java the operator "+" is only defined for String concatenation and primitive types, but not for objects like ArrayList or Integer.
        //Now see what happens when I add one String into this line of code.
        System.out.println(new ArrayList<>() +""+ new Integer(5));

        // ? The abilit of the "+" operator to do more then just addition is called "operator overloading". This feature is provided by Java itself within it. But in other languages like C++ or Python you can overload the "+" operator to do more than just addition any give it any desired functionality. But this creates confusion and makes the code less readable. So, Java does not allow operator overloading for user-defined classes.



    } 
}


