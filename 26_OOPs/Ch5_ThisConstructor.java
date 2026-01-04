public class Ch5_ThisConstructor {
    public static void main(String[] args) {
        Student john = new Student(); // due to 'this' keyword in the empty constructor, the values of this reference variable has been auto assigned. Ready to call, no need to create. 
        
        john.name = "John Doe";
        System.out.println(john.name);

        Student mickey = new Student(17, "Mikey", 65); // using parameterized constructor directly assign values to the reference variable
        System.out.println(mickey.name);

    }
}
class Student {
    int rno;
    String name;
    float marks;    
    
    Student() { // when you call a constructor without values, it will print these values (auto-assign following values to all the referece called with this constructor)
        this.rno = 7;
        this.name = "Default Doe";
        this.marks = 100;
    }
    Student(int rollno, String name, float marks) { // when you call this constructor with 3 values, those values will be assigned to your reference variables. In this case the values are not pre defined.
        this.rno = rollno;
        this.name = name;
        this.marks = marks;
    }

}