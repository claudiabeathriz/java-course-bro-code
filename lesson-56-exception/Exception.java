import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args){

        // exception = an event that interrupts the normal flow of a program
        //             (dividing by zero, file not found, mismatch input type)
        //             surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number!");
        }
        finally{
            scanner.close();
            System.out.println("This always execute.");
        }

        /*
        try{
            System.out.println(1/0);
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide by zero!");
        }
         */
    }
}
