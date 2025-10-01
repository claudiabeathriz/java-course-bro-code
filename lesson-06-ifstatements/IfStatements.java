import java.util.Scanner;
public class IfStatements {
    public static void main(String[] args) {

        //if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println("Are you a student? (true/false)?");
        isStudent = scanner.nextBoolean();

        if (name.isEmpty()){
            System.out.println("You didn't write your name.");
        }
        else{
            System.out.println("Hello, " + name + "!");
        }

        if (age >= 65){
            System.out.println("You are a senior!");
        }
        else if (age >= 18){
            System.out.println("You are an adult!");
        }
        else if (age > 0){
            System.out.println("You are a child/teenager!");
        }
        else if (age == 0){
            System.out.println("You are a newborn!");
        }
        else {
            System.out.println("You haven't been born yet!");
        }

        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
}
