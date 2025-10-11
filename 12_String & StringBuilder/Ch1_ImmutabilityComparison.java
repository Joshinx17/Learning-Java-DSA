// Understaning the fundamentals of strings
public class Ch1_ImmutabilityComparison {
    public static void main(String[] args) {
        String a = "John";
        String b = "John";
        System.out.println(a); //First John will be printed
        a = "Doe";
        System.out.println(a); //Then Doe will be printed
        //But you know strings are immutable, then how did you assign two different objects to variable 'a' ???
        // The answer is, we created a new object and just pointed the reference variable to the new object while the previous object is still there in the heap memory, intact. 
        // Q. But now what will happen to that old unused object in the memory?? Answer: GARBAGE COLLECTION

        System.out.println(a==b); //This (comparison operator) will give true because both reference variables are pointing to the same object in the heap memory. [this basically checks if both the reference variables are pointing to the same object or not]
    }
}
