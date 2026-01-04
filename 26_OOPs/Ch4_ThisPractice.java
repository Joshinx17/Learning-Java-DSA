public class Ch4_ThisPractice {
    public static void main(String[] args) {
        Student john = new Student();
		System.out.println(john.rollno);
		john.name = "John Doe";
        System.out.println(john.name);
        
        Student jane = new Student();
		System.out.println(jane.rollno);
        System.out.println(jane.name);
    }
}
class Student {
    int rollno;
    String name;
    float marks;
    
    Student() {
        this.rollno = 007;
    }
}

// Hence, here we see how this keyword is used to predefine the values of any declared reference variables.
