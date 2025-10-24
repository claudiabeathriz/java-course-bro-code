import java.util.Scanner;
public class Variables {
    public static void main(String[] args){

        //This is my first Java program
        /*
            This
            is
            a
            multi-line
            comment
         */

        System.out.println("Hello, World!");
        System.out.print("I love pizza!\n");
        System.out.print("Buy me pizza!");
        System.out.println();

        /*variable = a reusable container for a value
                     a variable behaves as if it was the value it contains

         The general rules for naming variables are:
            Names can contain letters, digits, underscores, and dollar signs
            Names must begin with a letter
            Names should start with a lowercase letter, and cannot contain whitespace
            Names can also begin with $ and _
            Names are case-sensitive ("myVar" and "myvar" are different variables)
            Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */

        //primitive = simple value stored directly in memory (stack)
        //the stack is a fixed-size, fast memory region for automatically managed, short-lived local variables and function calls
        //LIFO(last-in, first-out; also, can cause stack overflow (memory)
        //int, double, char, boolean
        //reference = memory address (stack) that points to the (heap)
        //the heap is a larger, flexible memory region for dynamically allocated, long-lived data that must be manually managed
        //potential issues include memory leaks or fragmentation if not managed correctly
        //string, array, object

        /*steps to creating a variable:
        1. declaration
        2. assignment
         */

        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        /*camelCase is a naming convention used for writing identifiers
        like method names & variable names.
        In this, each word in the identifier starts with a capital letter
        and the first word starts with a lowercase letter.
         */
        boolean forSale = false;
        boolean isOnline = true;
        /*We don't typically output them directly to the console,
        we tend to use them more internally within the program.
         */

        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is " + gpa + ".");
        System.out.println("Your average letter grade is " + grade + ".");
        System.out.println("Your choice is a " + color + " " + year + " " + car + ".");
        System.out.println("The price is " + currency + price + ".");

        if(forSale){
            System.out.println("There is a" + car + " for sale.");
        }
        else {
            System.out.println("The " + car + " is not for sale.");
        }
    }
}
