Lesson 31 - Array User Input

This lesson demonstrates how to create and fill an array using user input. It allows the program to store and display data entered by the user dynamically.

*Topics Covered*

- Declaring an array with a user-defined size
- Reading input using Scanner
- Storing and printing array elements
- Using for and for-each loops

Example Code
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What number of food do you want? ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            System.out.println(food);
        }

        scanner.close();
    }
}

Example Output
What number of food do you want? 3
Enter a food: pizza
Enter a food: burger
Enter a food: salad
pizza
burger
salad

&Notes*
You can also use a for-each loop to print the array elements more simply:

for (String food : foods) {
    System.out.println(food);
}
