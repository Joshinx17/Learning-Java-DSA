import java.util.Arrays;

public class Ch1_Intro {   //in object oriented programming, an object is an instance of a class. 
    public static void main(String[] args) {
        Student[] student = new Student[5];
        System.out.println(Arrays.toString(student));

        // Student john;
        // john = new Student();
        Student john = new Student(); // Above two lines can be written in one, like this.
        System.out.println(john); //this will just print some garbage values.

        // Trial 1: Without initializing
        System.out.println(john.rno);
        System.out.println(john.name);
        System.out.println(john.marks);

        // Initializing now:
        john.rno = 21;
        john.name = "John Doe";
        john.marks = 92.3f;

        // Trail 2: Printing again, after initializing
        System.out.println(john.rno);
        System.out.println(john.name);
        System.out.println(john.marks);

    }
}
class Student {
    int rno;
    String name;
    float marks;
}


// A class is a template of an object.
// An object is an instance of a class.
// Objects are stored in the heap memeory.
// The reference variables are stored in the stack memory.