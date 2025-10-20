import java.util.Scanner;
public class UserInput {
    public static void askAge(String[] args) {

        //scanner: object that allows user input in Java
        //         needs to be imported from utilities

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.println("What is your gpa?");
        double gpa = scanner.nextDouble();
        System.out.println("Your gpa is: " + gpa);

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student: " + isStudent);

        if (isStudent) {
            System.out.println("You are enrolled as a student.");
        } else {
            System.out.println("You are not enrolled as a student.");
        }

        System.out.println("Enter your age:");
        int newage = scanner.nextInt();
        scanner.nextLine();

        // we use scanner.nextLine() right after nextInt()
        // to "consume" the newline character (\n)
        // left in the input buffer when the user presses Enter (clean the buffer).
        // without this, the next nextLine() would read that empty \n
        // and it would look like the user didn't type anything.

        System.out.println("Enter your favorite color:");
        String color = scanner.nextLine();

        System.out.println("You are " + newage + " years old.");
        System.out.println("Your favorite color is " + color + " .");

        scanner.close();
    }
}
