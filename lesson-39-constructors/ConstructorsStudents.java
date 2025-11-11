import java.util.Scanner;

public class ConstructorsStudents {
        //students

        String name;
        int age;
        double gpa;
        boolean isEnrolled;

        ConstructorsStudents(String name, int age, double gpa, boolean isEnrolled){

            this.name = name;
            //this refers to the object we are currently working with or constructing
            this.age = age;
            this.gpa = gpa;
            this.isEnrolled = true;
        }

        void study(){
            System.out.println(this.name + " is studying");
        }
    }
