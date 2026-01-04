public class Ch3_This {
    public static void main(String[] args) {
        Student john = new Student();
        System.out.println(john.name);
        Student jane = new Student(); // currently all the values for 'jane' has been predefined by the 'this' keyword in constructor. 
        
        john.greeting(); // we'll see the working of 'this' keyword
        jane.greeting(); // because of the 'this' keyword used in the constructor below, the default value of any name is "John Doe"
        
        jane.name = "Jane Doe"; // but after I declared a value for the name (reference variable), that new name is assigned to it.
        jane.greeting();

    }
}
class Student {
    int rno;
    String name;
    float marks;

    Student() {
        this.rno = 21;
        this.name = "John Doe"; // the modificatin to 'this.name' happens here.
        this.marks = 92.3f;
    }

    void greeting() {
        System.out.println("Hello! My name is " + name); // both of these lines will print same thing.   
        System.out.println("Hello! My name is " + this.name); // this is similar to 'self' keyword in python.
    }
}

// The 'this' keyword is used when you automatically want to assign a value to your reference variable as soon as it's declared. For example, for every name you make like, Student john = new Student(); or Student jane = new Student(); and you want all the reference variable (names) to have roll number value set to '007', then you'll make under your constructor that: this.rollno = 007. Now everytime you print john.rollno or jane.rollno, it will return you '007'.