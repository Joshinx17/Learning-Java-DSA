public class Ch2_UnderstandingConstructors {
    public static void main(String[] args) {
        Student john = new Student(); // constructor "Student()" is also a function.
        john.rno = 21;
        john.name = "John Doe";
        john.marks = 92.3f;
        // but this above process gets very repetitive.
        // Thats where the constructors comes to rescue.

        System.out.println(john.rno);
        System.out.println(john.name);
        System.out.println(john.marks);

        // Making a new object with constructor.
        Student jane = new Student();
        System.out.println(jane.rno);
        System.out.println(jane.name);
        System.out.println(jane.marks);



    }
    
}
class Student {
    int rno;
    String name;
    float marks;

    Student() {
        this.rno = 21;
        this.name = "John Doe";
        this.marks = 92.3f;
    }

}

