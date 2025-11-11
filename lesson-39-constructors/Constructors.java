import java.util.Scanner;

public class Constructors {
    public static void main(String[]args){

        //constructors = special method to initialize objects
        //               you can pass arguments to a constructor
        //               and set up initial values

        ConstructorsStudents student1 = new ConstructorsStudents("Spongebob", 30, 3.2, true);
        ConstructorsStudents student2 = new ConstructorsStudents("Patrick", 34, 1.5, true);
        ConstructorsStudents student3 = new ConstructorsStudents("Sandy", 27, 4.0, true);

        student1.study();
        student2.study();
        student3.study();

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
    }
}
